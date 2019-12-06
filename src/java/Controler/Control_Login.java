/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Dao.DAO_KhachHang;
import Model.HoaDonChiTiet;
import Model.MatHang;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hunglv
 */
public class Control_Login extends HttpServlet {

    

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
        DAO_KhachHang daokh = new DAO_KhachHang();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession sess =  request.getSession();
        String act = request.getParameter("act_login");
        System.out.println("POST: " + sess.getId());
        if (act == null) {
            request.getRequestDispatcher("/frame_login.jsp").forward(request, response);
        } else {
            if (act.equals("Login")) {
                System.out.println("Login.................");
                try {
                    boolean state = daokh.check_login(username, password);
                    if (state == true) {
                        ArrayList<HoaDonChiTiet> list_hdct = new ArrayList<>();
                        MatHang mh = new MatHang(1, "ao", 100, 100, 200, "Do", "M", "abc", "abc");
                        list_hdct.add(new HoaDonChiTiet(1, 3, 3, mh));
                        list_hdct.add(new HoaDonChiTiet(1, 4, 6, mh));
                        request.setAttribute("list_hdct", list_hdct);
                        request.getRequestDispatcher("/frame_buy.jsp").forward(request, response);
                    } else {
                        request.getRequestDispatcher("/frame_login.jsp").forward(request, response);
                    }
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                if (act.equals("Register")) {
                    System.out.println("Register....................");
                } else {
                    request.getRequestDispatcher("/frame_login.jsp").forward(request, response);
                }
            }
        }
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
