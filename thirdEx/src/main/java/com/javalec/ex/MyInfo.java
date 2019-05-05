package com.javalec.ex;

import java.util.ArrayList;

public class MyInfo {
    private String name;
    private double weight;
    private double height;
    private ArrayList<String> hobby;
    private BMICalculator bmiCalculator;

    public MyInfo (String name, double weight, double height, ArrayList<String> hobby, BMICalculator bmiCalculator) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.hobby = hobby;
        this.bmiCalculator = bmiCalculator;
    }

    public void getInfo () {
        bmiCalculator.bmiCalculation(this.weight, this.height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public ArrayList<String> getHobby() {
        return hobby;
    }

    public void setHobby(ArrayList<String> hobby) {
        this.hobby = hobby;
    }

    public BMICalculator getBmiCalculator() {
        return bmiCalculator;
    }

    public void setBmiCalculator(BMICalculator bmiCalculator) {
        this.bmiCalculator = bmiCalculator;
    }
}
