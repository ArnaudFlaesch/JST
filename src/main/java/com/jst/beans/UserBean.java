package com.jst.beans;

import com.jst.hibernate.Hibernate_User;
import com.jst.objects.user.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Arnaud
 */
@ManagedBean(name = "userBean")
@SessionScoped
public class UserBean {
    private static final long serialVersionUID = 1L;
    private User user = new User();
        
    /**
     * Creates a new instance of UserBean
     */
    public UserBean() { }
   
    public String checkUser() {
        this.user = Hibernate_User.getUser(this.user.getLogin(), this.user.getPassword());
        if (user == null) {
            this.user = new User();
            return ("index");
        }
        return ("listEvents");
    }
    
    public String disconnectUser() {
        this.user = new User();
        return ("index");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}