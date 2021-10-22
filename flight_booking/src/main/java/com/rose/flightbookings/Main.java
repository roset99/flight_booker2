package com.rose.flightbookings;

import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem(2,2);
//        NewPassenger john = new NewPassenger(bookingSystem);
//        john.newPassenger();
        System.out.println(bookingSystem.toString());
        AddFlight toEgypt = new AddFlight(bookingSystem);
        toEgypt.addFlight();
        toEgypt.addFlight();

    }
}
