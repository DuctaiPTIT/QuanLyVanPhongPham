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

public class SanPham extends ObjectVPP{
    private String Ten;
    private String DonVi;
    private int SoLuong;
    private boolean TinhTrang;
    private int DonGia;
    private String NhaCungCap;;
    public SanPham(){
        super();
        Ten=new String();
        DonVi=new String();
        SoLuong=0;
        TinhTrang=false;
        DonGia=0;
        NhaCungCap=new String();
    }
    public static String isLetter(String Ten){
        if (Ten.isEmpty()) return "Rỗng";
        for (int i=0;i<Ten.length();i++){
            if (!Character.isLetter(Ten.charAt(i)) 
                    || Ten.charAt(i)!=' '
                    || !Character.isDigit(Ten.charAt(i))
                    ) 
                return "Chỉ chứa kí tự";
        } 
        return null;
    }
    public static int isNumber(String Number){
        if (Number.isEmpty()) return 0;
        for (int i=0;i<Number.length();i++)
            if (!Character.isDigit(Number.charAt(i))) return -1;
        byte[] number=Number.getBytes();
        int k=0,n=Number.length();
        for (int i=0;i<n;i++)
            k=k*10+number[i]-48;
        return k;
    }
    public String getTen(){
        return Ten;
    }
    public String getDonVi(){
        return DonVi;
    }
    public int getSoLuong(){
        return SoLuong;
    }
    public boolean getTinhTrang(){
        return TinhTrang;
    }
    public int getDonGia(){
        return DonGia;
    }
    public String getNhaCungCap(){
        return NhaCungCap;
    }
    public void setTen(String Ten){
        if (SanPham.isLetter(Ten)==null) this.Ten=Ten;
    }
    public void setDonVi(String DonVi){
        this.DonVi=DonVi;
    }
    public void setTinhTrang(boolean flag){
        TinhTrang=flag;
    }
    public void setDonGia(int DonGia){
        if (DonGia>=0) this.DonGia=DonGia;
    }
    public void setDonGia(String DonGia){
        int i=SanPham.isNumber(DonGia);
        if (i!=-1) this.DonGia=i;
    }
    public void setSoLuong(int SoLuong){
        if (SoLuong>=0) this.SoLuong=SoLuong;
    }
    public void setNhaCungCap(String NhaCungCap){
        this.NhaCungCap=NhaCungCap;
    }
}
