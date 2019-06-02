package com.javalec.form_data_validation_ex;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class StudentController {
    @RequestMapping("/studentForm")
    public String studentForm() {
        return "createPage";
    }

    @RequestMapping("/student/create")
    public String studentCreate(@ModelAttribute("student") @Valid Student student, BindingResult result) {
        String page = "createDonePage";

        // It can be replaced by @Valid
        // StudentValidator validator = new StudentValidator();
        // validator.validate(student, result);
        if(result.hasErrors()) page = "createPage";

        return page;
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new StudentValidator());
    }
}
