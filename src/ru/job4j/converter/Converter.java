package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rls = value / 70;
        return rls;
    }

    public static int rubleToDollar(int value) {
        int rls = value / 60;
        return rls;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(70);
        int dollar = Converter.rubleToDollar(60);
        System.out.println("70 rubles are " + euro  + " euro");
        System.out.println("60 rubles are " + dollar  + " dollar");
    }
}
