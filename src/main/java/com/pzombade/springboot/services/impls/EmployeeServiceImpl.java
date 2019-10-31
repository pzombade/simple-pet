package com.pzombade.springboot.services.impls;

import com.pzombade.springboot.model.Employee;
import com.pzombade.springboot.repos.EmployeeRepo;
import com.pzombade.springboot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public void save(Employee e) {
        employeeRepo.save(e);
    }

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepo.findAll();
    }

    public Employee findById(int id) {
        return employeeRepo.findById(id).get();
    }


}
