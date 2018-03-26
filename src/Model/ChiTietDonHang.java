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
public class ChiTietDonHang {
    private String maDonHang;
    private String maSanPham;
    private int soLuong;
    private int donGia;

    public ChiTietDonHang(String maDonHang, String maSanPham, int soLuong, int donGia) {
        this.maDonHang = maDonHang;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
public ChiTietDonHang(){
    
}
public ChiTietDonHang(ChiTietDonHang chiTietDonHang){
        this.maDonHang = chiTietDonHang.maDonHang;
        this.maSanPham = chiTietDonHang.maSanPham;
        this.soLuong = chiTietDonHang.soLuong;
        this.donGia = chiTietDonHang.donGia;
}

    public String getMaDonHang() {
        return maDonHang;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
    
}
