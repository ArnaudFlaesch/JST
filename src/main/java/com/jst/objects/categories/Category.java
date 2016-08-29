package com.jst.objects.categories;

/**
 *
 * @author Arnaud
 */
public class Category {
    private int id;
    protected String label;

    protected Category() {
    }
    
    protected Category(String label) {
        this.label = label;
    }

    protected Category(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}