package com.amigoscode.lectures;

import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Lecture13 {

    @Test
    public void intermediateAndTerminalOperations() throws Exception{

        List<Double> list = MockData.getCars()
                .stream()
                .filter(car -> {
                    System.out.println("filter car " + car);
                    return car.getPrice() < 10000;
                })
                .map(car -> {
                    System.out.println("mapping car " + car);
                    return car.getPrice();
                })
                .map(price -> {
                    System.out.println("mapping price " + price);
                    return price + (price * .14);
                })
                .toList();
        System.out.println("the final list");
        System.out.println(list);
    }
}
