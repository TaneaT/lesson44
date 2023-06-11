package com.tekwill.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Demo3Application implements CommandLineRunner {


@Autowired
	CinemaRepository cinemaRepository;


	@Autowired
CinemaPatriaService cinemaPatriaService;

		@Autowired
		MallDova mallDova;

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		mallDova.bookSeatPatria("Ion");
		mallDova.bookSeatPatria("Vladimir");
		mallDova.bookSeatCineplex("Mircea");

		List<String> bookings =  cinemaRepository.getAllBookings();

		for(String people : bookings){
			System.out.println(people);
		}
		}
	}

