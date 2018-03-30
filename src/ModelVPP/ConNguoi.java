/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelVPP;

/**
 *
 * @author phnam
 */
public class ConNguoi extends ObjectVPP {

    private String ten;
    private String diaChi;
    private String soDienThoai;
    private String email;

    public ConNguoi() {
        super();
        ten = new String();
        diaChi = new String();
        soDienThoai = new String();
        email = new String();
    }

    public static String isLetter(String ten) {
        if (ten.isEmpty()) {
            return "Rỗng";
        }
        for (int i = 0; i < ten.length(); i++) {
            if (!Character.isLetter(ten.charAt(i)) || ten.charAt(i) != ' ') {
                return "Chỉ chứa kí tự";
            }
        }
        return null;
    }

    public static String isSoDienThoai(String soDienThoai) {
        if (soDienThoai.isEmpty()) {
            return "Rỗng";
        }
        for (int i = 0; i < soDienThoai.length(); i++) {
            if (!Character.isDigit(soDienThoai.charAt(i))) {
                return "Chỉ chứa số";
            }
        }
        return null;
    }

    public static String isEmail(String email) {
            if (email.isEmpty()) {
                return "Rỗng";
            }
            int AC = 0, dot = 0;///AC vị trí "@", dot vị trí "."
            for (int i = 0; i < email.length(); i++) {
                if (AC == 0 && email.charAt(i) == '@') {
                    AC = i;
                }
            }
            if (AC == 0) {
                return "Form email không hợp lệ";
            }
            for (int i = 0; i < email.length(); i++) {
                if (dot == 0 && email.charAt(i) == '.') {
                    AC = i;
                }
            }
            if (dot == 0) {
                return "Tên miền email không hợp lệ";
            }
        return null;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setTen(String ten) {
        if (ConNguoi.isLetter(ten) != null) {
            this.ten = ten;
        }
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoDienThoai(String soDienThoai) {
        if (ConNguoi.isSoDienThoai(soDienThoai) != null) {
            this.soDienThoai = soDienThoai;
        }
    }

    public void setEmail(String email) {
        if (ConNguoi.isEmail(email) != null) {
            this.email = email;
        }
    }
}
