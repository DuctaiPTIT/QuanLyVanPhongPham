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
    protected static Statement state=null;
    protected static Connection conn=null;
    public static boolean createSQLConnect(String id, String pass){
        if (state!=null) return false;
        if (id.isEmpty() || pass.isEmpty()) return false;
        String url="jdbc:sqlserver://localhost:1433;" +  
         "databaseName=QuanLyVPP;user="+id+";password="+pass;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection(url); 
            state=conn.createStatement();
            System.out.println("Ket noi SQL");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
                Logger.getLogger(SQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            state.close();
            conn.close();
            System.out.println("Ngat ket noi SQL");
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }
    public abstract void insert(ObjectVPP O); ///Thêm đối tượng vào database
    public abstract void update(ObjectVPP O); ///Sửa thông tin đối tượng trên database
    public abstract ArrayList select(String dieukien);///Lấy thông tin đối tượng
                            ////điều kiện là các trường cot1='cot1' and cot2='cot2' and ...
}
