package com.tekwill.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MallDova  {

@Qualifier("patria")
@Autowired
    BookingService cinemaPatria;

@Qualifier("cineplex")
@Autowired
    BookingService cinemaCineplex;

    public void bookSeatPatria(String name){
        System.out.println("Booking a seat in Patria");
        cinemaPatria.bookSeat(name);
    }

    public void bookSeatCineplex (String name){
        System.out.println("Booking a seat in Cineplex");
        cinemaCineplex.bookSeat(name);
    }




}
