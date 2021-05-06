package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Type<E> {
    List<List<E>> combineWith(List<List<E>> B);

    default List<List<E>> wrap(final List<E> A, final List<List<E>> B) {
        List<List<E>> newList = new ArrayList<>();
        if (B.isEmpty()) {
            A.forEach(e -> newList.add(Collections.singletonList(e)));
            return newList;
        }

        for (E a : A) {
            for (List<E> b : B) {
                List<E> t = new ArrayList<>();
                t.add(a);
                t.addAll(b);
                newList.add(t);
            }
        }
        return newList;
    }
}
