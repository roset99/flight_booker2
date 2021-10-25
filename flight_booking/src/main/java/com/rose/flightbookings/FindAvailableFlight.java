package com.rose.flightbookings;

public class FindAvailableFlight {
    public Flight findAvailableFlight(BookingSystem bookingSystem, int flightNumber){
        Flight[] availableFlights = bookingSystem.getFlightsAvailable();
        Flight flight = null;
        for (Flight flightLoop : availableFlights){
            if (flightLoop.getFlightNumber() == flightNumber){
                flight = flightLoop;
                break;
            }
        }
        return flight;
    }
}