package com.codurance;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class BubbleSortingShould {


    @ParameterizedTest
    @MethodSource("bubbleSortListProvider")
    void sortsListOfIntegers(List<Integer> input, List<Integer> expected){
        BubbleSorting bubbleSorting = new BubbleSorting();

        List<Integer> actual = bubbleSorting.sort(input);
        assertThat(actual).isEqualTo(expected);
    }


    private static Stream<Arguments> bubbleSortListProvider(){
            return Stream.of(Arguments.arguments(asList(), asList()),
                    Arguments.arguments(asList(2, 1), asList(1, 2)),
                    Arguments.arguments(asList(2, 1, 3), asList(1, 2, 3)),
                    Arguments.arguments(asList(2, 1, 4, 3), asList(1, 2, 3, 4)));
    }
}
