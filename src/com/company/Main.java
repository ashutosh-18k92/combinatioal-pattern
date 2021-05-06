package com.company;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        new TypeA().combineWith(
                new TypeB().combineWith(
                        Collections.EMPTY_LIST))
                .forEach(System.out::println);
    }
}
