package com.jst.hibernate;

import com.jst.objects.categories.CategOffert;

import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
public class Hibernate_CategOffert {
    public static ArrayList getListCategOffert() {
        Hibernate.setSession(Hibernate.getFactory().openSession());
        ArrayList<CategOffert> result = new ArrayList(Hibernate.getSession().createQuery("FROM CategOffert").list());
        Hibernate.getSession().disconnect();
        return (result);
    }
}
