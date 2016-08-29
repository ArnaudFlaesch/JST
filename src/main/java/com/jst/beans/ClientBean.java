package com.jst.beans;

import com.jst.objects.client.Client;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
@ManagedBean(name = "clientBean")
@RequestScoped
public class ClientBean implements AbstractBean {
    private Client client = new Client();
    private ArrayList<Client> clientList = new ArrayList();

    public ClientBean() {
    }

    @Override
    public boolean add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Client getClient() {
        return client;
    }

    public ArrayList<Client> getClientList() {
        return clientList;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }    
}