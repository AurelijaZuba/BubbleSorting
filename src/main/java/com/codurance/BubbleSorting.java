package com.codurance;

import java.util.List;

public class BubbleSorting {


    public List<Integer> sort(List<Integer> objects) {
        if(objects.isEmpty()) {
            return objects;
        }


        for (int i = 0; i < objects.size() -1; i++) {

            Integer itemA = objects.get(i);
            Integer itemB = objects.get(i + 1);
            if(shouldSwap(itemA, itemB))
            {
                swapItems(objects, i);
            }
        }

        return objects;
    }

    private void swapItems(List<Integer> objects, int index) {
        Integer tempVar = objects.get(index+1);

        objects.set(index+1, objects.get(index));
        objects.set(index, tempVar);
    }

    private boolean shouldSwap(Integer integerA, Integer integerB) {
        return integerA > integerB;
    }
}
