package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Kontroler dla logowania
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    /**
     * Zwraca widok strony domowej
     * @param model model
     * @return widok strony domowej
     */
    @RequestMapping(method = RequestMethod.GET)
    public String sendRegisterView(ModelMap model) {
        return "hello";
    }

    /**
     * Logowanie uzytkownika
     * @param name nazwa logujacego sie uzytkownika
     * @param pwd haslo logujacego sie uzytkownika
     * @return widok strony domowej
     */
    @RequestMapping(method = RequestMethod.POST)
    public String submitLogin(@RequestParam String name, @RequestParam String pwd){
        System.out.println("Login:\n" + name + "\n" + pwd);
        return "hello"; //TODO: encryption, redirect to actual app page
    }
}