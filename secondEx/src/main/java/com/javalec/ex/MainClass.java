package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main (String[] args) {

        String configLocation = "classpath:applicationCTX.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
        // Same below!
//        AbstractApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.load(configLocation);
//        ctx.refresh();
        MyCalculator myCal = ctx.getBean("myCalculator", MyCalculator.class);

        myCal.add();
        myCal.sub();
        myCal.mul();
        myCal.div();
    }
}
