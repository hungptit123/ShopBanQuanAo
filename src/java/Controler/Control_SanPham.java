/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.MatHang;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hunglv
 */
public class Control_SanPham extends HttpServlet {

    

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
        String id_index = request.getParameter("button_image");
        System.out.println("id index : " + id_index);
        request.getRequestDispatcher("/display_product.jsp").forward(request, response);
//        ArrayList<MatHang> list_mh = (ArrayList<MatHang>) request.getAttribute("get_all_product");
//        if (id_index!=null) {
//            int index = Integer.parseInt(id_index.trim());
//            MatHang mh = list_mh.get(index);
//            request.setAttribute("display_san_pham", mh);
//            request.getRequestDispatcher("/display_product.jsp").forward(request, response);
//        }
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
//        request.get
//        request.setAttribute("display_san_pham", new );
    
        request.getRequestDispatcher("/display_product.jsp").forward(request, response);
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
