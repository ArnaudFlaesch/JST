package com.jst.hibernate;

import com.jst.objects.user.User;
import org.hibernate.Query;

import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
public class Hibernate_User {
    public static User getUser(String login, String password) {
        Hibernate.setSession(Hibernate.getFactory().openSession());
        Query requete = Hibernate.getSession().createQuery("FROM User WHERE login = :login AND password = :password");
        requete.setString("login", login);
        requete.setString("password", password);
        User user = (User)requete.uniqueResult();
        Hibernate.getSession().disconnect();
        return (user);
    }
    
    public static ArrayList<User> getListUser() {
        Hibernate.setSession(Hibernate.getFactory().openSession());
        ArrayList<User> listUser = new ArrayList(Hibernate.getSession().createQuery("FROM User").list());
        Hibernate.getSession().disconnect();
        return (listUser);
    }
}