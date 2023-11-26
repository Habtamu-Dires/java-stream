package com.amigoscode.lectures;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lecture3 {

    @Test
    public void min() throws Exception{
      final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
        Integer min = numbers.stream()
                .min((x,y)-> x < y ? -1 : 1)
                .get();

        assert(min).equals(1);
        System.out.println(min);
    }

    @Test
    public void max() throws Exception{
        final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 93, 99);
        Integer max = numbers.stream()
                .max(Integer::compareTo)
                .get();

        assert(max).equals(100);
        System.out.println(max);
    }
}
