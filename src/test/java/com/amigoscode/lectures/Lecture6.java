package com.amigoscode.lectures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Lecture6 {

    final Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;

    @Test
    public void findAny() throws Exception{
        Integer [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer any = Arrays.stream(numbers)
                .filter(numbersLessThan10)
                .findAny()
                .orElse(null);

        System.out.println(any);
    }

    @Test
    public void findFirst() throws Exception{
        Integer [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer first = Arrays.stream(numbers)
                .filter(numbersLessThan10)
                .findFirst()
                .orElse(null);

        System.out.println(first);
    }
}
