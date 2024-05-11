/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swp_shopvnnv_team6.DAO;

import com.mycompany.swp_shopvnnv_team6.DTO.UserDTO;
import com.mycompany.swp_shopvnnv_team6.util.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TUONG VY
 */
public class UserDAO {

    UserDTO user = null;
    Connection conn = null;
    PreparedStatement stm = null;
    ResultSet rs = null;

    public UserDTO checkLogin(String email, String password) throws SQLException, Exception {
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT *\n" +
"  FROM [dbo].[User] us\n" +
"  JOIN Role role\n" +
"  ON us.roleId = role.roleId\n" +
"  WHERE email= ? AND password=?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    String userId = rs.getString("userId");
                    String firstName = rs.getString("firstName");
                    String lastName = rs.getString("lastName");
                    String phoneNumber = rs.getString("phoneNumber");
                    String birthDay = rs.getString("birthDay");
                    String img = rs.getString("img");
                    String roleId = rs.getString("roleId");
                    user = new UserDTO(userId, firstName, lastName, email, password, phoneNumber, birthDay, img, roleId);
                }
            }
        } catch (SQLException e) {
            
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return user;
    }
}
