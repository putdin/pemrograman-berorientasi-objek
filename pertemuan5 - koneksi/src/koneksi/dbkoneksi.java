/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moh Saifuddin
 */
public class dbkoneksi {
  public static void main(String[] args) throws ClassNotFoundException{
    try {
    String url = "jdbc:mysql://localhost:3306/pbo1";
    Class.forName("com.mysql.jdbc.Driver");
    Connection conect = DriverManager.getConnection(url,"root","541fuddin");
        System.out.println("Nyambung");
    }catch(SQLException e){
        System.out.println("Gagal Nyambung");
    }
  }
}
