/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swp_shopvnnv_team6.DTO;

import java.sql.Timestamp;

/**
 *
 * @author PC
 */
public class CustomerDTO {
    private String customer_id;
    private String user_Name;
    private String full_Name;
    private String password;
    private String phone;
    private String role_id;
    private String email;
    private String address;
    private Timestamp register_date;
    private String login_by;

    public CustomerDTO() {
    }

    public CustomerDTO(String customer_id, String user_Name, String full_Name, String password, String phone, String role_id, String email, String address, Timestamp register_date, String login_by) {
        this.customer_id = customer_id;
        this.user_Name = user_Name;
        this.full_Name = full_Name;
        this.password = password;
        this.phone = phone;
        this.role_id = role_id;
        this.email = email;
        this.address = address;
        this.register_date = register_date;
        this.login_by = login_by;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getFull_Name() {
        return full_Name;
    }

    public void setFull_Name(String full_Name) {
        this.full_Name = full_Name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Timestamp register_date) {
        this.register_date = register_date;
    }

    public String getLogin_by() {
        return login_by;
    }

    public void setLogin_by(String login_by) {
        this.login_by = login_by;
    }
    
    
    
}
