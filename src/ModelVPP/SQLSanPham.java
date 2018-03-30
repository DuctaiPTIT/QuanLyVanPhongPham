/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelVPP;

import static ModelVPP.SQLConnect.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phnam
 */
public class SQLSanPham extends SQLConnect{
    public SQLSanPham(){}
    @Override
    public void insert(ObjectVPP O) {
        try {
            SanPham sp=(SanPham) O;
            String sql="insert into SANPHAM set"
                    + "MA=?,TEN=?,DONVI=?,SOLUONG=?,TINHTRANG=?,DONGIA=?,NHACUNGCAP=?;";
            PreparedStatement pre=conn.prepareCall(sql);
            pre.setString(0,sp.getMa());
            pre.setString(1,sp.getTen());
            pre.setString(2,sp.getDonVi());
            pre.setInt(3, sp.getSoLuong());
            pre.setBoolean(4,sp.getTinhTrang());
            pre.setInt(5,sp.getDonGia());
            pre.setString(6,sp.getNhaCungCap());
        } catch (SQLException ex) {
            Logger.getLogger(SQLSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ObjectVPP O) {
        SanPham sp=(SanPham)O;
        try {
            String sql="update NHANVIEN "
                    + "set MA=?,TEN=?,DONVI=?,SOLUONG=?,TINHTRANG=?"
                    + ",DONGIA=?,NHACUNGCAP=?" 
                    + "where MA=?;";
            PreparedStatement pre=conn.prepareStatement(sql);
            pre.setString(0,sp.getMa());
            pre.setString(1,sp.getTen());
            pre.setString(2,sp.getDonVi());
            pre.setInt(3,sp.getSoLuong());
            pre.setBoolean(4,sp.getTinhTrang());
            pre.setInt(5,sp.getDonGia());
            pre.setString(6,sp.getNhaCungCap());
            pre.setString(7,sp.getMa());
            pre.executeUpdate();
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<SanPham> select(String dieukien) {
        ResultSet rs=null;
        
        ArrayList<SanPham> a=new ArrayList<SanPham>();
        try {
            Statement statement = conn.createStatement();
            String sql="select * from SanPham where "+dieukien+";";
            rs=statement.executeQuery(sql);
            while (rs.next()){
                SanPham nv;
                nv=new SanPham();
                nv.setMa(rs.getString("MANV"));
                nv.setTen(rs.getString("TENNV"));
                nv.setDonVi(rs.getString("DONVI"));
                nv.setTinhTrang(rs.getBoolean("TINHTRANG"));
                nv.setDonGia(rs.getInt("DONGIA"));
                nv.setNhaCungCap(rs.getString("NHACUNGCAP"));
                nv.setSoLuong(rs.getInt("SoLuong"));
                a.add(nv);
            }
            rs.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
}
