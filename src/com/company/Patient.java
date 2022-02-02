package com.company;

public class Patient {
    {
       idGenerator++;
    }
    private static int   idGenerator=0;
    private int id= idGenerator;
    private String lastName;
    private String firstName;
    private int telNumber;
    private int numberKart;
    private String diagnosis;

    public Patient(String lastName, String firstName, int telNumber, int numberKart, String diagnosis) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.telNumber = telNumber;
        this.numberKart = numberKart;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }

    public int getNumberKart() {
        return numberKart;
    }

    public void setNumberKart(int numberKart) {
        this.numberKart = numberKart;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", telNumber=" + telNumber +
                ", numberKart=" + numberKart +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
