package com.jst.objects.hotel;

/**
 *
 * @author Arnaud
 */
public class Hotel {
    
    private int id;
    private String name;
    private String smtp;
    private int port;
    private String senderLogin;
    private String senderPassword;
    private String mailFrom;
    private String toolName;
    private String pmsName;
    private String pmsLink;

    public Hotel() {
    }
    
    public Hotel(int id, String name, String smtp, int port, String senderLogin, String senderPassword, String mailFrom, String toolName, String pmsName, String pmsLink) {
        this.id = id;
        this.name = name;
        this.smtp = smtp;
        this.port = port;
        this.senderLogin = senderLogin;
        this.senderPassword = senderPassword;
        this.mailFrom = mailFrom;
        this.toolName = toolName;
        this.pmsName = pmsName;
        this.pmsLink = pmsLink;
    }

    public int getId() {
        return id;
    }

    public String getMailFrom() {
        return mailFrom;
    }

    public String getName() {
        return name;
    }

    public String getPmsLink() {
        return pmsLink;
    }

    public String getPmsName() {
        return pmsName;
    }

    public int getPort() {
        return port;
    }

    public String getSenderLogin() {
        return senderLogin;
    }

    public String getSenderPassword() {
        return senderPassword;
    }

    public String getSmtp() {
        return smtp;
    }

    public String getToolName() {
        return toolName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPmsLink(String pmsLink) {
        this.pmsLink = pmsLink;
    }

    public void setPmsName(String pmsName) {
        this.pmsName = pmsName;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setSenderLogin(String senderLogin) {
        this.senderLogin = senderLogin;
    }

    public void setSenderPassword(String senderPassword) {
        this.senderPassword = senderPassword;
    }

    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }
}