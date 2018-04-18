package com.kgisl.flight.repository;

import com.kgisl.flight.model.Flight;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    
    }