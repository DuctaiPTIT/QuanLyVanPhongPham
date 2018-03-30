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
import java.util.Date;
/**
 *
 * @author phnam
 */
public class SQLNhanVien extends SQLConnect{
    public SQLNhanVien(){}
    
    @Override
    public void insert(ObjectVPP O){
        NhanVien nv=(NhanVien)O;
        try {
            String sql="insert into NHANVIEN (MANV,TENNV,SDT,DIACHI,MABP"
                    + ",NGAYSINH,CHUCVU) values ("
                    +nv.getMa()+","+nv.getTen()+","+nv.getSoDienThoai()+","
                    +nv.getDiaChi()+","+nv.getDiaChi()+","+nv.getMaPhongBan()+","
                    +nv.getNgaySinh()+","+nv.getChucVu()+");";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void update(ObjectVPP O){
        NhanVien nv=(NhanVien)O;
        try {
            String sql="update NHANVIEN "
                    + "set MANV=?,TENNV=?,SDT=?,DIACHI=?,MABPP=?"
                    + ",NGAYSINH=?,CHUCVU=?" 
                    + "where MA=?;";
            Date date=new SimpleDateFormat("dd/MM/yyyy")
                    .parse(nv.getNgaySinh());
            PreparedStatement pre=conn.prepareStatement(sql);
            pre.setString(0,nv.getMa());
            pre.setString(1,nv.getTen());
            pre.setString(2,nv.getSoDienThoai());
            pre.setString(3,nv.getDiaChi());
            pre.setString(4,nv.getMaPhongBan());
            pre.setDate(5,new java.sql.Date(date.getTime()));
            pre.setString(6,nv.getChucVu());
            pre.setString(7,nv.getMa());
            pre.executeUpdate();
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public ArrayList<NhanVien> select(String dieukien){
        /*
         * hàm này có thể không trả(Kích thước trả về là 0) hoặc trả nhiều kết quả
         * tùy vào điều kiện
         */
        ResultSet rs=null;
        
        ArrayList<NhanVien> a=new ArrayList<NhanVien>();
        try {
            Statement statement = conn.createStatement();
            String sql="select * from NHANVIEN where "+dieukien+";";
            rs=statement.executeQuery(sql);
            while (rs.next()){
                NhanVien nv;
                nv=new NhanVien();
                nv.setMa(rs.getString("MANV"));
                nv.setTen(rs.getString("TENNV"));
                nv.setSoDienThoai(rs.getString("SDT"));
                nv.setDiaChi(rs.getString("DIACHI"));
                nv.setEmail(rs.getString("EMAIL"));
                nv.setNgaySinh(rs.getString("NGAYSINH"));
                nv.setChucVu(rs.getString("CHUCVU"));
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
