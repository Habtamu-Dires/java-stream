package com.amigoscode.lectures;

import com.amigoscode.beans.Person;
import com.amigoscode.examples.IntStreams;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

public class Lecture2 {

    @Test
    public void range() throws Exception {

        System.out.println("exclusive");
        IntStream.range(0, 10).forEach(System.out::println);

        System.out.println("inclusive");

        IntStream.rangeClosed(0,10).forEach(System.out::println);
    }

    @Test
    public void rangeIteratingLists() throws Exception{
        List<Person> people = MockData.getPeople();

        IntStream.rangeClosed(0, people.size())
                .forEach(index ->{
                    Person person = people.get(index);
                    System.out.println(person);
                });
    }

    @Test
    public void intStreamIterate() throws Exception{
        IntStream.iterate(0, operand -> operand + 2)
                .limit(20)
                .forEach(System.out::println);
    }

    @Test
    public void myTest() throws Exception{
        IntStream.rangeClosed(0, 20)
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);
    }
}
