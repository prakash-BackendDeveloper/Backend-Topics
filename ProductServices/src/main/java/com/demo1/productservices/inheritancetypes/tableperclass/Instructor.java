package com.demo1.productservices.inheritancetypes.tableperclass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="tpc_instructor")
public class Instructor extends User {

    private String subject;
}
