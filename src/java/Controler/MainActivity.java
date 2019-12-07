/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Dao.DAO_KhachHang;
import Dao.DAO_MatHang;
import Model.HoaDonChiTiet;
import Model.KhachHang;
import Model.MatHang;
import Model.NhanVien;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    HashMap<HttpSession, Boolean> state_session = new HashMap<>();
    HashMap<HttpSession, KhachHang> map_sess_customer = new HashMap<>();
    HashMap<HttpSession, NhanVien> map_sess_employee = new HashMap<>();
    HashMap<HttpSession, ArrayList<MatHang>> map_sess_list_mh = new HashMap<>();
    HashMap<HttpSession, ArrayList<MatHang>> map_sess_list_mh_buy = new HashMap<>();
    ArrayList<MatHang> list_all_mh = new ArrayList<>();
    
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        try {
            request = (HttpServletRequest) req;
            response = (HttpServletResponse) res;
        } catch (ClassCastException e){
            System.err.println("Erro.........." + e.getMessage());
        }
        System.out.println("session coonect: ");
        service(request, response);
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();
        HttpSession session = request.getSession();
        System.out.println("session coonect: " + session);
        if (state_session.get(session) == null) {
            state_session.put(session, true);
        }
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
        // xem set session is running
        HttpSession sess_connect =  request.getSession();
        
        // Init DAO Mat Hang
        DAO_MatHang daomh = new DAO_MatHang();
        
        //lay ten de tim kiem. If == null thi get all . (index.jsp)
        String name_find = request.getParameter("txt_name_product");
        
        // set event button image click. (index.jsp)
        String button_image = (String) request.getParameter("button_image");
        
        // set state button click "Dang ky Mua" and "Them Gio Hang"
        String button_click_mua = request.getParameter("click_button_display_product");
        
        if (name_find == null && button_image == null && button_click_mua == null) {
            // hien thi tat ca cac mat hang (index.jsp)
            list_all_mh = daomh.get_all_MatHang();
            request.setAttribute("get_all_product", list_all_mh);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            if (name_find != null) {
                name_find = request.getParameter("txt_name_product");
                System.out.println("tim kiem theo ten");
                // hien thi danh sach mat hang theo ten (index.jsp)
                list_all_mh = daomh.get_MatHang_theo_ten(name_find);
                request.setAttribute("get_all_product", list_all_mh);
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
        }
        
        if (button_image!=null) {
            // set event button image. Hien thi thong tin san pham (display_product.jsp)
            int index = Integer.parseInt(button_image.trim());
            System.out.println("button_image : " + index);
            request.setAttribute("display_san_pham", list_all_mh.get(index));
            request.getRequestDispatcher("/display_product.jsp").forward(request, response);
        }
        
       
        if (button_click_mua != null) {
            if (button_click_mua.compareTo("Dang Ky Mua") == 0) {
                KhachHang kh_sess = map_sess_customer.get(sess_connect);
                if (kh_sess == null) {
                    request.getRequestDispatcher("/frame_login.jsp").forward(request, response);
                }
            }
            if (button_click_mua.compareTo("Them Gio Hang") == 0) {
                KhachHang kh_sess = map_sess_customer.get(sess_connect);
                if (kh_sess == null) {
                    request.getRequestDispatcher("/frame_login.jsp").forward(request, response);
                }
            }
        }
        
        
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
        String act_login = request.getParameter("act_login");
        if (act_login!= null) {
            if (act_login.compareTo("Login")==0) {
                ArrayList<HoaDonChiTiet> list_hdct =null;
                request.setAttribute("list_hdct", list_hdct);
                request.getRequestDispatcher("/frame_buy.jsp").forward(request, response);
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
