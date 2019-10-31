package com.pzombade.springboot;

import com.pzombade.springboot.model.Employee;
import com.pzombade.springboot.services.EmployeeService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping({"","/"})

public class MainController {

    @Value("${app.messages.info}")
    String appInfo;

    EmployeeService employeeService;

    public MainController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

//    @GetMapping({"/emp/{id}","emp/{id}"})
//    public Employee findById(@PathVariable("id") int id){
//        return employeeService.findById(id);
//    }

    @GetMapping({"/emp/{id}","emp/{id}"})
    public ModelAndView findByIdDummy(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView();
        Employee employee =  employeeService.findById(id);
        mv.addObject("employee",employee);
        System.out.println("View "+employee);
        mv.setViewName("emp/view");
        return mv;
    }

    @GetMapping("/emp")
    public ModelAndView getAllEmployees(){
        ModelAndView mv = new ModelAndView();
        Iterable<Employee> allEmps =  employeeService.findAll();
        mv.addObject("allEmps",allEmps);
        System.out.println("List "+allEmps);
        mv.setViewName("emp/list");
        return mv;
    }

    @PostMapping("/emp")
    public void saveEmployees(Employee e){
        employeeService.save(e);
    }

    @GetMapping
    public String getAppInfo(){
        return  "/emps";
    }
}
