package com.tekwill.demo3;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface CinemaRepository {

    void book(String name);

    List<String> getAllBookings();
}
