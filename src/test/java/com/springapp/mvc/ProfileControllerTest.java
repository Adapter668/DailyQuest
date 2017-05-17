package com.springapp.mvc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ModelMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by adapter on 17.05.17.
 */
public class ProfileControllerTest {

    private ProfileController profileController;
    private  ModelMap modelMap;

    @Before
    public void setUp() throws Exception {
        profileController = new ProfileController();
        modelMap = mock(ModelMap.class);
    }

    @Test
    public void sendProfileView() throws Exception {
        assertTrue(profileController.sendProfileView(modelMap).equals("profile"));
    }

}