package com.amigoscode.lectures;

import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture12 {

    @Test
    public void understandingCollect() throws Exception{
        List<String> emails = MockData.getPeople()
                .stream()
                .map(Person::getEmail)
                .collect(
                        ArrayList::new,
                        ArrayList::add,
                        (list1, list2) -> list1.addAll(list2)
                );

        emails.forEach(System.out::println);
    }
}
