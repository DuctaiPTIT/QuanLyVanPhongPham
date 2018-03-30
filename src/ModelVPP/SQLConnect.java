/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelVPP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *
 * @author NguyenNam
 */
public abstract class SQLConnect {

    //protected static Statement state=null;

    public static Connection conn = null;

    public static boolean createSQLConnect() {
        //if (state!=null) return false;
        //  if (id.isEmpty() || pass.isEmpty()) return false;
        String url = "jdbc:sqlserver://localhost:49959;"
                + "databaseName=QuanLyVPP;user=" + "sa" + ";password=" + "1";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
            //state=conn.createStatement();
            System.out.println("Ket noi SQL");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public abstract void insert(ObjectVPP O); ///Thêm đối tượng vào database

    public abstract void update(ObjectVPP O); ///Sửa thông tin đối tượng trên database

    public abstract ArrayList select(String dieukien);///Lấy thông tin đối tượng
    ////điều kiện là các trường cot1='cot1' and cot2='cot2' and ...

//    public static class createSQLConnect {
//
//        public createSQLConnect() {
//        }
//    }
    public void disableConnetion() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
