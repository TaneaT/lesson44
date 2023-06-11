package com.tekwill.demo3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



public class CinemaCineplex implements CinemaRepository{

    List<String> personName = new ArrayList<>();

    @Override
    public void book(String name) {
        System.out.println("Cineplex");
        personName.add(name);
    }

    @Override
    public List<String> getAllBookings() {
        return personName;
    }
}
