package com.allianz.erpsystem.repository;

import com.allianz.erpsystem.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    List<CustomerEntity> findAllByNameContainsIgnoreCase(String name);
    void deleteByUuid(UUID uuid);
    CustomerEntity findByUuid(UUID uuid);

}
