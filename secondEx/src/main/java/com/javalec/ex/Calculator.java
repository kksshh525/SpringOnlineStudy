package com.javalec.ex;

public class Calculator {
    public void addition (int f, int s) {
        System.out.println("addition()");
        int result = f+s;
        System.out.println(f + "+" + s + "=" + result);
    }
    public void subtraction (int f, int s) {
        System.out.println("subtraction()");
        int result = f-s;
        System.out.println(f + "-" + s + "=" + result);
    }
    public void multiply (int f, int s) {
        System.out.println("multiply()");
        int result = f*s;
        System.out.println(f + "*" + s + "=" + result);
    }
    public void division (int f, int s) {
        System.out.println("division()");
        int result = f/s;
        System.out.println(f + "/" + s + "=" + result);
    }
}