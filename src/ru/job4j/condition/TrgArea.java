package ru.job4j.condition;

public class TrgArea {
    public static double area (double a, double b, double c){
        double rls = (a + b + c)/2;
        double p = 3.0; // Мы нашли полуперимтр
        double rls1 = p * ((p - a) * (p - b) * (p - c));
        double four = Math.sqrt(9);
        return  four;

    }

    public static void main(String[] args) {
        double result = TrgArea.area(2,2,2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
