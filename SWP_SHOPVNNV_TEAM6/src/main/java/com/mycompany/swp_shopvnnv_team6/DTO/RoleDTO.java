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
public class RoleDTO {
    private String role_id;
    private Timestamp created_date;
    private String role_name;
    private String description;

    public RoleDTO() {
    }

    public RoleDTO(String role_id, Timestamp created_date, String role_name, String description) {
        this.role_id = role_id;
        this.created_date = created_date;
        this.role_name = role_name;
        this.description = description;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public Timestamp getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Timestamp created_date) {
        this.created_date = created_date;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
