package com.javalec.fourthex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ApplicationConfig {

    @Bean
    public Student student1 () {
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("Swimming");
        hobbys.add("cook");

        Student student = new Student("hong", 20, hobbys);
        student.setHeight(178);
        student.setWeight(70);

        return student;
    }

    @Bean
    public Student student2 () {
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("readBook");
        hobbys.add("listenMusic");

        Student student = new Student("Kim", 20, hobbys);
        student.setHeight(160);
        student.setWeight(50);

        return student;
    }
}
