package com.jst.hibernate;

import com.jst.objects.room.Room;

import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
public class Hibernate_Room {
    public static ArrayList getListRoom() {
        Hibernate.setSession(Hibernate.getFactory().openSession());
        ArrayList<Room> result = new ArrayList(Hibernate.getSession().createQuery("FROM Room").list());
        Hibernate.getSession().disconnect();
        return (result);
    }
}
