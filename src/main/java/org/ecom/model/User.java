package org.ecom.model;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {

    public User() {}


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public User(int id, String emailId, String userName, String password) {
        super();
        this.id = id;
        this.emailId = emailId;
        this.userName = userName;
        this.password = password;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="email")
    private String emailId;
    @Column(name="user_name")
    private String userName;
    private String password;


}
