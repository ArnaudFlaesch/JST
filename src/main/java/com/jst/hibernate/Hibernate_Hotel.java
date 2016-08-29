package com.jst.hibernate;

import com.jst.objects.hotel.Hotel;

import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
public class Hibernate_Hotel {
    public static ArrayList getListHotel() {
        Hibernate.setSession(Hibernate.getFactory().openSession());
        ArrayList<Hotel> result = new ArrayList(Hibernate.getSession().createQuery("FROM Hotel").list());
        Hibernate.getSession().disconnect();
        return (result);
    }
}
