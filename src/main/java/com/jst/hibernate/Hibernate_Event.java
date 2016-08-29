package com.jst.hibernate;

import com.jst.objects.event.Event;
import org.hibernate.Query;

import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
public class Hibernate_Event {
    public static ArrayList getListEvent(String contenuRecherche, String dateDebut, String dateFin ) {
        Hibernate.setSession(Hibernate.getFactory().openSession());
        Query getListEvents = Hibernate.getSession().createQuery("FROM Event WHERE date BETWEEN :dateDebut AND :dateFin");
        getListEvents.setString("dateDebut", dateDebut);
        getListEvents.setString("dateFin", dateFin);
        ArrayList<Event> result = new ArrayList(getListEvents.list());
        Hibernate.getSession().disconnect();
        return (result);
    }
    
    public static float getStatEvent(String date) {
        Hibernate.setSession(Hibernate.getFactory().openSession());
        Query getNewEvents = Hibernate.getSession().createQuery("SELECT COUNT(*) FROM Event WHERE status = 0 AND date BETWEEN :date AND date(now())");
        getNewEvents.setString("date", date);
        Query getSolvedEvents = Hibernate.getSession().createQuery("SELECT COUNT(*) FROM Event WHERE status = 0 AND date BETWEEN :date AND date(now())");
        getSolvedEvents.setString("date", date);
        float newEvents = Integer.parseInt(getNewEvents.uniqueResult().toString());
        float resolvedEvents = Integer.parseInt(getSolvedEvents.uniqueResult().toString());
        Hibernate.getSession().disconnect();
        return ((newEvents / (newEvents + resolvedEvents)) * 100);
    }
}
