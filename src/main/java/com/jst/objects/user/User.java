package com.jst.objects.user;

import com.jst.objects.categories.Role;
import com.jst.objects.hotel.Hotel;

/**
 *
 * @author Arnaud
 */
public class User {
    private int idUser;
    private String login;
    private String password;
    private String name;
    private String firstName;
    private int status;
    private String email;
    private Hotel hotel;
    private Role role;

    public User() { }

    public User(int idUser, String login, String password, String name, String firstName, int status, String email, Hotel hotel, Role role) {
        this.idUser = idUser;
        this.login = login;
        this.password = password;
        this.name = name;
        this.firstName = firstName;
        this.status = status;
        this.email = email;
        this.hotel = hotel;
        this.role = role;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}