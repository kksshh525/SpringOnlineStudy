package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main (String[] args) {
        String configLoc = "classpath:applicationCTX.xml";
        String configLoc2 = "classpath:applicationCTXWithNameSpace.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc, configLoc2);
        MyInfo myInfo1 = ctx.getBean("myInfo1", MyInfo.class);
        MyInfo myInfo2 = ctx.getBean("myInfo2", MyInfo.class);
        MyInfo myInfo3 = ctx.getBean("myInfo3", MyInfo.class);

        myInfo1.getInfo();
        myInfo2.getInfo();
        myInfo3.getInfo();

        Pencil pencil = ctx.getBean("pencil", Pencil.class);
        pencil.use();
        ctx.close();
    }
}
