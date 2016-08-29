package com.jst.beans;

import com.jst.hibernate.Hibernate_Hotel;
import com.jst.objects.hotel.Hotel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
@ManagedBean(name = "hotelBean")
@RequestScoped
public class HotelBean implements AbstractBean {
    private Hotel hotel = new Hotel();
    private ArrayList<Hotel> hotelList = new ArrayList();

    public HotelBean() {
        this.hotelList = Hibernate_Hotel.getListHotel();
    }
        
    @Override
    public ArrayList get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Hotel getHotel() {
        return hotel;
    }
    
    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setHotelList(ArrayList<Hotel> hotelList) {
        this.hotelList = hotelList;
    }
}
