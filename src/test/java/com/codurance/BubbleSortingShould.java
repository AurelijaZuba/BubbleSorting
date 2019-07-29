package com.codurance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BubbleSortingShould {


    @Test
    void return_empty_list() {
        BubbleSorting bubbleSorting = new BubbleSorting();

        List<Integer> actual = bubbleSorting.sort(new ArrayList<>());
        List<Integer> expected = new ArrayList<>();

        assertThat(actual).isEqualTo(expected);
    }
}
