/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swp_shopvnnv_team6.DTO;

/**
 *
 * @author PC
 */
public class ConslutationDTO {
    private String conslutation_id;
    private String phone;
    private String user_name;
    private String email;
    private String room_design;
    private String description;
    private String customer_id;
    private String admin_id;
    
    public ConslutationDTO() {
    }

    public ConslutationDTO(String conslutation_id, String phone, String user_name, String email, String room_design, String description, String customer_id, String admin_id) {
        this.conslutation_id = conslutation_id;
        this.phone = phone;
        this.user_name = user_name;
        this.email = email;
        this.room_design = room_design;
        this.description = description;
        this.customer_id = customer_id;
        this.admin_id = admin_id;
    }

    public String getConslutation_id() {
        return conslutation_id;
    }

    public void setConslutation_id(String conslutation_id) {
        this.conslutation_id = conslutation_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoom_design() {
        return room_design;
    }

    public void setRoom_design(String room_design) {
        this.room_design = room_design;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    
    
}
