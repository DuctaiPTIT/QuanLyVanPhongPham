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
public class ChiTietDonNhapHang {
    private String maDonNhapHang;
    private String maSanPham;
    private int donGia;
    private int soLuong;

    public ChiTietDonNhapHang(String maDonNhapHang, String maSanPham, int donGia, int soLuong) {
        this.maDonNhapHang = maDonNhapHang;
        this.maSanPham = maSanPham;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
     public ChiTietDonNhapHang(){
         
     }
     public ChiTietDonNhapHang(ChiTietDonNhapHang chiTietDonNhapHang){
        this.maDonNhapHang = chiTietDonNhapHang.maDonNhapHang;
        this.maSanPham = chiTietDonNhapHang.maSanPham;
        this.donGia = chiTietDonNhapHang.donGia;
        this.soLuong = chiTietDonNhapHang.soLuong;
     }
    

    public String getMaDonNhapHang() {
        return maDonNhapHang;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public int getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setMaDonNhapHang(String maDonNhapHang) {
        this.maDonNhapHang = maDonNhapHang;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
