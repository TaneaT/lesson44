package com.tekwill.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("patria")
public class CinemaPatriaService implements BookingService {
@Autowired
    CinemaRepository cinemaRepository;

public CinemaPatriaService(CinemaRepository cinemaRepository){
    this.cinemaRepository = cinemaRepository;
}

    public void bookSeat(String name){
        System.out.println("Booking a seat in Patria");
        cinemaRepository.book(name);
    }
}
