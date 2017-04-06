package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Kontroler dla widoku aplikacji
 */
@Controller
@RequestMapping("/app")
public class AppController {
    /**
     * Zwraca widok aplikacji
     * @param model model
     * @return glowny widok aplikacji
     */
    @RequestMapping(method = RequestMethod.GET)
    public String sendAppView(ModelMap model) {
        return "app";
    }
}