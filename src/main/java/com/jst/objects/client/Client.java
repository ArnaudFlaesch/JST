package com.jst.objects.client;

import java.util.Date;

/**
 *
 * @author Arnaud
 */
public class Client {
    private int id;
    private Date arrival;
    private Date departure;
    private String name;
    private String firstName;
    private String agency;
    private String company;
    private int price;
    private String codeReservation;

    public Client() {
    }
    
    public Client(int id, Date arrival, Date departure, String name, String firstName, String agency, String company, int price, String codeReservation) {
        this.id = id;
        this.arrival = arrival;
        this.departure = departure;
        this.name = name;
        this.firstName = firstName;
        this.agency = agency;
        this.company = company;
        this.price = price;
        this.codeReservation = codeReservation;
    }
    
    public int getId() {
        return id;
    }

    public Date getArrival() {
        return arrival;
    }

    public Date getDeparture() {
        return departure;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAgency() {
        return agency;
    }

    public String getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }

    public String getCodeReservation() {
        return codeReservation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCodeReservation(String codeReservation) {
        this.codeReservation = codeReservation;
    }
}