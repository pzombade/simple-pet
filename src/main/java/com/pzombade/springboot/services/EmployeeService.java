package com.pzombade.springboot.services;

import com.pzombade.springboot.model.Employee;

import java.util.Set;

public interface EmployeeService {

    public void save(Employee e);
    public Iterable<Employee> findAll();

    Employee findById(int id);
}
