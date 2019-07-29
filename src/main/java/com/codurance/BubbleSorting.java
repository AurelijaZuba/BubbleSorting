package com.codurance;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class BubbleSorting {
    public List<Integer> sort(List<Integer> objects) {
        List<Integer> result = new ArrayList<>();

        if(objects.isEmpty()) {
            return objects;
        }

        if(objects.get(0) > objects.get(1)){
            result = asList(objects.get(1), objects.get(0));
        }

        return result;
    }
}
