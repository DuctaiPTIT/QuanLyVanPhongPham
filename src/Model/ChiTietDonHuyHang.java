/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.logging.Logger;

/**
 *
 * @author levua
 */
public class ChiTietDonHuyHang {
    private String maDonHuyHang;
    private String maSanPham;
    private int soLuong;

    public ChiTietDonHuyHang(String maDonHuyHang, String maSanPham, int soLuong) {
        this.maDonHuyHang = maDonHuyHang;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
    }
    public ChiTietDonHuyHang(){
        
    }
    public ChiTietDonHuyHang(ChiTietDonHuyHang chiTietDonHuyHang){
        this.maDonHuyHang = chiTietDonHuyHang.maDonHuyHang;
        this.maSanPham = chiTietDonHuyHang.maSanPham;
        this.soLuong = chiTietDonHuyHang.soLuong;
    }
    

    public String getMaDonHuyHang() {
        return maDonHuyHang;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setMaDonHuyHang(String maDonHuyHang) {
        this.maDonHuyHang = maDonHuyHang;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
    
    
}
