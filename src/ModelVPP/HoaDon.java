/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelVPP;
import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author phnam
 */

public class HoaDon extends ObjectVPP{
    private Date NgayTao;
    private String MaNV;
    private int TongTien;
    private boolean ChuyenKhoan;
    private boolean TienMat;
    private String MaKhachHang;
    private ArrayList<SanPham> DSSP;
    public HoaDon(){
        super();
        NgayTao=null;
        DSSP=new ArrayList<SanPham>();;
    }
    public static boolean isHour(int hour, int min, int sec){
        if (0>hour && hour>23) return false;
        if (0>min && min>59) return false;
        if (0>sec && sec>60) return false;
        return true;
    }
    public static boolean isHour(String hour){
        if (hour.length()!=8) return false;
        byte[] _hour=hour.getBytes();
        int hh=(_hour[0]-48)*10+_hour[1]-48;
        int min=(_hour[2]-48)*10+_hour[3]-48;
        int sec=(_hour[5]-48)*10+_hour[6]-48;
        return HoaDon.isHour(hh, min, sec);
    }
    public static boolean isDate(String Date){
        if (Date.length()!=18) return false;
        return ObjectVPP.isDate(Date.substring(0, 10)) && HoaDon.isHour(Date.substring(12));
    }
    public int hasSanPham(String SanPham){
        for (int i=0;i<DSSP.size();i++){
            SanPham sp=DSSP.get(i);
            if (sp.equals(SanPham)) return i;
        }
        return -1;
    }
    public int hasSanPham(SanPham sp){
        return hasSanPham(sp.getMa());
    }
    public String getNgayTao(){
        if (NgayTao==null) return null;
        SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return dateformat.format(NgayTao);
    }
    public SanPham getSanPham(String sp){
        int i=hasSanPham(sp);
        if (i!=-1) return DSSP.get(i);
        return null;
    }
    public SanPham getSanPham(int index){
        if (index<0) return null;
        return DSSP.get(index);
    }
    public ArrayList<SanPham> getDSSP(){
        return DSSP;
    }
    public String getMaNhanVien(){
        return MaNV;
    }
    public String getMaKhachHang(){
        return MaKhachHang;
    }
    public int getTongTien(){
        return TongTien;
    } 
    public boolean getChuyenKhoan(){
        return ChuyenKhoan;
    }
    public boolean getTienMat(){
        return TienMat;
    }
    public void setNgayTao(String NgayTao){
        try {
            if (NgayTao.length()!=18) return;
            if (HoaDon.isDate(NgayTao)==false) return;
            SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
            this.NgayTao=dateformat.parse(NgayTao);
        } catch (ParseException ex) {
            Logger.getLogger(HoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void addSanPham(SanPham sp){
        if (hasSanPham(sp)!=-1) DSSP.add(sp);
    }
    public int removeSanPham(String sp){
        int i=hasSanPham(sp);
        if (i!=-1) DSSP.remove(i);
        return i;
    }
    public int removeSanPham(int sp){
        if (sp>=0) DSSP.remove(sp);
        return sp;
    }
    public int removeSanPham(SanPham sp){
        return removeSanPham(sp.getMa());
    }
    public void setMaNV(String MaNV){
        this.MaNV=MaNV;
    }
    public void setMaKhachHang(String MaKhachHang){
        this.MaKhachHang=MaKhachHang;
    }
    public void setTongTien(int TongTien){
        if (TongTien>0) this.TongTien=TongTien;
    }
    public void setChuyenKhoan(boolean flag){
        ChuyenKhoan=flag;
        TienMat=!flag;
    }
    public void setTienMat(boolean flag){
        TienMat=flag;
        ChuyenKhoan=!flag;
    }
}
