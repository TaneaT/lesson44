package com.tekwill.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CinemaService {
@Autowired
    CinemaRepository cinemaRepository;

    public CinemaService(CinemaRepository cinemaRepository){
        this.cinemaRepository = cinemaRepository;
    }

    public void bookSeat(String name){
        cinemaRepository.book(name);
    }

//    static List<String> bookings = new ArrayList<>();
//    public static List<String> getAllBookings(){
//        return bookings;
//    }

}
