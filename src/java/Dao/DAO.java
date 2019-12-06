/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hunglv
 */
public class DAO {
    
    public DAO(){
        
    }
    
    public Connection getConnectDB() throws SQLException {
        try {
            String hostName = "localhost";
            String dbName = "quanlybanquanao";
            String userName = "root";
            String password = "";
            String connectionURL = "jdbc:mysql://" + hostName + ":4443/" + dbName;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(connectionURL, userName, password);
            System.out.println("Connection sucessful");
            return con;
        } catch (ClassNotFoundException ex) {
            System.out.println("connection False");
        }
        return null;
    }
    public static void closeConnection(Connection conn) {
        try {
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
