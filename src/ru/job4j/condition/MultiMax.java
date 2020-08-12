package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        boolean maximum = first > second;
        int result = maximum ? first : second;
        boolean maximum2 = first > third;
        result = maximum2 ? first : third;
        boolean maximum3 = second > third;
        result = maximum3 ? second : third;
        return result;
    }
}
