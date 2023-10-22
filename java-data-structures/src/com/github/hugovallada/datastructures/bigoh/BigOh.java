package com.github.hugovallada.datastructures.bigoh;

import static java.lang.System.out;

public class BigOh {

    public static void oN(int size) {
        for (int i = 0; i < size; i++) {
            out.println(i);
        }

        for (int j = 0; j < size; j++) {
            out.println(j);
        }
    }

    public static void oSquareTwo(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                out.printf("%s %s%n", i, j);
            }
        }
    }

    public static int oOne(int n) {
        return n + n;
    }
}
