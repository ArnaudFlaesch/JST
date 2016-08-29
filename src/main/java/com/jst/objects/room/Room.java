package com.jst.objects.room;

import com.jst.objects.hotel.Hotel;

/**
 *
 * @author Arnaud
 */
public class Room {
    private int id;
    private int number;
    private String label;
    private int idHotel;
    private Hotel hotel;

    public Room() { }
    
    public Room(int id, int number, String label, int idHotel) {
        this.number = number;
        this.label = label;
        this.idHotel = idHotel;
    }

    public Room(int id, int number, String label, Hotel hotel) {
        this.id = id;
        this.number = number;
        this.label = label;
        this.hotel = hotel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}