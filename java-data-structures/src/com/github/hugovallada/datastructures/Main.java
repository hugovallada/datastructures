package com.github.hugovallada.datastructures;

import com.github.hugovallada.datastructures.bigoh.BigOh;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        BigOh.oN(10);
        BigOh.oSquareTwo(10);
        out.println(BigOh.oOne(20));
    }
}