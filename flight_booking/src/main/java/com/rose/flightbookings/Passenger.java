package com.rose.flightbookings;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Passenger {
    private String firstName;
    private String lastName;
    private String passportNumber;
    private LocalDate dateOfBirth;
    private Citizenship citizenship;
    private Flight[] bookedFlights;
    private Identifier id;

    public Passenger(String firstName, String lastName, String passportNumber, LocalDate dateOfBirth, Citizenship citizenship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
        this.citizenship = citizenship;
        this.id = new Identifier();
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

    public Flight[] getBookedFlights() {
        return bookedFlights;
    }

    public void setBookedFlights(Flight[] bookedFlights) {
        this.bookedFlights = bookedFlights;
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
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
                ", bookedFlights=" + Arrays.toString(bookedFlights) +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(firstName, passenger.firstName) && Objects.equals(lastName, passenger.lastName) && Objects.equals(passportNumber, passenger.passportNumber) && Objects.equals(dateOfBirth, passenger.dateOfBirth) && citizenship == passenger.citizenship && Arrays.equals(bookedFlights, passenger.bookedFlights) && Objects.equals(id, passenger.id);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, passportNumber, dateOfBirth, citizenship, id);
        result = 31 * result + Arrays.hashCode(bookedFlights);
        return result;
    }
}