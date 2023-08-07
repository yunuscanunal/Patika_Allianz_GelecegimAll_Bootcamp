package com.allianz.erpsystem.service;

import com.allianz.erpsystem.entity.TaxEntity;
import com.allianz.erpsystem.entity.ProductEntity;
import com.allianz.erpsystem.repository.TaxRepository;
import com.allianz.erpsystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    TaxRepository taxRepository;

    // Method to create a new product with the provided information
    public boolean createProduct(String name, Boolean isTaxApplied, BigDecimal price,
                                 Integer stock, TaxEntity tax) {
        if (name == null || isTaxApplied == null || price == null || stock == null ||
                tax == null) return false;
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(name);
        productEntity.setIsTaxApplied(isTaxApplied);
        productEntity.setPrice(price);
        productEntity.setStock(stock);
        productEntity.setTax(taxRepository.findByUuid(tax.getUuid()));
        productEntity.setOrderCount(1);
        taxTruePrice(productEntity);
        productRepository.save(productEntity);
        return true;
    }

    // Method to get all products from the database
    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }

    // Method to delete a product with the specified UUID
    public boolean deleteProduct(UUID uuid) {
        if (uuid == null) return false;
        productRepository.deleteByUuid(uuid);
        return true;
    }

    // Method to get a product by its UUID
    public ProductEntity getByUuid(UUID uuid) {
        return productRepository.findByUuid(uuid);
    }

    // Method to get products whose name contains the specified search string (case-insensitive)
    public List<ProductEntity> getAllByNameIContains(String name) {
        return productRepository.findAllByNameContainsIgnoreCase(name);
    }

    // Method to update an existing product with the provided information using the provided UUID
    public boolean updateProduct(UUID uuid, ProductEntity productEntity) {
        if (uuid == null || productEntity == null) return false;
        ProductEntity product = productRepository.findByUuid(uuid);
        if (product == null) return false;
        product.setName(productEntity.getName());
        product.setTax(productEntity.getTax());
        product.setPrice(productEntity.getPrice());
        product.setIsTaxApplied(productEntity.getIsTaxApplied());
        product.setNonTaxAppliedPrice(productEntity.getNonTaxAppliedPrice());
        product.setStock(productEntity.getStock());
        productRepository.save(product);
        return true;
    }

    // Method to calculate the true price of a product after applying or removing KDV
    public void taxTruePrice(ProductEntity product) {
        BigDecimal tax = product.getTax().getPercent();
        BigDecimal price = product.getPrice();
        BigDecimal totalPrice;
        BigDecimal taxPrice;
        if (!product.getIsTaxApplied()) {
            product.setNonTaxAppliedPrice(price);
            taxPrice = (price.multiply(tax)).divide(new BigDecimal(100), MathContext.DECIMAL32);
            totalPrice = price.add(taxPrice);
            product.setPrice(totalPrice);
        } else {
            totalPrice = price;
            BigDecimal nonTaxPrice = (totalPrice.multiply(new BigDecimal(100))).divide((new BigDecimal(100)).add(tax),
                    MathContext.DECIMAL32);
            taxPrice = totalPrice.subtract(nonTaxPrice);
            product.setNonTaxAppliedPrice(nonTaxPrice);
        }
    }
}
