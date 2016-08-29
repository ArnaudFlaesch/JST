package com.jst.objects.reservation;

import com.jst.objects.hotel.Hotel;

import java.util.Date;

/**
 *
 * @author Arnaud
 */
public class Reservation {
    private int idClient;
    private Date arrival;
    private Date departure;
    private int room;
    private String name;
    private String firstName;
    private String isShared;
    private int nbAdults;
    private String roomLabel;
    private String rateCode;
    private String products;
    private int effectiveRateAmount;
    private String reservationStatus;
    private String companyName;
    private String travelAgentName;
    private String specialRequest;
    private String balance;
    private Hotel hotel;

    public Reservation() { }

    public Reservation(int idClient, Date arrival, Date departure, int room, String name, String firstName, String isShared, int nbAdults,
                       String roomLabel, String rateCode, String products, int effectiveRateAmount, String reservationStatus, String companyName,
                       String travelAgentName, String specialRequest, String balance, Hotel hotel) {
        this.idClient = idClient;
        this.arrival = arrival;
        this.departure = departure;
        this.room = room;
        this.name = name;
        this.firstName = firstName;
        this.isShared = isShared;
        this.nbAdults = nbAdults;
        this.roomLabel = roomLabel;
        this.rateCode = rateCode;
        this.products = products;
        this.effectiveRateAmount = effectiveRateAmount;
        this.reservationStatus = reservationStatus;
        this.companyName = companyName;
        this.travelAgentName = travelAgentName;
        this.specialRequest = specialRequest;
        this.balance = balance;
        this.hotel = hotel;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getIsShared() {
        return isShared;
    }

    public void setIsShared(String isShared) {
        this.isShared = isShared;
    }

    public int getNbAdults() {
        return nbAdults;
    }

    public void setNbAdults(int nbAdults) {
        this.nbAdults = nbAdults;
    }

    public String getRoomLabel() {
        return roomLabel;
    }

    public void setRoomLabel(String roomLabel) {
        this.roomLabel = roomLabel;
    }

    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public int getEffectiveRateAmount() {
        return effectiveRateAmount;
    }

    public void setEffectiveRateAmount(int effectiveRateAmount) {
        this.effectiveRateAmount = effectiveRateAmount;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTravelAgentName() {
        return travelAgentName;
    }

    public void setTravelAgentName(String travelAgentName) {
        this.travelAgentName = travelAgentName;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}