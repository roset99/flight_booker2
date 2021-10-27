package com.flightbookings.services;

import com.flightbookings.flights.Flight;
import com.flightbookings.passenger.Passenger;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookingSystem {
    private String systemName
    private List<Flight> flightsAvailable;
    private List<Flight> fullyBookedFlights;
    private File allFlights;
    private File allPassengers;
    private int systemCapacity;
    private int flightCount;
    private int availableCount;
    private int bookedCount;
    private int passengerCapacity;
    private int passengerCount;

    public BookingSystem(String systemName, int systemCapacity, int passengerCapacity) {
        this.flightsAvailable = new ArrayList<Flight>();
        this.fullyBookedFlights = new ArrayList<Flight>();
        this.allFlights = new File("src/allFlights%s.txt",systemName);
        this.allPassengers = new File("src/allPassengers%s.txt",systemName);
        this.systemCapacity = systemCapacity;
        this.passengerCapacity = passengerCapacity;
        this.flightCount = 0;
        this.passengerCount = 0;
        this.bookedCount = 0;
        this.availableCount = 0;
        if (!this.allFlights.exists()) {
            System.out.println(this.allFlights.createNewFile());

        } else {
            System.out.println("File already exists");
        }
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public List<Flight> getFlightsAvailable() {
        return flightsAvailable;
    }

    public void setFlightsAvailable(List<Flight> flightsAvailable) {
        this.flightsAvailable = flightsAvailable;
    }

    public List<Flight> getFullyBookedFlights() {
        return fullyBookedFlights;
    }

    public void setFullyBookedFlights(List<Flight> fullyBookedFlights) {
        this.fullyBookedFlights = fullyBookedFlights;
    }

    public File getAllFlights() {
        return allFlights;
    }

    public void setAllFlights(File allFlights) {
        this.allFlights = allFlights;
    }

    public File getAllPassengers() {
        return allPassengers;
    }

    public void setAllPassengers(File allPassengers) {
        this.allPassengers = allPassengers;
    }

    public int getSystemCapacity() {
        return systemCapacity;
    }

    public void setSystemCapacity(int systemCapacity) {
        this.systemCapacity = systemCapacity;
    }

    public int getFlightCount() {
        return flightCount;
    }

    public void setFlightCount(int flightCount) {
        this.flightCount = flightCount;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    public int getBookedCount() {
        return bookedCount;
    }

    public void setBookedCount(int bookedCount) {
        this.bookedCount = bookedCount;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    @Override
    public String toString() {
        return "BookingSystem{" +
                "flightsAvailable=" + Arrays.toString(flightsAvailable) +
                ", fullyBookedFlights=" + Arrays.toString(fullyBookedFlights) +
                ", allFlights=" + Arrays.toString(allFlights) +
                ", allPassengers=" + Arrays.toString(allPassengers) +
                ", systemCapacity=" + systemCapacity +
                ", flightCount=" + flightCount +
                ", passengerCapacity=" + passengerCapacity +
                ", passengerCount=" + passengerCount +
                '}';
    }
}
