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
public class ConNguoi extends ObjectVPP{
    private String Ten;
    private String DiaChi;
    private String SoDienThoai;
    private String Email;
    public ConNguoi(){
        super();
        Ten=new String();
        DiaChi=new String();
        SoDienThoai=new String();
        Email=new String();
    }
    public static String isLetter(String Ten){
        if (Ten.isEmpty()) return "Rỗng";
        for (int i=0;i<Ten.length();i++){
            if (!Character.isLetter(Ten.charAt(i)) || Ten.charAt(i)!=' ') 
                return "Chỉ chứa kí tự";
        } 
        return null;
    }
    public static String isSoDienThoai(String SoDienThoai){
        if (SoDienThoai.isEmpty()) return "Rỗng";
        for (int i=0;i<SoDienThoai.length();i++){
            if (!Character.isDigit(SoDienThoai.charAt(i))) return "Chỉ chứa số";
        }
        return null;
    }
    public static String isEmail(String Email){
        if (Email.isEmpty()) return "Rỗng";
        int AC=0,dot=0;///AC vị trí "@", dot vị trí "."
        for (int i=0;i<Email.length();i++)
            if (AC==0 && Email.charAt(i)=='@') AC=i;
        if (AC==0) return "Form email không hợp lệ";
        for (int i=0;i<Email.length();i++)
            if (dot==0 && Email.charAt(i)=='.') AC=i;
        if (dot==0) return "Tên miền email không hợp lệ";
        return null;
    }
    public String getTen(){
        return Ten;
    }
    public String getDiaChi(){
        return DiaChi;
    }
    public String getSoDienThoai(){
        return SoDienThoai;
    }
    public String getEmail(){
        return Email;
    }
    public void setTen(String Ten){
        if (ConNguoi.isLetter(Ten)==null) this.Ten=Ten;
    }
    public void setDiaChi(String DiaChi){
        this.DiaChi=DiaChi;
    }
    public void setSoDienThoai(String SoDienThoai){
        if (ConNguoi.isSoDienThoai(SoDienThoai)==null)
            this.SoDienThoai=SoDienThoai;
    }
    public void setEmail(String Email){
        if (ConNguoi.isEmail(Email)==null) this.Email=Email;
    }
}
