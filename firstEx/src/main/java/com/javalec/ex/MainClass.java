package com.javalec.ex;

public class MainClass {
    public static void main (String[] argv) {
        Calculation cal = new Calculation();
        cal.setFirstNum(1);
        cal.setSecondNum(2);

        cal.add();
        cal.sub();
        cal.mult();
        cal.div();
    }
}
