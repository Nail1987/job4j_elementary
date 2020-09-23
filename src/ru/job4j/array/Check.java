package ru.job4j.array;

public class Check {
    @SuppressWarnings("checkstyle:EmptyBlock")
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == false) {
                return false;
            }
        }

        return result;
    }
}
