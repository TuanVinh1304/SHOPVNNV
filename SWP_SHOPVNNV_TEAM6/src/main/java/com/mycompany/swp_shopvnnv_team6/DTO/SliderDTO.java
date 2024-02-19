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
public class SliderDTO {
    private String slider_id;
    private Timestamp created_date;
    private String slider_imageur;
    private String slider_name;
    private String product_id;

    public SliderDTO() {
    }

    public SliderDTO(String slider_id, Timestamp created_date, String slider_imageur, String slider_name, String product_id) {
        this.slider_id = slider_id;
        this.created_date = created_date;
        this.slider_imageur = slider_imageur;
        this.slider_name = slider_name;
        this.product_id = product_id;
    }

    public String getSlider_id() {
        return slider_id;
    }

    public void setSlider_id(String slider_id) {
        this.slider_id = slider_id;
    }

    public Timestamp getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Timestamp created_date) {
        this.created_date = created_date;
    }

    public String getSlider_imageur() {
        return slider_imageur;
    }

    public void setSlider_imageur(String slider_imageur) {
        this.slider_imageur = slider_imageur;
    }

    public String getSlider_name() {
        return slider_name;
    }

    public void setSlider_name(String slider_name) {
        this.slider_name = slider_name;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    
}
