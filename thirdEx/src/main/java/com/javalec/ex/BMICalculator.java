package com.javalec.ex;

public class BMICalculator {
    private double lowWeight;
    private double normalWeight;
    private double overWeight;
    private double obesity;

    public void bmiCalculation (double weight, double height) {
        double h = height / 100;
        double result = weight / (h*h);

        System.out.println("Bmi:" + result);
        if (result >= lowWeight && result < normalWeight) System.out.println("low weight");
        if (result >= normalWeight && result < overWeight) System.out.println("normal weight");
        if (result >= overWeight && result < obesity) System.out.println("over weight");
        if (result >= obesity) System.out.println("obesity");
    }

    public double getLowWeight() {
        return lowWeight;
    }

    public void setLowWeight(double lowWeight) {
        this.lowWeight = lowWeight;
    }

    public double getNormalWeight() {
        return normalWeight;
    }

    public void setNormalWeight(double normalWeight) {
        this.normalWeight = normalWeight;
    }

    public double getOverWeight() {
        return overWeight;
    }

    public void setOverWeight(double overWeight) {
        this.overWeight = overWeight;
    }

    public double getObesity() {
        return obesity;
    }

    public void setObesity(double obesity) {
        this.obesity = obesity;
    }
}
