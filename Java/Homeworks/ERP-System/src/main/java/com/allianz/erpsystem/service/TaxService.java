package com.allianz.erpsystem.service;

import com.allianz.erpsystem.entity.TaxEntity;
import com.allianz.erpsystem.repository.TaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
public class TaxService {
    @Autowired
    TaxRepository taxRepository;

    // Method to create a new KDV (Value Added Tax) entry with the given type and percentage
    public boolean createTax(String type, BigDecimal percent) {
        if (type == null || percent == null) return false;
        TaxEntity tax = new TaxEntity();
        tax.setType(type);
        tax.setPercent(percent);
        taxRepository.save(tax);
        return true;
    }

    // Method to get all KDV entries from the database
    public List<TaxEntity> getAll() {
        return taxRepository.findAll();
    }

    // Method to get KDV entries whose type contains the specified search string (case-insensitive)
    public List<TaxEntity> getAllByTypeIContains(String type) {
        return taxRepository.findAllByTypeContainsIgnoreCase(type);
    }

    // Method to delete a KDV entry with the specified UUID
    public boolean deleteTax(UUID uuid) {
        if (uuid == null) return false;
        taxRepository.deleteByUuid(uuid);
        return true;
    }

    // Method to update an existing KDV entry's type and percentage using the provided UUID
    public boolean updateTax(UUID uuid, TaxEntity tax) {
        if (uuid == null || tax == null) return false;
        TaxEntity taxEntity = taxRepository.findByUuid(uuid);
        if (taxEntity == null) return false;
        taxEntity.setType(tax.getType());
        taxEntity.setPercent(tax.getPercent());
        taxRepository.save(taxEntity);
        return true;
    }
}
