package com.javalec.fourthex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        // AnnotationConfigApplicationContext extends GenericXmlApplicationContext we already used in first~third example.
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Student student1 = ctx.getBean("student1", Student.class);
        System.out.println(student1.getAge());
        System.out.println(student1.getName());
        System.out.println(student1.getHobbys());
        System.out.println(student1.getHeight());
        System.out.println(student1.getWeight());

        Student student2 = ctx.getBean("student2", Student.class);
        System.out.println(student2.getAge());
        System.out.println(student2.getName());
        System.out.println(student2.getHobbys());
        System.out.println(student2.getHeight());
        System.out.println(student2.getWeight());

        // combine xml and java IoC container. (Java is inserted into Xml)
        AbstractApplicationContext combineCtx = new GenericXmlApplicationContext("classpath:applicationCTXGettingJava.xml");
        Student student3 = combineCtx.getBean("student3", Student.class);
        System.out.println(student3.getAge());
        System.out.println(student3.getName());
        System.out.println(student3.getHobbys());
        System.out.println(student3.getHeight());
        System.out.println(student3.getWeight());

        Student student4 = combineCtx.getBean("student4", Student.class);
        System.out.println(student4.getAge());
        System.out.println(student4.getName());
        System.out.println(student4.getHobbys());
        System.out.println(student4.getHeight());
        System.out.println(student4.getWeight());

        // combine xml and java IoC container. (Xml is inserted into Java)
        AbstractApplicationContext combineCtx2 = new AnnotationConfigApplicationContext(ApplicationConfigGettingXml.class);
        Student student5 = combineCtx2.getBean("student5", Student.class);
        System.out.println(student5.getAge());
        System.out.println(student5.getName());
        System.out.println(student5.getHobbys());
        System.out.println(student5.getHeight());
        System.out.println(student5.getWeight());

        Student student6 = combineCtx2.getBean("student6", Student.class);
        System.out.println(student6.getAge());
        System.out.println(student6.getName());
        System.out.println(student6.getHobbys());
        System.out.println(student6.getHeight());
        System.out.println(student6.getWeight());

        // container destroy. bean also are destroyed. (If you want to remove only some bean, use `student.destroy()`.
        ctx.close();
        combineCtx.close();
        combineCtx2.close();
    }
}
