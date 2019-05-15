package com.javalec;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String hello (Model model) {
        String msg = "every one";
        model.addAttribute("message", msg);
        return "index";
    }
}
