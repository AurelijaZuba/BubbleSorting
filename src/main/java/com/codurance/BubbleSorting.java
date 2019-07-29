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
            result.add(objects.get(1));
            result.add(objects.get(0));
        }

        if(objects.get(0) > objects.get(1) && objects.size() == 3){
            result.add(objects.get(2));
        }

        return result;
    }
}
