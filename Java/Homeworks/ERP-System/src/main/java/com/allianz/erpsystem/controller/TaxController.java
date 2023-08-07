package com.allianz.erpsystem.controller;

import com.allianz.erpsystem.entity.TaxEntity;
import com.allianz.erpsystem.dto.TaxDTO;
import com.allianz.erpsystem.service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("tax")
public class TaxController {
    @Autowired
    TaxService taxService;

    @GetMapping
    public ResponseEntity<List<TaxEntity>> getAll() {
        return new ResponseEntity<>(taxService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/type-contains-{type}")
    public ResponseEntity<List<TaxEntity>> getAllByTypeIContains(@PathVariable String type) {
        return new ResponseEntity<>(taxService.getAllByTypeIContains(type), HttpStatus.OK);
    }

    @Modifying
    @Transactional
    @DeleteMapping("delete/{uuid}")
    public ResponseEntity<Boolean> deleteByUuid(@PathVariable UUID uuid) {
        return new ResponseEntity<>(taxService.deleteTax(uuid), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> createTax(@RequestBody TaxDTO taxDTO) {
        return new ResponseEntity<>(taxService.createTax(taxDTO.getType(), taxDTO.getPercent()), HttpStatus.CREATED);
    }

    @PutMapping("update/{uuid}")
    public ResponseEntity<Boolean> updateTax(@PathVariable UUID uuid, @RequestBody TaxDTO taxDTO) {
        TaxEntity taxEntity = new TaxEntity();
        taxEntity.setPercent(taxDTO.getPercent());
        taxEntity.setType(taxDTO.getType());
        return new ResponseEntity<>(taxService.updateTax(uuid, taxEntity), HttpStatus.OK);
    }

}
