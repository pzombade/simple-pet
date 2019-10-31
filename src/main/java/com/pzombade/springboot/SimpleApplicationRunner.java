package com.pzombade.springboot;

import com.pzombade.springboot.model.Employee;
import com.pzombade.springboot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SimpleApplicationRunner {
    @Autowired
    EmployeeService es;

    @EventListener(ApplicationReadyEvent.class)
    public void run() throws Exception {
        System.out.println("################################################");
        System.out.println("################################################");
        System.out.println("################################################");
        System.out.println("################################################");
        System.out.println("Starting the application");
        es.save(Employee.builder().empNo(1).firstName("Prashant").lastName("Zombade").build());
        es.save(Employee.builder().empNo(2).firstName("Amol").lastName("Sonawane").build());
        es.save(Employee.builder().empNo(3).firstName("Yogesh").lastName("Chavhan").build());

    }
}
