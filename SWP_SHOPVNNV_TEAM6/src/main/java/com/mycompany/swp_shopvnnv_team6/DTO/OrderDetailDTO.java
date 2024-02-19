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
public class OrderDetailDTO {
    private String ordersDetail_id;
    private Timestamp create_date;
    private String product_id;
    private String order_id;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(String ordersDetail_id, Timestamp create_date, String product_id, String order_id) {
        this.ordersDetail_id = ordersDetail_id;
        this.create_date = create_date;
        this.product_id = product_id;
        this.order_id = order_id;
    }

    public String getOrdersDetail_id() {
        return ordersDetail_id;
    }

    public void setOrdersDetail_id(String ordersDetail_id) {
        this.ordersDetail_id = ordersDetail_id;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
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
