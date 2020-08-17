package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double loanBalance = amount + (amount * percent / 10) - salary;
        while (loanBalance > 0) {
            if (year > 1) {
                loanBalance = loanBalance + (loanBalance * percent / 10) - salary;
            }
            year++;
        }
        return year;
    }
}
