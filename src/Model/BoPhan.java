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
public class BoPhan {

   
    private String maBoPhan;
    private String tenBoPhan;
    private String maNhanVienQuanLy;

    public BoPhan(String maBoPhan, String tenBoPhan, String maNhanVienQuanLy) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.maNhanVienQuanLy = maNhanVienQuanLy;
    }

    public BoPhan() {
    }

    public BoPhan(BoPhan boPhan) {
        this.maBoPhan = boPhan.maBoPhan;
        this.tenBoPhan = boPhan.tenBoPhan;
        this.maNhanVienQuanLy = boPhan.maNhanVienQuanLy;
    }
    
    public String getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public String getMaNhanVienQuanLy() {
        return maNhanVienQuanLy;
    }

    public void setMaNhanVienQuanLy(String maNhanVienQuanLy) {
        this.maNhanVienQuanLy = maNhanVienQuanLy;
    }

    
}
