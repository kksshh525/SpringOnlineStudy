package com.javalec.fourthex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;

@Configuration
@ImportResource("classpath:applicationCTXToBeUsedInJava.xml")
public class ApplicationConfigGettingXml {
    @Bean
    public Student student6 () {
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("baseball");

        Student student = new Student("javaGettingXml", 20, hobbys);
        student.setHeight(170);
        student.setWeight(50);

        return student;
    }
}
