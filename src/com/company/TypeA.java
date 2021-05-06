package com.company;

import java.util.Arrays;
import java.util.List;

public class TypeA implements Type<Integer>{
    static final List<Integer> A= Arrays.asList(0,1);

    @Override
    public List<List<Integer>> combineWith(List<List<Integer>> B) {
        return wrap(A,B);
    }
}
