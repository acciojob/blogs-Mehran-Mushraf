package com.driver.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(int id, String userName, String password, String firstName, String lastName) {
        this.id = id;
        this.username = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    ArrayList<Blog> blogList = new ArrayList<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public ArrayList<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(ArrayList<Blog> blogList) {
        this.blogList = blogList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User() {
    }
}