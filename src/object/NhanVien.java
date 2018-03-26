/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String email;
    private String soDienThoai;
    private String maBoPhan;
    private Date ngaysinh;
    private String tenDangNhap;
    private String matKhau;
    private String chucVu;
    private String diachi;

    public NhanVien(String maNhanVien, String tenNhanVien, String email, String soDienThoai, String maBoPhan, Date ngaysinh, String tenDangNhap, String matKhau, String chucVu, String diachi) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.maBoPhan = maBoPhan;
        this.ngaysinh = ngaysinh;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.chucVu = chucVu;
        this.diachi = diachi;
    }

    public NhanVien() {
    }
    
    public NhanVien(NhanVien nhanvienSrc) {
        this.maNhanVien = nhanvienSrc.maNhanVien;
        this.tenNhanVien = nhanvienSrc.tenNhanVien;
        this.email = nhanvienSrc.email;
        this.soDienThoai = nhanvienSrc.soDienThoai;
        this.maBoPhan = nhanvienSrc.maBoPhan;
        this.ngaysinh = nhanvienSrc.ngaysinh;
        this.tenDangNhap = nhanvienSrc.tenDangNhap;
        this.matKhau = nhanvienSrc.matKhau;
        this.chucVu = nhanvienSrc.chucVu;
        this.diachi = nhanvienSrc.diachi;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
    
    
}
