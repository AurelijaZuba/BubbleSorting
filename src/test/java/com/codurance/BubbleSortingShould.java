package com.codurance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class BubbleSortingShould {


    @Test
    void return_empty_list() {
        BubbleSorting bubbleSorting = new BubbleSorting();

        List<Integer> actual = bubbleSorting.sort(new ArrayList<>());
        List<Integer> expected = new ArrayList<>();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void return_sorted_list_for_two_items() {
        BubbleSorting bubbleSorting = new BubbleSorting();

        List<Integer> actual = bubbleSorting.sort(asList(2, 1));
        List<Integer> expected = asList(1 ,2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void return_sorted_list_for_three_items() {
        BubbleSorting bubbleSorting = new BubbleSorting();

        List<Integer> actual = bubbleSorting.sort(asList(2, 1, 3));
        List<Integer> expected = asList(1 ,2, 3);

        assertThat(actual).isEqualTo(expected);
    }
}
