package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class BubbleSorting {
    public List<Integer> sort(List<Integer> objects) {
        List<Integer> result = new ArrayList<>();

        if(objects.isEmpty()) {
            return objects;
        }

        if(objects.size() == 2) {
            Integer itemA = objects.get(0);
            Integer itemB = objects.get(1);

            if(shouldSwap(itemA, itemB)) {
                result.add(itemB);
                result.add(itemA);
            }

        }

        if(objects.size() == 3) {
            Integer itemA = objects.get(0);
            Integer itemB = objects.get(1);

            if(shouldSwap(itemA, itemB)) {
                result.add(itemB);
                result.add(itemA);
            }

            result.add(objects.get(2));
        }

        if(objects.size() == 4) {
            Integer itemA = objects.get(0);
            Integer itemB = objects.get(1);

            if(shouldSwap(itemA, itemB)) {
                result.add(itemB);
                result.add(itemA);
            }

            Integer itemC = objects.get(2);
            Integer itemD = objects.get(3);

            if(shouldSwap(itemC, itemD)) {
                result.add(itemD);
                result.add(itemC);
            }
        }

        return result;
    }

    private boolean shouldSwap(Integer integerA, Integer integerB) {
        return integerA > integerB;
    }
}
