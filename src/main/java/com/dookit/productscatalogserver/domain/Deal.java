package com.dookit.productscatalogserver.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity

@Getter
@Setter
public class Deal {
    @Id
    @GeneratedValue
    private UUID uuid;
    private Double discount;
    private Integer amount;
}
