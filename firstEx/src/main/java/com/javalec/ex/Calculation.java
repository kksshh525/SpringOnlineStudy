package com.javalec.ex;

public class Calculation {
    private int firstNum;
    private int secondNum;

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;

    }

    public int getSecondNum() {
        return secondNum;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void add() {
        System.out.println("add()");
        System.out.println("result:"+(firstNum+secondNum));
    }

    public void sub() {
        System.out.println("sub()");
        System.out.println("result:"+(firstNum-secondNum));
    }

    public void mult() {
        System.out.println("mul()");
        System.out.println("result:"+(firstNum*secondNum));
    }

    public void div(){
        System.out.println("div()");
        System.out.println("result:"+(firstNum/secondNum));
    }
}
