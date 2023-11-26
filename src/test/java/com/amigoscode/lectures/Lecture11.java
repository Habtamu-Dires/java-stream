package com.amigoscode.lectures;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture11 {

    @Test
    public void joiningStrings() throws Exception{
        List<String> names = List.of("anna", "john","marcos", "helena", "yasmin");
        String bigName = "";
        for(String str : names){
            bigName += str + ", ";
        }
        System.out.println(bigName.substring(0, bigName.length() -2));
    }

    @Test
    public void joiningStringWithStream() throws Exception{
        List<String> names = List.of("anna", "john","marcos", "helena", "yasmin");

        String joined = names.stream()
                .collect(Collectors.joining(","));

        System.out.println(joined);
    }


}
