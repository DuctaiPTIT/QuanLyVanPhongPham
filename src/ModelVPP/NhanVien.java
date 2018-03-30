/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelVPP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phnam
 */
public class NhanVien extends ConNguoi {
    /*****
     * 
     */
    private Date NgaySinh;
    private String TenDangNhap;//
    private String MatKhau;//
    private String ChucVu;
    private String MaPhongBan;
    private boolean ChoPhepQuanLyNhanVien;
    private boolean ChoPhepQuanLyThongKe;
    private boolean ChoPhepQuanLyThuChi;
    public NhanVien(){
        super();
        NgaySinh=null;
        TenDangNhap=new String();
        MatKhau=new String();
        ChucVu=new String();
        MaPhongBan=new String();
        ChoPhepQuanLyNhanVien=false;
        ChoPhepQuanLyThongKe=false;
        ChoPhepQuanLyThuChi=false;
    }
    
    
    public static String notSpecialLetter(String _String){
        /*****
         * 
         */
        int n=_String.length();
        for (int i=0;i<n;i++)
            if (!Character.isDigit(_String.charAt(i)) 
                || !Character.isLetter(_String.charAt(i))
                )
                return "Chứa kí tự đặc biệt";
        return null;
    }
    public String getNgaySinh(){
        if (NgaySinh==null) return null;
        SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
        return dateformat.format(NgaySinh);
    }
    public String getTenDangNhap(){
        return TenDangNhap;
    }
    public String getMatKhau(){
        return MatKhau;
    }
    public String getChucVu(){
        return ChucVu;
    }
    public boolean getCPQLNhanVien(){
        return ChoPhepQuanLyNhanVien;
    }
    public boolean getCPQLThongKe(){
        return ChoPhepQuanLyThongKe;
    }
    public boolean getCPQLThuChi(){
        return ChoPhepQuanLyThuChi;
    }
    public String getMaPhongBan(){
        return MaPhongBan;
    }
    public void setNgaySinh(String NgaySinh){
        try {
            if (NgaySinh.isEmpty()) return;
            if (!ObjectVPP.isDate(NgaySinh)) return;
            SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
            this.NgaySinh=dateformat.parse(NgaySinh);
        } catch (ParseException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setTenDangNhap(String TenDangNhap){
        if (NhanVien.notSpecialLetter(TenDangNhap)==null) 
            this.TenDangNhap=TenDangNhap;
    }
    public void setMatKhau(String MatKhau){
        if (NhanVien.notSpecialLetter(MatKhau)==null)
            this.MatKhau=MatKhau;
    }
    public void setChucVu(String ChucVu){
        if (NhanVien.notSpecialLetter(ChucVu)==null) this.ChucVu=ChucVu;
    }
    public void setCPQLNhanVien(boolean flag){
        ChoPhepQuanLyNhanVien=flag;
    }
    public void setCPQLThongKe(boolean flag){
        ChoPhepQuanLyThongKe=flag;
    }
    public void setCPQLThuChi(boolean flag){
        ChoPhepQuanLyThuChi=flag;
    }
}
