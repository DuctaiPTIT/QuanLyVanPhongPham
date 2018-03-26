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
public class ChiTietDonBanHang {
    private String maDonBanHang;
    private String maSanPham;
    private int soLuong;
    private int gia;

    public ChiTietDonBanHang(String maDonBanHang, String maSanPham, int soLuong, int gia) {
        this.maDonBanHang = maDonBanHang;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.gia = gia;
    }
    public ChiTietDonBanHang(ChiTietDonBanHang chiTietDonBanHang){
       this.maDonBanHang = chiTietDonBanHang.maDonBanHang;
        this.maSanPham = chiTietDonBanHang.maSanPham;
        this.soLuong = chiTietDonBanHang.soLuong;
        this.gia  = chiTietDonBanHang.gia;
    }
    
    public ChiTietDonBanHang(){
        
      
    }

    public String getMaDonBanHang() {
        return maDonBanHang;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getGia() {
        return gia;
    }

    public void setMaDonBanHang(String maDonBanHang) {
        this.maDonBanHang = maDonBanHang;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
    
}
