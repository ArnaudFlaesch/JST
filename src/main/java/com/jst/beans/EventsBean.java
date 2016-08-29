package com.jst.beans;

import com.jst.hibernate.*;
import com.jst.objects.categories.CategEvent;
import com.jst.objects.categories.CategOffert;
import com.jst.objects.categories.CauseEvent;
import com.jst.objects.client.Client;
import com.jst.objects.event.Action;
import com.jst.objects.event.Event;
import com.jst.objects.event.Offert;
import com.jst.objects.room.Room;
import com.jst.utils.DateUtils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Arnaud
 */
@ManagedBean(name = "eventsBean")
@ViewScoped
public class EventsBean implements AbstractBean {
    private float statEventWeek;
    private float statEventMonth;
    private float statEventYear;
    private Date dateDebutRecherche;
    private Date dateFinRecherche;
    private String contenuRecherche;
    private Action action = new Action();
    private Offert offert = new Offert();
    private Event event = new Event();
    private ArrayList<Event> listEvents = new ArrayList();
    private ArrayList<CategEvent> listCategEvent = new ArrayList();
    private ArrayList<CategOffert> listCategOffert = new ArrayList();
    private ArrayList<CauseEvent> listCauseEvent = new ArrayList();
    private ArrayList<Client> listCustomer = new ArrayList();
    private ArrayList<Room> listRoom = new ArrayList();

    /**
     * Creates a new instance of ListEventsBean
     */
    public EventsBean() {
        //this.listEvents = this.get();
        this.listCategEvent = Hibernate_CategEvent.getListCategEvent();
        this.listCategOffert = Hibernate_CategOffert.getListCategOffert();
        this.listCauseEvent = Hibernate_CauseEvent.getListCauseEvent();
        this.listCustomer = Hibernate_Client.getListClient();
        this.listRoom = Hibernate_Room.getListRoom();
        this.statEventWeek = Hibernate_Event.getStatEvent(DateUtils.format(DateUtils.minusOneWeek()));
        this.statEventMonth = Hibernate_Event.getStatEvent(DateUtils.format(DateUtils.minusOneMonth()));
        this.statEventYear = Hibernate_Event.getStatEvent(DateUtils.format(DateUtils.minusOneYear()));
    }

    @Override
    public ArrayList<Event> get() {
        return (Hibernate_Event.getListEvent("", DateUtils.format(DateUtils.minusOneWeek()), DateUtils.format(Calendar.getInstance().getTime())));
    }
    
    @Override
    public boolean add() {
        System.out.println("TIME " + new SimpleDateFormat("hh:mm").format(this.event.getTime()));
        //System.out.println(this.event.getDate());
        System.out.println("ICI EVENT "+ new SimpleDateFormat("yyyy-MM-dd").format(this.event.getDate()));
        //int evenementID = EventsBDD.addEvent(status, redactor, notePMS, label, description, date, time, service, room, humor);
        return (true);
    }
    
    public void rechercheEvent() {
        this.listEvents = Hibernate_Event.getListEvent(this.contenuRecherche, DateUtils.format(this.dateDebutRecherche), DateUtils.format(this.dateFinRecherche));
    }
    
    public String isoToFr(Date dateAConvertir) {
        return (new SimpleDateFormat("yyyy-MM-dd").format(dateAConvertir));
    }

    public float getStatEventWeek() {
        return statEventWeek;
    }

    public void setStatEventWeek(float statEventWeek) {
        this.statEventWeek = statEventWeek;
    }

    public float getStatEventMonth() {
        return statEventMonth;
    }

    public void setStatEventMonth(float statEventMonth) {
        this.statEventMonth = statEventMonth;
    }

    public float getStatEventYear() {
        return statEventYear;
    }

    public void setStatEventYear(float statEventYear) {
        this.statEventYear = statEventYear;
    }

    public Date getDateDebutRecherche() {
        return dateDebutRecherche;
    }

    public void setDateDebutRecherche(Date dateDebutRecherche) {
        this.dateDebutRecherche = dateDebutRecherche;
    }

    public Date getDateFinRecherche() {
        return dateFinRecherche;
    }

    public void setDateFinRecherche(Date dateFinRecherche) {
        this.dateFinRecherche = dateFinRecherche;
    }

    public String getContenuRecherche() {
        return contenuRecherche;
    }

    public void setContenuRecherche(String contenuRecherche) {
        this.contenuRecherche = contenuRecherche;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Offert getOffert() {
        return offert;
    }

    public void setOffert(Offert offert) {
        this.offert = offert;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public ArrayList<Event> getListEvents() {
        return listEvents;
    }

    public void setListEvents(ArrayList<Event> listEvents) {
        this.listEvents = listEvents;
    }

    public ArrayList<CategEvent> getListCategEvent() {
        return listCategEvent;
    }

    public void setListCategEvent(ArrayList<CategEvent> listCategEvent) {
        this.listCategEvent = listCategEvent;
    }

    public ArrayList<CategOffert> getListCategOffert() {
        return listCategOffert;
    }

    public void setListCategOffert(ArrayList<CategOffert> listCategOffert) {
        this.listCategOffert = listCategOffert;
    }

    public ArrayList<CauseEvent> getListCauseEvent() {
        return listCauseEvent;
    }

    public void setListCauseEvent(ArrayList<CauseEvent> listCauseEvent) {
        this.listCauseEvent = listCauseEvent;
    }

    public ArrayList<Client> getListCustomer() {
        return listCustomer;
    }

    public void setListCustomer(ArrayList<Client> listCustomer) {
        this.listCustomer = listCustomer;
    }

    public ArrayList<Room> getListRoom() {
        return listRoom;
    }

    public void setListRoom(ArrayList<Room> listRoom) {
        this.listRoom = listRoom;
    }
}