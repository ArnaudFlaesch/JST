package com.jst.hibernate;

import com.jst.objects.categories.CategEvent;

import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
public class Hibernate_CategEvent {
    public static ArrayList getListCategEvent() {
        Hibernate.setSession(Hibernate.getFactory().openSession());
        ArrayList<CategEvent> result = new ArrayList(Hibernate.getSession().createQuery("FROM CategEvent").list());
        Hibernate.getSession().disconnect();
        return (result);
    }
}
