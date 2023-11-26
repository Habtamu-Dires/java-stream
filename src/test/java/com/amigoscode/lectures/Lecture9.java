package com.amigoscode.lectures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Lecture9 {

    @Test
    public void reduce() throws Exception {
        Integer[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};

        Integer sum = Arrays.stream(integers)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }


}