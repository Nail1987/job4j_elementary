package ru.job4j.condition;

public class Point {
    public static  double distance(int x1,int y1,int x2,int y2){
        double rls = x2 - x1;
        double rls1 = y2 -y1;
        double first = Math.pow(rls,2);
        double second = Math.pow(rls1,2);
        double sum = first + second;
        double sqrt = Math.sqrt(sum);
        return sqrt;
    }

    public static void main(String[] args) {
        double result = Point.distance(0,0,2,0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
