package com.springapp.mvc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ModelMap;

import java.sql.SQLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class LoginControllerTest {
    private LoginController loginController;
    private ModelMap modelMap;

    @Before
    public void setUp() throws Exception {
        loginController = new LoginController();
        modelMap = mock(ModelMap.class);
    }

    @Test
    public void sendRegisterView() {
        assertTrue(loginController.sendRegisterView(modelMap).equals("hello"));
    }

    @Test
    public void submitLogin() {
        //assertTrue(loginController.submitLogin("asdf", "asdf").equals("hello"));
    }

    @Test
    public void loadDatabase() throws ClassNotFoundException, SQLException {
        //loginController.loadDataBase("asdf", "asdf");
    }

    @Test
    public void logowanieUzytkownika() throws SQLException {

    }

}