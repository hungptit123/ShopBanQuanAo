/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.SHA256;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hunglv
 */
public class DAO_KhachHang extends DAO{
    public boolean check_login(String username, String password) throws NoSuchAlgorithmException {
        String sql = "SELECT * FROM khachhang";
        SHA256 sha256 = new SHA256();
        try {
            Connection con = getConnectDB();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                String username_db = rs.getString("username");
                String password_db = rs.getString("password");
                if (username_db.compareTo(username) == 0 &&
                        password_db.compareTo(sha256.getSHA256(password))==0) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            
        }
        return false;
    }
    
}
