package com.demo1.productservices.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Mpc_product")
public class Product extends BaseModel {
    private String title;
    private double price;
    @ManyToOne
    private Category category;
}
