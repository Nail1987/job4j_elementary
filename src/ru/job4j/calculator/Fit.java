package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height){
        double rls = (170 -100) * 1.15;
        return rls;
    }
    public  static double womanWeight (short height){
        double rls = (165- 110) * 1.15;
        return rls;
    }

    public static void main(String[] args) {
        short height = 170;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 170 is " + man);
        System.out.println("Woman 165 is " + woman);
    }

}
