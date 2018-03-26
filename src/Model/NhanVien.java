/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author levua
 */
public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String soDienThoai;
    private String diaChi;
    private String email;
    private String maSanPham;
    private Date ngaySinh;
    private String tenDangNhap;
    private String matKhau;
    private String chucVu;
    private boolean choPhepQuanLyNhanVien;
    private boolean choPhepQuanLyThongKe;
    private boolean choPhepQuanLyThuChi;

    public NhanVien(String maNhanVien, String tenNhanVien, String soDienThoai, String diaChi, String email, String maSanPham, Date ngaySinh, String tenDangNhap, String matKhau, String chucVu, boolean choPhepQuanLyNhanVien, boolean choPhepQuanLyThongKe, boolean choPhepQuanLyThuChi) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.email = email;
        this.maSanPham = maSanPham;
        this.ngaySinh = ngaySinh;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.chucVu = chucVu;
        this.choPhepQuanLyNhanVien = choPhepQuanLyNhanVien;
        this.choPhepQuanLyThongKe = choPhepQuanLyThongKe;
        this.choPhepQuanLyThuChi = choPhepQuanLyThuChi;
    }
     public NhanVien(){
         
     }
      public NhanVien(NhanVien nhanVien){
           this.maNhanVien = nhanVien.maNhanVien;
        this.tenNhanVien = nhanVien.tenNhanVien;
        this.soDienThoai = nhanVien.soDienThoai;
        this.diaChi = nhanVien.diaChi;
        this.email = nhanVien.email;
        this.maSanPham = nhanVien.maSanPham;
        this.ngaySinh = nhanVien.ngaySinh;
        this.tenDangNhap = nhanVien.tenDangNhap;
        this.matKhau = nhanVien.matKhau;
        this.chucVu = nhanVien.chucVu;
        this.choPhepQuanLyNhanVien = nhanVien.choPhepQuanLyNhanVien;
        this.choPhepQuanLyThongKe = nhanVien.choPhepQuanLyThongKe;
        this.choPhepQuanLyThuChi = nhanVien.choPhepQuanLyThuChi;
          
      }
    

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getEmail() {
        return email;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getChucVu() {
        return chucVu;
    }

    public boolean isChoPhepQuanLyNhanVien() {
        return choPhepQuanLyNhanVien;
    }

    public boolean isChoPhepQuanLyThongKe() {
        return choPhepQuanLyThongKe;
    }

    public boolean isChoPhepQuanLyThuChi() {
        return choPhepQuanLyThuChi;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setChoPhepQuanLyNhanVien(boolean choPhepQuanLyNhanVien) {
        this.choPhepQuanLyNhanVien = choPhepQuanLyNhanVien;
    }

    public void setChoPhepQuanLyThongKe(boolean choPhepQuanLyThongKe) {
        this.choPhepQuanLyThongKe = choPhepQuanLyThongKe;
    }

    public void setChoPhepQuanLyThuChi(boolean choPhepQuanLyThuChi) {
        this.choPhepQuanLyThuChi = choPhepQuanLyThuChi;
    }
    
    
    
    
    
}
