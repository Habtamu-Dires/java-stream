package com.amigoscode.lectures;

import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture1 {

    @Test
    public void imperativeApproach() throws IOException {
        List<Person> people = MockData.getPeople();
        //1.find the people aged less or equal to 18
        List<Person> underAge = new ArrayList<>();
        for(Person person : people){
            if(person.getAge() <= 18){
                underAge.add(person);
            }
            if(underAge.size() == 10) break;
        }
       for(Person young: underAge){
           System.out.println(young.getAge());
       }

        //2.Then changed implementation to find first 10 people
    }

    @Test
    public void declarativeApproachUsingStream() throws Exception{
        List<Person> people = MockData.getPeople();
        List<Person> youngPeople =
                people.stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList());

        youngPeople.forEach(System.out::println);
    }
}
