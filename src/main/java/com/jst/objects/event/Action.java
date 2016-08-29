package com.jst.objects.event;

/**
 *
 * @author Arnaud
 */
public class Action {
    private int idAction;
    private String date;
    private String time;
    private String description;
    private String redactor;
    private int idEvent;

    public Action() { }

    public Action(String date, String time, String description, String redactor, int idEvent) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.redactor = redactor;
        this.idEvent = idEvent;
    }

    public Action(int idAction, String date, String time, String description, String redactor) {
        this.idAction = idAction;
        this.date = date;
        this.time = time;
        this.description = description;
        this.redactor = redactor;
    }

    public int getIdAction() {
        return idAction;
    }

    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRedactor() {
        return redactor;
    }

    public void setRedactor(String redactor) {
        this.redactor = redactor;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }
}