package com.jst.objects.event;

import com.jst.objects.categories.CategOffert;

/**
 *
 * @author Arnaud
 */
public class Offert {
    private int idOffert;
    private int amount;
    private String offertGivenBy;
    private String redactor;
    private String description;
    private CategOffert categOffert;
    private int idEvent;

    public Offert() { }
    
    public Offert(int amount, String offertGivenBy, String redactor, String description, CategOffert categOffert, int idEvent) {
        this.amount = amount;
        this.offertGivenBy = offertGivenBy;
        this.redactor = redactor;
        this.description = description;
        this.categOffert = categOffert;
        this.idEvent = idEvent;
    }
    
    public Offert(int idOffert, int amount, String offertGivenBy, String redactor, String description, CategOffert categOffert) {
        this.idOffert = idOffert;
        this.amount = amount;
        this.offertGivenBy = offertGivenBy;
        this.redactor = redactor;
        this.description = description;
        this.categOffert = categOffert;
    }

    public int getIdOffert() {
        return idOffert;
    }

    public void setIdOffert(int idOffert) {
        this.idOffert = idOffert;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getOffertGivenBy() {
        return offertGivenBy;
    }

    public void setOffertGivenBy(String offertGivenBy) {
        this.offertGivenBy = offertGivenBy;
    }

    public String getRedactor() {
        return redactor;
    }

    public void setRedactor(String redactor) {
        this.redactor = redactor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategOffert getCategOffert() {
        return categOffert;
    }

    public void setCategOffert(CategOffert categOffert) {
        this.categOffert = categOffert;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }
}