package com.pzombade.springboot;

import com.pzombade.springboot.services.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockReset;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;






@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class MainControllerTest {

    @InjectMocks
    MainController mainController;


    @Mock
    EmployeeService employeeService;

    MockMvc mvc;

    @BeforeEach
    public void beforeEach(){
        mvc = MockMvcBuilders.standaloneSetup(MainController.class).build();
    }

    @Test
    void findById() {
       // mvc.perform(MockMvcRequestBuilders.get("/emp")).andExpect()
    }

    @Test
    void getAllEmployees() {
    }

    @Test
    void saveEmployees() {
    }

    @Test
    void getAppInfo() {
    }
}