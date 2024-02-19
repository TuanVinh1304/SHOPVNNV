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
public class PromotionDTO {
    private String promotion_id;
    private String promotion_name;
    private Timestamp created_date;
    private Timestamp start_date;
    private Timestamp end_date;
    private String code;
    private String description;
    private String image_url;
    private String category_id;
    private String product_id;
    private String order_id;

    public PromotionDTO() {
    }

    public PromotionDTO(String promotion_id, String promotion_name, Timestamp created_date, Timestamp start_date, Timestamp end_date, String code, String description, String image_url, String category_id, String product_id, String order_id) {
        this.promotion_id = promotion_id;
        this.promotion_name = promotion_name;
        this.created_date = created_date;
        this.start_date = start_date;
        this.end_date = end_date;
        this.code = code;
        this.description = description;
        this.image_url = image_url;
        this.category_id = category_id;
        this.product_id = product_id;
        this.order_id = order_id;
    }

    public String getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(String promotion_id) {
        this.promotion_id = promotion_id;
    }

    public String getPromotion_name() {
        return promotion_name;
    }

    public void setPromotion_name(String promotion_name) {
        this.promotion_name = promotion_name;
    }

    public Timestamp getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Timestamp created_date) {
        this.created_date = created_date;
    }

    public Timestamp getStart_date() {
        return start_date;
    }

    public void setStart_date(Timestamp start_date) {
        this.start_date = start_date;
    }

    public Timestamp getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Timestamp end_date) {
        this.end_date = end_date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
    
    
    
}
