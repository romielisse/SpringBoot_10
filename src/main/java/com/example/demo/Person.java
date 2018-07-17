package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Person {
    @Id
    @NotNull
    private long person_id;

    private String name;
    private String breed;
    private int age;
    private boolean dead;
}
