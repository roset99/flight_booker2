package com.rose.flightbookings;

import java.util.Arrays;

public class BookingSystem {
    private Flight[] flightsAvailable;
    private Flight[] fullyBookedFlights;
    private Flight[] allFlights;
    private int systemCapacity;

    public BookingSystem(Flight[] flightsAvailable, Flight[] fullyBookedFlights, Flight[] allFlights, int systemCapacity) {
        this.flightsAvailable = new Flight[systemCapacity];
        this.fullyBookedFlights = new Flight[systemCapacity];
        this.allFlights = new Flight[systemCapacity];
        this.systemCapacity = systemCapacity;
    }

    public Flight[] getFlightsAvailable() {
        return flightsAvailable;
    }

    public void setFlightsAvailable(Flight[] flightsAvailable) {
        this.flightsAvailable = flightsAvailable;
    }

    public Flight[] getFullyBookedFlights() {
        return fullyBookedFlights;
    }

    public void setFullyBookedFlights(Flight[] fullyBookedFlights) {
        this.fullyBookedFlights = fullyBookedFlights;
    }

    public Flight[] getAllFlights() {
        return allFlights;
    }

    public void setAllFlights(Flight[] allFlights) {
        this.allFlights = allFlights;
    }

    public int getSystemCapacity() {
        return systemCapacity;
    }

    public void setSystemCapacity(int systemCapacity) {
        this.systemCapacity = systemCapacity;
    }

    @Override
    public String toString() {
        return "BookingSystem{" +
                "flightsAvailable=" + Arrays.toString(flightsAvailable) +
                ", fullyBookedFlights=" + Arrays.toString(fullyBookedFlights) +
                ", allFlights=" + Arrays.toString(allFlights) +
                ", systemCapacity=" + systemCapacity +
                '}';
    }
}
