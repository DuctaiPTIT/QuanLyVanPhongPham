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
public class NhaCungCap {
    private String maNhaCungCap;
    private String tenNhaCungCap;
    private String email;
    private String soDienThoai;
    private String diachi;

    public NhaCungCap() {
    }

    public NhaCungCap(String maNhaCungCap, String tenNhaCungCap, String email, String soDienThoai, String diachi) {
        this.maNhaCungCap = maNhaCungCap;
        this.tenNhaCungCap = tenNhaCungCap;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.diachi = diachi;
    }

    public NhaCungCap(NhaCungCap nhaCungCapSrc) {
        this.maNhaCungCap = nhaCungCapSrc.maNhaCungCap;
        this.tenNhaCungCap = nhaCungCapSrc.tenNhaCungCap;
        this.email = nhaCungCapSrc.email;
        this.soDienThoai = nhaCungCapSrc.soDienThoai;
        this.diachi = nhaCungCapSrc.diachi;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
    
}


