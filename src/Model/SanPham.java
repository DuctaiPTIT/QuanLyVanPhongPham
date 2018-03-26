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
public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String donVi;
    private int soLuong;
    private boolean tinhTrang;
    private int donGia;

    public SanPham(String maSanPham, String tenSanPham, String donVi, int soLuong, boolean tinhTrang, int donGia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donVi = donVi;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
        this.donGia = donGia;
    }
    public SanPham(){
        
    }
    public SanPham(SanPham sanPham){
        this.maSanPham = sanPham.maSanPham;
        this.tenSanPham = sanPham.tenSanPham;
        this.donVi = sanPham.donVi;
        this.soLuong = sanPham.soLuong;
        this.tinhTrang = sanPham.tinhTrang;
        this.donGia = sanPham.donGia;
    }
    

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getDonVi() {
        return donVi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
    
}
