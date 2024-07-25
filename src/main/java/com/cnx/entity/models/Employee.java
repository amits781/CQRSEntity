package com.cnx.entity.models;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Data
public class Employee implements Serializable {
    private int id;
    private String name;
    private int age;
    private String department;
}