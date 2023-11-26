package com.amigoscode.lectures;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Lecture10 {

    private static final List<ArrayList<String>> arraysListOfNames =
            Lists.newArrayList(
                    Lists.newArrayList("Mariam","Alex","Ismail"),
                    Lists.newArrayList("John","Alesha","Andre"),
                    Lists.newArrayList("Susy","Ali")
            );

    @BeforeEach
    public void setUp(){
        System.out.println(arraysListOfNames);
    }

    @Test
    public void withoutFlatMap() throws Exception {
        List<String> names = new ArrayList<>();
        for(List<String> list : arraysListOfNames){
            names.addAll(list);
        }
        System.out.println("the result");
        System.out.println(names);
    }

    @Test
    public void withFlatMap() throws Exception{
        List<String> flatted = arraysListOfNames.stream()
                 .flatMap(List::stream)
                .toList();

        System.out.println(flatted);
    }


}
