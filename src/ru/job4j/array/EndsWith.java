package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {

        boolean result = true;
        for (int i = post.length - 1; i >= 0; i--) {
            for (int j = word.length - 1; j >= 0; j--) {
                if (post[post.length - 1] != word[word.length - 1]) {
                    result = false;
                    break;
            }
                        }
        }
        return result;
    }
}
