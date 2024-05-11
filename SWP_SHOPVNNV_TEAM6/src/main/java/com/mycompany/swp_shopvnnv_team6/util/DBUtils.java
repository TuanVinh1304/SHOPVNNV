/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swp_shopvnnv_team6.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author TUONG VY
 */
public class DBUtils {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=ShopVNNV;encrypt=true;trustServerCertificate=true;";
        conn = DriverManager.getConnection(url, "sa", "12345");
        return conn;
    }
    
//public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Connection c = getConnection();
//        if (c == null) {
//            System.out.println("something wrong");
//        } else {
//            System.out.println("ok");
//        }
//}
}

