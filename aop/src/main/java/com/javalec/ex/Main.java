package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
        Student student = ctx.getBean("student", Student.class);
        student.getStudentInfo();

        Worker worker = ctx.getBean("workder", Worker.class);
        worker.getWorkerInfo();

        ctx.close();
    }
}
