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
public class PhieuChi {
    private String maPhieu;
    private String boPhan;
    private String noiDung;
    private int SoTien;

    public PhieuChi(String maPhieu, String boPhan, String noiDung, int SoTien) {
        this.maPhieu = maPhieu;
        this.boPhan = boPhan;
        this.noiDung = noiDung;
        this.SoTien = SoTien;
    }
     public PhieuChi(){
         
     }
      public PhieuChi(PhieuChi phieuChi){
        this.maPhieu = phieuChi.maPhieu;
        this.boPhan = phieuChi.boPhan;
        this.noiDung = phieuChi.noiDung;
        this.SoTien = phieuChi.SoTien;
      }
    

    public String getMaPhieu() {
        return maPhieu;
    }

    public String getBoPhan() {
        return boPhan;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public int getSoTien() {
        return SoTien;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public void setSoTien(int SoTien) {
        this.SoTien = SoTien;
    }
    
    
}
