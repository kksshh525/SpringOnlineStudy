package com.javalec.fourthex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ApplicationConfigToBeUsedInXml {
    @Bean
    public Student student3 () {
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("baseball");

        Student student = new Student("insertedJava", 20, hobbys);
        student.setHeight(170);
        student.setWeight(50);

        return student;
    }
}
