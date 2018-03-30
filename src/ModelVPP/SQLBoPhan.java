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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phnam
 */
public class SQLBoPhan extends SQLConnect{
    public SQLBoPhan(){}

    @Override
    public void insert(ObjectVPP O) {
        try {
            BoPhan bp=(BoPhan)O;
            String sql="insert into BOPHAN set"
                    + "MABP=?,TENBP=?,NVQL=?;";
            PreparedStatement pre=conn.prepareCall(sql);
            pre.setString(0, bp.getMa());
            pre.setString(1, bp.getTenBoPhan());
            pre.setString(2, bp.getMaNVQuanLy());
            pre.executeUpdate();
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLBoPhan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ObjectVPP O) {
        BoPhan bp=(BoPhan)O;
        try {
            String sql="update BOPHAN set"
                    + "TENBP=?,NVQL=?"
                    + "where MABP=?;";
            PreparedStatement pre=conn.prepareCall(sql);
            pre.setString(0, bp.getTenBoPhan());
            pre.setString(1, bp.getMaNVQuanLy());
            pre.setString(2, bp.getMa());
            pre.executeUpdate();
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLBoPhan.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<NhanVien> ds=bp.getDSNV();
        String sql="update NHANVIEN set"
                + "MABP=? where MANV=?;";
        for (int i=0;i<ds.size();i++){
            try {
                NhanVien nv=ds.get(i);
                PreparedStatement pre=conn.prepareCall(sql);
                pre.setString(0, nv.getMaPhongBan());
                pre.setString(1,nv.getMa());
                pre.executeUpdate();
                pre.close();
            } catch (SQLException ex) {
                Logger.getLogger(SQLBoPhan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ArrayList<BoPhan> select(String dieukien) {
        ArrayList<BoPhan> ds=new ArrayList<BoPhan>();
        try {
            
            String sql="select * from BOPHAN where "+dieukien+";";
            Statement state=conn.createStatement();
            ResultSet rs=state.executeQuery(sql);
            while (rs.next()){
                BoPhan bp=new BoPhan();
                bp.setMa(rs.getString("MABP"));
                bp.setTenBoPhan(rs.getString("TEN"));
                bp.setMaNVQuanLy(rs.getString("NVQL"));
                ds.add(bp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLBoPhan.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i=0;i<ds.size();i++){
            BoPhan bp=ds.get(i);
            ArrayList<NhanVien> dsnv=new SQLNhanVien().select(""
                    + "MABP='"+bp.getMa()+"'");
            for (int j=0;j<dsnv.size();j++)
                bp.addNhanVien(dsnv.get(i));
        }
        return ds;
    }
}
