package com.flightbookings.flights;

import com.flightbookings.flights.Airport;
import com.flightbookings.flights.Company;
import com.flightbookings.passenger.Passenger;
import com.flightbookings.services.FileInput;

import java.sql.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Flight extends FileInput {
    private int flightNumber;
    private Company flightCompany;
    private Airport startPoint;
    private Airport destination;
    private int capacity;
    private LocalDateTime departureTime;
    private boolean isFull;
    private List<Passenger> listOfPassengers;
    private int numOfPassengers;

    public Flight(int flightNumber, Company flightCompany, Airport startPoint, Airport destination, int capacity, LocalDateTime departureTime) {
        this.flightNumber = flightNumber;
        this.flightCompany = flightCompany;
        this.startPoint = startPoint;
        this.destination = destination;
        this.capacity = capacity;
        this.departureTime = departureTime;
        this.isFull = false;
        this.listOfPassengers = new ArrayList<>();
        this.numOfPassengers = 0;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Company getFlightCompany() {
        return flightCompany;
    }

    public void setFlightCompany(Company flightCompany) {
        this.flightCompany = flightCompany;
    }

    public Airport getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Airport startPoint) {
        this.startPoint = startPoint;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public List<Passenger> getListOfPassengers() {
        return listOfPassengers;
    }

    public void setListOfPassengers(List<Passenger> listOfPassengers) {
        this.listOfPassengers = listOfPassengers;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber && capacity == flight.capacity && isFull == flight.isFull && numOfPassengers == flight.numOfPassengers && flightCompany == flight.flightCompany && startPoint == flight.startPoint && destination == flight.destination && Objects.equals(departureTime, flight.departureTime) && Objects.equals(listOfPassengers, flight.listOfPassengers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, flightCompany, startPoint, destination, capacity, departureTime, isFull, listOfPassengers, numOfPassengers);
    }
}
