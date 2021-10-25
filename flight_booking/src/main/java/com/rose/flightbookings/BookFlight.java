package com.rose.flightbookings;

public class BookFlight {
    public void bookFlight(Passenger passenger, Flight flight){
        if(flight.getCapacity() -1 >= flight.getNumOfPassengers()) {
//            Passenger[] passengerList = flight.getListOfPassengers();
            int length = flight.getNumOfPassengers();
            flight.getListOfPassengers()[length] = passenger;

            int count = flight.getNumOfPassengers();
            flight.setNumOfPassengers(++count);
            System.out.println("Booked Flight");
        }
    }
}
