package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
      double h = p / (2 * (k + 1));
      double l = h * k;
      double rls2 = l * h;
      return  rls2;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println("p = 6, k = 2, s = 2,result =  " + result1);
    }
}
