package com.jst.hibernate;

import com.jst.objects.categories.CauseEvent;

import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
public class Hibernate_CauseEvent {
    public static ArrayList getListCauseEvent() {
        Hibernate.setSession(Hibernate.getFactory().openSession());
        ArrayList<CauseEvent> result = new ArrayList(Hibernate.getSession().createQuery("FROM CauseEvent").list());
        Hibernate.getSession().disconnect();
        return (result);
    }
}
