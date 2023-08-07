package com.allianz.erpsystem.controller;

import com.allianz.erpsystem.entity.ProductEntity;
import com.allianz.erpsystem.dto.ProductDTO;
import com.allianz.erpsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAll() {
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/name-contains-{name}")
    public ResponseEntity<List<ProductEntity>> getProductByNameIContains(@PathVariable String name) {
        return new ResponseEntity<>(productService.getAllByNameIContains(name), HttpStatus.OK);
    }

    @GetMapping("get/{uuid}")
    public ResponseEntity<ProductEntity> getByUuid(@PathVariable UUID uuid) {
        return new ResponseEntity<>(productService.getByUuid(uuid), HttpStatus.OK);
    }

    @PutMapping("update/{uuid}")
    public ResponseEntity<Boolean> updateByUuid(@PathVariable UUID uuid, @RequestBody ProductDTO productDTO) {
        ProductEntity product = new ProductEntity();
        product.setName(productDTO.getName());
        product.setTax(productDTO.getTax());
        product.setNonTaxAppliedPrice(productDTO.getNonTaxAppliedPrice());
        product.setIsTaxApplied(productDTO.getIsTaxApplied());
        product.setPrice(productDTO.getPrice());
        product.setStock(productDTO.getStock());
        return new ResponseEntity<>(productService.updateProduct(uuid, product), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> createProduct(@RequestBody ProductDTO productDTO) {
        return new ResponseEntity<>(productService.createProduct(productDTO.getName(),
                productDTO.getIsTaxApplied(), productDTO.getPrice(),
                productDTO.getStock(), productDTO.getTax()), HttpStatus.CREATED);
    }

    @Modifying
    @Transactional
    @DeleteMapping("delete/{uuid}")
    public ResponseEntity<Boolean> deleteProduct(@PathVariable UUID uuid) {
        return new ResponseEntity<>(productService.deleteProduct(uuid), HttpStatus.OK);
    }
}
