package com.flightbookings.passenger;

import com.flightbookings.flights.Flight;
import com.flightbookings.services.FileInput;

import java.time.LocalDate;
import java.util.*;

public class Passenger extends FileInput {
    private String firstName;
    private String lastName;
    private String passportNumber;
    private LocalDate dateOfBirth;
    private Citizenship citizenship;
    private List<Flight> bookedFlights;
    private int count;
    private String id;


    public Passenger(String firstName, String lastName, String passportNumber, LocalDate dateOfBirth, Citizenship citizenship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
        this.citizenship = citizenship;
        this.bookedFlights = new ArrayList<>();
        this.count = 0;
        this.id = UUID.randomUUID().toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Citizenship getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(Citizenship citizenship) {
        this.citizenship = citizenship;
    }

    public List<Flight> getBookedFlights() {
        return bookedFlights;
    }

    public void setBookedFlights(List<Flight> bookedFlights) {
        this.bookedFlights = bookedFlights;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", citizenship=" + citizenship +
                ", bookedFlights=" + bookedFlights +
                ", count=" + count +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return count == passenger.count && Objects.equals(firstName, passenger.firstName) && Objects.equals(lastName, passenger.lastName) && Objects.equals(passportNumber, passenger.passportNumber) && Objects.equals(dateOfBirth, passenger.dateOfBirth) && citizenship == passenger.citizenship && Objects.equals(bookedFlights, passenger.bookedFlights) && Objects.equals(id, passenger.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, passportNumber, dateOfBirth, citizenship, bookedFlights, count, id);
    }
}