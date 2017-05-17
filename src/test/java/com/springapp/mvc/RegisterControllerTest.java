package com.springapp.mvc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ModelMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


public class RegisterControllerTest {
    private RegisterController registerController;
    private ModelMap modelMap;

    @Before
    public void setUp() throws Exception {
        registerController = new RegisterController();
        modelMap = mock(ModelMap.class);
    }

    @Test
    public void sendRegisterView() {
        assertTrue(registerController.sendRegisterView(modelMap).equals("register"));
    }

    @Test
    public void submit() {

    }

    @Test
    public void sendEmail() {

    }

    @Test
    public void loadDataBase() {

    }

    @Test
    public void rejestracjaUzytkownika() {

    }

}