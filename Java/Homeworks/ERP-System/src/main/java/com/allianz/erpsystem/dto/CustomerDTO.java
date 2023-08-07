package com.allianz.erpsystem.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data
@Setter
public class CustomerDTO {

    private UUID uuid;
    private String name;
    private String surname;
    private String email;
    private String tc;

    public CustomerDTO() {

        this.uuid = UUID.randomUUID();
    }
}
