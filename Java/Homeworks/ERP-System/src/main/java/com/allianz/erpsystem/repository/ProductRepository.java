package com.allianz.erpsystem.repository;

import com.allianz.erpsystem.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<BaseEntity, Long> {
    List<BaseEntity> findAllByNameContainsIgnoreCase(String name);
    void deleteByUuid(UUID uuid);
    BaseEntity findByUuid(UUID uuid);

}
