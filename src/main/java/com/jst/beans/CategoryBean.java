package com.jst.beans;

import com.jst.hibernate.Hibernate_CategEvent;
import com.jst.hibernate.Hibernate_CategOffert;
import com.jst.hibernate.Hibernate_CauseEvent;
import com.jst.hibernate.Hibernate_Role;
import com.jst.objects.categories.Category;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
@ManagedBean(name = "categoryBean")
@RequestScoped
public class CategoryBean implements AbstractBean {
    private static final long serialVersionUID = 1L;
    private static final String titreCauseEvent = "Liste des causes d'évènements";
    private static final String titreCategEvent = "Liste des catégories d'évènements";
    private static final String titreCategOffert = "Liste des catégories d'offerts";
    private static final String titreRole = "Liste des rôles";
    private static final String titreAddCateg = "Ajouter une nouvelle catégorie";
    private static final String titreAddCause = "Ajouter une nouvelle cause";
    private static final String titreAddRole = "Ajouter un rôle";
    private String titrePage;
    private String titreAdd;
    private Category categ = null;
    private ArrayList<Category> listCateg = new ArrayList();

    public CategoryBean() {
        if (null != FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("item")) {
            switch (FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("item")) {
                case "categEvent" :
                    this.listCateg = Hibernate_CategEvent.getListCategEvent();
                    this.titrePage = titreCategEvent;
                    this.titreAdd = titreAddCateg;
                    break;
                case "causeEvent" :
                    this.listCateg = Hibernate_CauseEvent.getListCauseEvent();
                    this.titrePage = titreCauseEvent;
                    this.titreAdd = titreAddCause;
                    break;
                case "categOffert" :
                    this.listCateg = Hibernate_CategOffert.getListCategOffert();
                    this.titrePage = titreCategOffert;
                    this.titreAdd = titreAddCateg;
                    break;
                case "role" :
                    this.listCateg = Hibernate_Role.getListRole();
                    this.titrePage = titreRole;
                    this.titreAdd = titreAddRole;
                    break;
                default :
                    break;
            }
        }
    }
    
    @PostConstruct
    public void test() {
        System.out.println("POST CONSTRUCT");
    }

    @Override
    public ArrayList get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitreAdd() {
        return titreAdd;
    }

    public void setTitreAdd(String titreAdd) {
        this.titreAdd = titreAdd;
    }

    public String getTitrePage() {
        return titrePage;
    }

    public void setTitrePage(String titrePage) {
        this.titrePage = titrePage;
    }

    public Category getCateg() {
        return categ;
    }

    public void setCateg(Category categ) {
        this.categ = categ;
    }

    public ArrayList<Category> getListCateg() {
        return listCateg;
    }

    public void setListCateg(ArrayList<Category> listCateg) {
        this.listCateg = listCateg;
    }
}