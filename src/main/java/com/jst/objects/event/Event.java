package com.jst.objects.event;

import com.jst.objects.categories.CategEvent;
import com.jst.objects.categories.CauseEvent;
import com.jst.objects.client.Client;
import com.jst.objects.hotel.Hotel;
import com.jst.objects.room.Room;

import java.util.Date;

/**
 *
 * @author Arnaud
 */
public class Event {
    private int idEvent;
    private Date date;
    private Date time;
    private String label;
    private String description;
    private int status;
    private int notePMS;
    private String redactor;    
    private int humor;
    
    private CategEvent categEvent;
    private CauseEvent causeEvent;
    private Room room;
    private Client client;
    private Hotel hotel;

    public Event() { }
    
    public Event(int idEvent, String date, String label, String description, String redactor, int notePMS, int status) {
        this.idEvent = idEvent;
        this.date = new Date(date);
        this.label = label;
        this.description = description;
        this.redactor = redactor;
        this.notePMS = notePMS;
        this.status = status;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRedactor() {
        return redactor;
    }

    public void setRedactor(String redactor) {
        this.redactor = redactor;
    }

    public int getNotePMS() {
        return notePMS;
    }

    public void setNotePMS(int notePMS) {
        this.notePMS = notePMS;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getHumor() {
        return humor;
    }

    public void setHumor(int humor) {
        this.humor = humor;
    }

    public CategEvent getCategEvent() {
        return categEvent;
    }

    public void setCategEvent(CategEvent categEvent) {
        this.categEvent = categEvent;
    }

    public CauseEvent getCauseEvent() {
        return causeEvent;
    }

    public void setCauseEvent(CauseEvent causeEvent) {
        this.causeEvent = causeEvent;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}