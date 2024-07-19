package com.demo1.productservices.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Mpc_category")
public class Category extends BaseModel {
private String name;
private String description;
}

