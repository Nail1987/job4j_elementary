package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double heightMan) {
        double rls = (heightMan - 100) * 1.15;
        return rls;
    }

    public static double womanWeight(double heightWoman) {
        double rls = (heightWoman - 110) * 1.15;
        return rls;
    }

    public static void main(String[] args) {
        double heightMan = 170;
        double heightWoman = 165;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Man 170 is " + man);
        System.out.println("Woman 165 is " + woman);
    }

}
