package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double halfPerimetr = (a + b + c) / 2;
        double value = halfPerimetr * (halfPerimetr - a) * (halfPerimetr - b) * (halfPerimetr - c);
        double sqrt = Math.sqrt(value);
        return sqrt;
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
