package com.amigoscode.lectures;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lecture4 {

    @Test
    public void distinct() throws Exception{
        final List<Integer> numbers =
                ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9);

        List<Integer> distinctN = numbers.stream()
                .distinct()
                .toList();

        System.out.println(distinctN);

    }

    @Test
    public void distinctWithSet() throws Exception{
        final List<Integer> numbers =
                ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9);

        Set<Integer> set = new HashSet<>(numbers);

        System.out.println(set);
    }

}
