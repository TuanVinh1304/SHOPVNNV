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
public class DeliveryStaffDTO {
    private String delivery_id;
    private String product_name;
    private String customer_name;
    private Float Total_price;
    private String phone;
    private String address;
    private Timestamp create_date;
    private String order_id;

    public DeliveryStaffDTO() {
    }

    public DeliveryStaffDTO(String delivery_id, String product_name, String customer_name, Float Total_price, String phone, String address, Timestamp create_date, String order_id) {
        this.delivery_id = delivery_id;
        this.product_name = product_name;
        this.customer_name = customer_name;
        this.Total_price = Total_price;
        this.phone = phone;
        this.address = address;
        this.create_date = create_date;
        this.order_id = order_id;
    }

    public String getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(String delivery_id) {
        this.delivery_id = delivery_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Float getTotal_price() {
        return Total_price;
    }

    public void setTotal_price(Float Total_price) {
        this.Total_price = Total_price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    
}
