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
public class praktikum3 {
    public static void main(String[] args) throws ClassNotFoundException{
    try {
    String url = "jdbc:mysql://localhost:3306/pbo1";
    Class.forName("com.mysql.jdbc.Driver");
    Connection connect = DriverManager.getConnection(url,"root","541fuddin");
        System.out.println("Nyambung");
    }catch(SQLException e){
        System.out.println("Gagal Nyambung");
   }
}
    public void tampilkandata(){
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("id barang");
        tb.addColumn("nama barang");
        tb.addColumn("harga satuan");
        tb.addColumn("stok barang");
        
        try{
            String url = "jdbc:mysql://localhost:3306/pbo1";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection(url,"root","541fuddin");
            Statement st = connect.createStatement();
            String sql = "select * from master_barang";
            ResultSet rs = st.executeQuery(sql);
           
            while(rs.next()){
               tb.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4)                              
            });
          }
         // jTable1.setModel(tb);
        }catch(Exception e){            
    
        }                
  } 
}
