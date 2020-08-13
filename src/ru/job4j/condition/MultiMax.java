package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        boolean maximum = first > second;
        int result = maximum ? first : second;
        boolean maximum2 = result > third;
        result = maximum2 ? result : third;
        return result;
    }
}
