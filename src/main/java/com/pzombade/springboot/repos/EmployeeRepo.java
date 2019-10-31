package com.pzombade.springboot.repos;

import com.pzombade.springboot.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee,Integer> {
}
