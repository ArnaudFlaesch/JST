package com.jst.beans;

import com.jst.hibernate.Hibernate_Hotel;
import com.jst.hibernate.Hibernate_Room;
import com.jst.objects.hotel.Hotel;
import com.jst.objects.room.Room;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
@ManagedBean(name = "roomBean")
@RequestScoped
public class RoomBean implements AbstractBean {
    private Room room = new Room();
    private ArrayList<Room> roomList = new ArrayList();
    private ArrayList<Hotel> hotelList = new ArrayList();

    public RoomBean() {
        this.roomList = Hibernate_Room.getListRoom();
        this.hotelList = Hibernate_Hotel.getListHotel();
    }

    @Override
    public boolean add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Room getRoom() {
        return room;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }

    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(ArrayList<Hotel> hotelList) {
        this.hotelList = hotelList;
    }
}