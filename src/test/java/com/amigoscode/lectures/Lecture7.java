package com.amigoscode.lectures;

import com.amigoscode.beans.Car;
import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;
import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Lecture7 {
    @Test
    public void count() throws Exception{
        long count = MockData.getPeople()
                .stream()
                .filter(person -> person.getGender().equalsIgnoreCase("female"))
                .count();

        System.out.println(count);
    }

    @Test
    public void min() throws Exception{
        List<Car> cars = MockData.getCars();
        cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)
                .min()
                .ifPresent(System.out::println);
    }

    @Test
    public void max() throws Exception{

        ImmutableList<Car> cars = ImmutableList.of();

       MockData.getCars().stream()
               .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)
                .max()
                .ifPresentOrElse(
                        System.out::println,
                        ()-> System.out.println("noo"));
    }

    @Test
    public void average() throws Exception{
        MockData.getCars()
                .stream()
                .mapToDouble(Car::getPrice)
                .average()
                .ifPresent(System.out::println);
    }

    @Test
    public void sum() throws Exception{
        double sum = MockData.getCars()
                .stream()
                .mapToDouble(Car::getPrice)
                .sum();

        BigDecimal bigDecimalSum = BigDecimal.valueOf(sum);
        System.out.println(bigDecimalSum);
    }

    @Test
    public void statistics() throws Exception{
        DoubleSummaryStatistics doubleSummaryStatistics = MockData.getCars()
                .stream()
                .mapToDouble(Car::getPrice)
                .summaryStatistics();

        System.out.println(doubleSummaryStatistics);
        System.out.println(doubleSummaryStatistics.getAverage());
        System.out.println(doubleSummaryStatistics.getCount());
        System.out.println(doubleSummaryStatistics.getMax());
        System.out.println(doubleSummaryStatistics.getMin());
        System.out.println(BigDecimal.valueOf(doubleSummaryStatistics.getSum()));
    }
}
