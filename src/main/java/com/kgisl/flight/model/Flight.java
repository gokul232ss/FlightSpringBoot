package com.kgisl.flight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long flightId;
    @Column
    private String flightName;
    @Column
    private String departure;
    @Column
    private String arrival;
    @Column
    private String availability;
    @Column
    private double amount;
   
    public double getAmount() {
        return amount;
    }
    
    public String getArrival() {
        return arrival;
    }
    
    public String getAvailability() {
        return availability;
    }
    
    public String getDeparture() {
        return departure;
    }

    public long getFlightId() {
        return flightId;
    }
   
    public String getFlightName() {
        return flightName;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
    
    public void setAvailability(String availability) {
        this.availability = availability;
    }
   
    public void setDeparture(String departure) {
        this.departure = departure;
    }
   
    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }
   
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    @Override
    public String toString() {
        return "["+flightId+" "+flightName+" "+departure+" "+arrival+" "+availability+" "+amount+"]";
    }
}