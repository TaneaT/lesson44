package com.tekwill.demo3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CinemaPatria implements CinemaRepository{

    static List<String> personName = new ArrayList<>();
    @Override
    public void book(String name) {
        System.out.println("Patria");
        personName.add(name);
    }

    @Override
    public List<String> getAllBookings() {
        return personName;
    }
}
