/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.MatHang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hunglv
 */
public class DAO_MatHang extends DAO{
    public ArrayList<MatHang> get_all_MatHang() {
        ArrayList<MatHang> list_mh = new ArrayList<>();
        
        String sql = "SELECT * FROM mathang";
        try {
            Connection con = getConnectDB();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                int soLuong = rs.getInt("soLuong");
                float giaNhap = rs.getFloat("giaNhap");
                float giaBan = rs.getFloat("giaBan");
                String mauSac = rs.getString("mauSac");
                String kichCo = rs.getString("kichCo");
                String url_iamge = rs.getString("url");
                String url = url_iamge.substring(4, url_iamge.length());
                String moTa = rs.getString("moTa");
                MatHang mh = new MatHang(id, ten, soLuong, 
                                    giaNhap, giaBan, mauSac, kichCo, url, moTa);
                
                // khong ton tai 2 san pham trong cung 1 list
                if (check_exist_mh(list_mh, ten) == false)
                    list_mh.add(mh);
               
                if (list_mh.size() >= 16) {
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_MatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_mh;
    }
    
    public ArrayList<MatHang> get_MatHang_theo_ten(String name_product) {
        ArrayList<MatHang> list_mh = new ArrayList<>();
        
        String sql = "SELECT * FROM mathang";
        try {
            Connection con = getConnectDB();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                if (ten.indexOf(name_product) ==-1) {
                    continue;
                }
                int soLuong = rs.getInt("soLuong");
                float giaNhap = rs.getFloat("giaNhap");
                float giaBan = rs.getFloat("giaBan");
                String mauSac = rs.getString("mauSac");
                String kichCo = rs.getString("kichCo");
                String url_iamge = rs.getString("url");
                String url = url_iamge.substring(4, url_iamge.length());
                String moTa = rs.getString("moTa");
                MatHang mh = new MatHang(id, ten, soLuong, 
                                    giaNhap, giaBan, mauSac, kichCo, url, moTa);
                
                // khong ton tai 2 san pham trong cung 1 list
                if (check_exist_mh(list_mh, ten) == false)
                    list_mh.add(mh);
               
                if (list_mh.size() >= 16) {
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_MatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_mh;
    }
    
    private boolean check_exist_mh(ArrayList<MatHang> list_mh, String ten) {
        for (MatHang mh: list_mh) {
            if (ten.compareTo(mh.getTen()) == 0) {
                return true;
            }
        }
        return false;
    }
}
