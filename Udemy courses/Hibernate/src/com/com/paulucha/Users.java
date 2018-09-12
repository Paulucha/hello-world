package com.com.paulucha;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "users")
@Table(name = "users")
public class Users {

    @Id
    @Column(name = "users_id")
    int userid;

    @Column(name = "name")
    String name;

    @Column(name = "email")
    String email;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Users( String name, String email) {

        this.name = name;
        this.email = email;
    }

    public Users() {
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
