package com.jst.beans;

import com.jst.hibernate.Hibernate_Hotel;
import com.jst.hibernate.Hibernate_Role;
import com.jst.hibernate.Hibernate_User;
import com.jst.objects.categories.Role;
import com.jst.objects.hotel.Hotel;
import com.jst.objects.user.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
@ManagedBean(name="usersBean")
@ViewScoped
public class UsersBean implements AbstractBean {

    private final static long serialVersionUID = 1L;
    private User user = new User();
    private ArrayList<User> listUser = new ArrayList();
    private ArrayList<Hotel> listHotel = new ArrayList();
    private ArrayList<Role> listRole = new ArrayList();
    
    public UsersBean() {
        this.listUser = get();
        this.listHotel = Hibernate_Hotel.getListHotel();
        this.listRole = Hibernate_Role.getListRole();
    }

    @Override
    public ArrayList get() {
        return (Hibernate_User.getListUser());
    }
    
    @Override
    public boolean add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<User> getListUser() {
        return listUser;
    }

    public void setListUser(ArrayList<User> listUser) {
        this.listUser = listUser;
    }

    public ArrayList<Hotel> getListHotel() {
        return listHotel;
    }

    public void setListHotel(ArrayList<Hotel> listHotel) {
        this.listHotel = listHotel;
    }

    public ArrayList<Role> getListRole() {
        return listRole;
    }

    public void setListRole(ArrayList<Role> listRole) {
        this.listRole = listRole;
    }
}