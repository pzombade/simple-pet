package com.pzombade.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Builder
@AllArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;

    public Employee(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empNo;
}
