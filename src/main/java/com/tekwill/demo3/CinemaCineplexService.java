package com.tekwill.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cineplex")
public class CinemaCineplexService implements BookingService {
@Autowired
    CinemaRepository cinemaRepository;

public CinemaCineplexService(CinemaRepository cinemaRepository){
    this.cinemaRepository= cinemaRepository;
}

    public void bookSeat(String name){
        System.out.println("Booking a seat in Cineplex");
        cinemaRepository.book(name);
    }
}
