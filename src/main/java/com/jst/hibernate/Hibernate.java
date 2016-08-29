package com.jst.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Arnaud
 */
public class Hibernate {
    private static SessionFactory factory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
    private static Session session = null;
    
    public static SessionFactory getFactory() {
        return factory;
    }

    public static Session getSession() {
        return session;
    }

    public static void setSession(Session session) {
        Hibernate.session = session;
    }
}
