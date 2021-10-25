package com.rose.flightbookings;

public class CancelFlight {
    public void cancelFlight(Passenger passenger, Flight flight){
    Passenger[] passengerList = flight.getListOfPassengers();
    int passengerLength = passengerList.length;
    for (int i = 0; i < passengerLength; i++) {
        if (passengerList[i].equals(passenger)) {
            passengerList[i] = null;
            int count = flight.getNumOfPassengers();
            flight.setNumOfPassengers(--count);
            System.out.println("Flight Cancelled");;
        }
    }
}
}
