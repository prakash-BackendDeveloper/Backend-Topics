package com.demo1.productservices.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreDto {
    private long id;
    private double price;
    private String title;
    private String category;
    private String description;
    private String image;
}
