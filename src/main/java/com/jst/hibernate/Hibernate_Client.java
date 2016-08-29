/*
 */
package com.jst.hibernate;

import com.jst.objects.client.Client;

import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
public class Hibernate_Client {
    public static ArrayList getListClient() {
        Hibernate.setSession(Hibernate.getFactory().openSession());
        ArrayList<Client> result = new ArrayList(Hibernate.getSession().createQuery("FROM Client").list());
        Hibernate.getSession().disconnect();
        return (result);
    }
}
