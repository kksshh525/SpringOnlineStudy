package com.javalec.form_data_validation_ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return Student.class.isAssignableFrom(aClass); // Type of class to be validated
    }

    public void validate(Object o, Errors errors) {
        System.out.println("validate()");
        Student student = (Student)o;

        String name = student.getName();
        if(name == null || name.trim().isEmpty()) { errors.rejectValue("name", "trouble"); }

        int id = student.getId();
        if(id == 0) {errors.rejectValue("id","trouble"); }
    }
}
