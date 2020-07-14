package ru.job4j.condition;

public class SqArea {
    public static double square (int p, int k){
        double rls = p/( 2 * (k + 1));
        double h = 1.0;
        double rls1 = h * k;
        double L = 2.0;
        double rls2 = L * h;
        return  rls2;
    }

    public static void main(String[] args) {
        double result1= SqArea.square(6,2);
        System.out.println("p = 6, k = 2, s = 2,result =  " + result1);
    }
}
