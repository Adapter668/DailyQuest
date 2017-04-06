package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Kontroler dla strony domowej
 */
@Controller
@RequestMapping("/")
public class HelloController {
    /**
     * Zwraca widok strony domowej
     * @param model model
     * @return widok strony domowej
     */
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
//		model.addAttribute("message", "Daily Quest");
		return "hello";
	}
}