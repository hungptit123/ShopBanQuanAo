/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Dao.DAO_KhachHang;
import Dao.DAO_MatHang;
import Model.HoaDonChiTiet;
import Model.MatHang;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 *
 * @author hunglv
 */
public class MainActivity extends HttpServlet {

    
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        try {
            request = (HttpServletRequest) req;
            response = (HttpServletResponse) res;
        } catch (ClassCastException e){
            System.err.println("Erro.........." + e.getMessage());
        }
        System.out.println("Run ServletRequest..................");
        service(request, response);
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();
        System.out.println("Run HttpServlet Request");
        if (method.equals("GET")) {
            long lastModified = getLastModified(request); // return time request
            if (lastModified == -1L) {
                doGet(request, response);
            }
        } else {
            if (method.equals("POST")) {
                doPost(request, response);
            }
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sess =  request.getSession();
        DAO_MatHang daomh = new DAO_MatHang();
        ArrayList<MatHang> list_all_mh = daomh.get_all_MatHang();
        request.setAttribute("get_all_product", list_all_mh);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        
        
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
        response.setContentType("text/html");
        
        
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
