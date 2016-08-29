/*
 */
package com.jst.hibernate;

import com.jst.objects.categories.Role;

import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
public class Hibernate_Role {
    public static ArrayList getListRole() {
        Hibernate.setSession(Hibernate.getFactory().openSession());
        ArrayList<Role> result = new ArrayList(Hibernate.getSession().createQuery("FROM Role").list());
        Hibernate.getSession().disconnect();
        return (result);
    }
}
