/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.swp_shopvnnv_team6.controller;

import com.mycompany.swp_shopvnnv_team6.DAO.UserDAO;
import com.mycompany.swp_shopvnnv_team6.DTO.UserDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author TUONG VY
 */
public class LoginController extends HttpServlet {

   private final String SEARCH_PAGE = "";
    private final String LOGIN_FAIL = "";
    private final String USER_PAGE = "home.jsp";
    private final String ADMIN_PAGE = "/adminpage/Admin.jsp";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String url = LOGIN_FAIL;

            UserDAO dao = new UserDAO();
            UserDTO user = dao.checkLogin(email, password);
            
            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("LOGIN_USER", user);
                String role = user.getRoleId();
                if ("1".equals(role)) {
                    url = SEARCH_PAGE;
                } else if ("CUS003".equals(role)) {
                    url = USER_PAGE;
                } else if ("AD001".equals(role)) {
                    url = ADMIN_PAGE;
                } else {
                    session.setAttribute("ERROR_MESSAGE", "");
                }
                Cookie cookie = new Cookie(email, password);
                cookie.setMaxAge(120 * 1);
                response.addCookie(cookie);
            }
            response.sendRedirect(url);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
