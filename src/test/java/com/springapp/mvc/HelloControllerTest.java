package com.springapp.mvc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ModelMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class HelloControllerTest {
    private HelloController helloController;
    private ModelMap modelMap;

    @Before
    public void setUp() throws Exception {
        helloController = new HelloController();
        modelMap = mock(ModelMap.class);
    }

    @Test
    public void printWelcome() throws Exception {
        assertTrue(helloController.printWelcome(modelMap).equals("hello"));
    }

}