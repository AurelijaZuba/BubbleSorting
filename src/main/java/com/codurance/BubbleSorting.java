package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class BubbleSorting {
    public List<Integer> sort(List<Integer> objects) {
        List<Integer> result = new ArrayList<>();

        if(objects.isEmpty()) {
            return objects;
        }

        final Integer itemB = objects.get(1);
        final Integer itemA = objects.get(0);
        if(shouldSwap(itemA, itemB)){
            result.add(itemB);
            result.add(itemA);
        }

        if(shouldSwap(itemA, itemB) && objects.size() == 3){
            result.add(objects.get(2));
        }

        return result;
    }

    private boolean shouldSwap(Integer integerA, Integer integerB) {
        return integerA > integerB;
    }
}
