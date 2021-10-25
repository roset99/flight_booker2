package com.rose.flightbookings;

public class BookFlight {
    public void bookFlight(Passenger passenger, Flight flight, BookingSystem bookingSystem){
        if(flight.getCapacity() -1 >= flight.getNumOfPassengers()) {
            Passenger[] passengerList = flight.getListOfPassengers();
            int length = flight.getNumOfPassengers();
            passengerList[length] = passenger;
            int numOfFlights = passenger.getCount();
            int num = bookingSystem.getBookedCount();
            passenger.getBookedFlights()[numOfFlights] = flight;
            if (flight.getCapacity() -1 == flight.getNumOfPassengers()){
                for (Flight flights : bookingSystem.getFlightsAvailable()){
                    if (flight.getFlightNumber() == flights.getFlightNumber()){
                        flights = null;
                        break;
                    }
                }
                Flight[] booked = bookingSystem.getFullyBookedFlights();

                bookingSystem.getFullyBookedFlights()[num] = flight;

            }

            int count = flight.getNumOfPassengers();
            passenger.setCount(++numOfFlights);
            bookingSystem.setBookedCount(++num);
            int num2 = bookingSystem.getAvailableCount();
            bookingSystem.setAvailableCount(--num2);
            flight.setNumOfPassengers(++count);
            System.out.println("Booked Flight");
            System.out.println(passenger.toString());
        }
    }
}
