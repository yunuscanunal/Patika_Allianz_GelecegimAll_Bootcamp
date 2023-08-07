package com.allianz.erpsystem.repository;

import com.allianz.erpsystem.entity.TaxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TaxRepository extends JpaRepository<TaxEntity, Long> {
    List<TaxEntity> findAllByTypeContainsIgnoreCase(String type);

    void deleteByUuid(UUID uuid);

    TaxEntity findByUuid(UUID uuid);
}
