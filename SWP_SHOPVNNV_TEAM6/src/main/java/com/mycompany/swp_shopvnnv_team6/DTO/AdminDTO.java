/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swp_shopvnnv_team6.DTO;

/**
 *
 * @author duong
 */
public class AdminDTO {
    private String admin_id;
    private String user_name;
    private String password;
    private String full_name;
    private String role;
    private String email;
    private String gender;

    public AdminDTO() {
    }

    public AdminDTO(String admin_id, String user_name, String password, String full_name, String role, String email, String gender) {
        this.admin_id = admin_id;
        this.user_name = user_name;
        this.password = password;
        this.full_name = full_name;
        this.role = role;
        this.email = email;
        this.gender = gender;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
}
