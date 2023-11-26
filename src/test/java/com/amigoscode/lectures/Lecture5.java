package com.amigoscode.lectures;

import com.amigoscode.beans.Car;
import com.amigoscode.beans.Person;
import com.amigoscode.beans.PersonDTO;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lecture5 {

    final Predicate<Car> carPredicate = car -> car.getPrice() < 20000;

    @Test
    public void understandingFilter() throws Exception{
        List<Car> cars = MockData.getCars();

        List<Car> carFiltered = cars.stream()
                .filter(carPredicate)
                .toList();

        System.out.println(carFiltered.size());
        carFiltered.forEach(System.out::println);

    }

    @Test
    public void ourFirstMapping() throws Exception{
        // map -> transform one data type to another
        List<Person> people = MockData.getPeople();
        Function<Person, PersonDTO> personPersonDTOFunction =
                person -> new PersonDTO(person.getId(), person.getFirstName(), person.getAge());

        List<PersonDTO> dtos = people.stream()
                .map(PersonDTO::map)
                .toList();
        assert dtos.size() == 1000;

        dtos.forEach(System.out::println);
        System.out.println(dtos.size());
    }

    @Test
    public void averageCarPrice() throws Exception{
        // calculate average of car prices
        List<Car> cars = MockData.getCars();
        double avgPrice = cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);

        System.out.println(avgPrice);
    }

    @Test
    void name() {
        Optional<String> sth = Optional.ofNullable(null);

        String output = sth
                .map(String::toUpperCase)
                        .orElse("other");

        System.out.println(output);
    }
}
