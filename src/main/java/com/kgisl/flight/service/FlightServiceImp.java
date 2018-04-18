package com.kgisl.flight.service;

import java.util.List;

import com.kgisl.flight.model.Flight;
import com.kgisl.flight.repository.FlightRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImp implements FlightService{
    @Autowired
    private FlightRepository flightrepository;

	@Override
	public List<Flight> findAll() {
		return flightrepository.findAll();
	}

	@Override
	public void saveFlight(Flight flight) {
		flightrepository.save(flight);
	}

	@Override
	public void updateFlight(Flight flight, Long id) {
        flight.setFlightId(id);
        flightrepository.saveAndFlush(flight);
        
	}

	@Override
	public Flight findOne(long id) {
		return flightrepository.findOne(id);
	}

	@Override
	public void delete(long id) {
		flightrepository.delete(id);
	}

}