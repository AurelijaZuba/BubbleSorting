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
            result = processItems(result, objects.get(0), objects.get(1));

        }

        if(objects.size() == 3) {
            result = processItems(result, objects.get(0), objects.get(1));

            result.add(objects.get(2));
        }

        if(objects.size() == 4) {
            result = processItems(result, objects.get(0), objects.get(1));

            result = processItems(result, objects.get(2), objects.get(3));
        }

        if(objects.size() == 5){
            result = processItems(result, objects.get(0), objects.get(1));

            result = processItems(result, objects.get(2), objects.get(3));

            result.add(objects.get(4));
        }

        return result;
    }

    private List<Integer> processItems(List<Integer> result, Integer itemA, Integer itemB) {
        if (shouldSwap(itemA, itemB)) {
            result.add(itemB);
            result.add(itemA);
        }
        return result;
    }

    private boolean shouldSwap(Integer integerA, Integer integerB) {
        return integerA > integerB;
    }
}
