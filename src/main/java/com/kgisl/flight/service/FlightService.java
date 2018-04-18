package com.kgisl.flight.service;

import java.util.List;

import com.kgisl.flight.model.Flight;
public interface FlightService {
	public List<Flight> findAll();
	public void saveFlight(Flight flight);
    public void updateFlight(Flight flight,Long id);
	public Flight findOne(long id);
    public void delete(long id);
}
