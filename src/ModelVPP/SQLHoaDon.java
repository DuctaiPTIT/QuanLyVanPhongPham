/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelVPP;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phnam
 */
public class SQLHoaDon extends SQLConnect{
    public SQLHoaDon(){}
    @Override
    public void insert(ObjectVPP O) {
        HoaDon hd=(HoaDon)O;
        try {
            String sql="insert into DONBANHANG set"
                    + "MADONBANHANG=?,MANV=?,TONGTIEN=?,NGAYGIO=?,CHUYENKHOAN=?"
                    + ",TIENMAT=?,MAKHACHHANG=?;";
            
            
            java.util.Date udate= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
                    .parse(hd.getNgayTao());
            java.sql.Date date=new java.sql.Date(udate.getTime());
            PreparedStatement pre=conn.prepareCall(sql);
            
            
            pre.setString(0,hd.getMa());
            pre.setString(1, hd.getMaNhanVien());
            pre.setInt(2,hd.getTongTien());
            pre.setDate(3, date);
            pre.setBoolean(4,hd.getChuyenKhoan());
            pre.setBoolean(5, hd.getTienMat());
            pre.setString(6, hd.getMaKhachHang());
            pre.executeUpdate();
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex){
            Logger.getLogger(SQLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        ArrayList<SanPham> ds=hd.getDSSP();
        String sql="insert into CHITIETDONBANHANG set"
                + "MADONBANHANG=?,MASP=?,SOLUONG=?,GIA=?;";
        
        
        for (int i=0;i<ds.size();i++){
            try {
                
                SanPham sp=ds.get(i);
                PreparedStatement pre=conn.prepareCall(sql);
                
                pre.setString(0, hd.getMa());
                pre.setString(1, sp.getMa());
                pre.setInt(2, sp.getSoLuong());
                pre.setInt(3, sp.getDonGia());
                pre.executeUpdate();
                pre.close();
            } catch (SQLException ex) {
                Logger.getLogger(SQLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    @Override
    public void update(ObjectVPP O) {
        try {
            HoaDon hd=(HoaDon)O;
            String sql="update DONBANHANG set"
                    + "MANV=?,TONGTIEN=?,NGAYGIO=?,CHUYENKHOAN=?"
                    + ",TIENMAT=?,MAKHACHHANG=?"
                    + "where MADONBANHANG='"+hd.getMa()+";";
            PreparedStatement pre=conn.prepareCall(sql);
            java.util.Date udate=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(hd.getNgayTao());
            java.sql.Date date=new java.sql.Date(udate.getTime());
            pre.setString(0, hd.getMaNhanVien());
            pre.setInt(1, hd.getTongTien());
            pre.setDate(2,date);
            pre.executeUpdate();
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } catch(ParseException ex){
            Logger.getLogger(SQLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<HoaDon> select(String dieukien) {
        ArrayList<HoaDon> ds=new ArrayList<HoaDon>();
        try {
            String sql="select* from DONBANHANG where "+dieukien+";";
            Statement state=conn.createStatement();
            ResultSet rs=state.executeQuery(sql);
            while (rs.next()){
                HoaDon hd=new HoaDon();
                java.sql.Date date=rs.getDate("NGAYTAO");
                String ngaytao=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(date);
                hd.setMa(rs.getString("MADONBANHANG"));
                hd.setMaKhachHang(rs.getString("MAKHACHHANG"));
                hd.setMaNV(rs.getString("MANV"));
                hd.setTongTien(rs.getInt("TONGTIEN"));
                hd.setChuyenKhoan(rs.getBoolean("CHUYENKHOAN"));
                hd.setTienMat(rs.getBoolean("TIENMAT"));
                hd.setNgayTao(ngaytao);
                ds.add(hd);
            }
            rs.close();
            state.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i=0;i<ds.size();i++){
            try {
                HoaDon hd=ds.get(i);
                String sql="select MA,SOLUONG,DONGIA from CHITIETDONBANHANG where "
                        + hd.getMa()+";";
                ArrayList<SanPham> dssp=new ArrayList<SanPham>();
                Statement state=conn.createStatement();
                ResultSet rs=state.executeQuery(sql);
                while (rs.next()){
                    SanPham sp=new SanPham();
                    sp.setMa(rs.getString("MA"));
                    sp.setDonGia(rs.getInt("DONGIA"));
                    sp.setSoLuong(rs.getInt("SOLUONG"));
                    dssp.add(sp);
                }
                rs.close();
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(SQLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ds;
    }
    
}
