package com.company;

import java.util.Arrays;
import java.util.List;

public class TypeB implements Type<String>{

    static final List<String> A= Arrays.asList("A","B");
    @Override
    public List<List<String>> combineWith(List<List<String>> B) {
        return wrap(A,B);
    }
}
