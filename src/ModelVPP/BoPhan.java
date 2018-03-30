/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelVPP;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author phnam
 */
public class BoPhan extends ObjectVPP{
    private String TenBoPhan;
    private ArrayList<NhanVien> DSNV;
    private String MaNVQuanLy;
    public BoPhan(){
        super();
        TenBoPhan=new String();
        DSNV=new ArrayList<NhanVien>();
        MaNVQuanLy=new String();
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
    public int hasNhanVien(String nv){
        for (int i=0;i<DSNV.size();i++){
            NhanVien a=DSNV.get(i);
            if (a.equals(nv)) return i;
        }
        return -1;
    }
    public int hasNhanVien(NhanVien nv){
        return hasNhanVien(nv.getMa());
    }
    public String getTenBoPhan(){
        return TenBoPhan;
    }
    public String getMaNVQuanLy(){
        return MaNVQuanLy;
    }
    public ArrayList<NhanVien> getDSNV(){
        return DSNV;
    }
    public NhanVien getNhanVien(int index){
        if (index<0) return null;
        return DSNV.get(index);
    }
    public NhanVien getNhanVien(String nv){
        if (nv.isEmpty()) return null;
        int i=hasNhanVien(nv);
        if (i!=-1) return DSNV.get(i);
        return null;
    }
    public String getMaNVQLL(){
        return MaNVQuanLy;
    }
    public void setTenBoPhan(String TenBoPhan){
        if (BoPhan.isLetter(TenBoPhan)==null) this.TenBoPhan=TenBoPhan;
    }
    public void setMaNVQuanLy(String MaNVQuanLy){
        this.MaNVQuanLy=MaNVQuanLy;
    }
    public void addNhanVien(NhanVien a){
        if (hasNhanVien(a)==-1) DSNV.add(a);
    }
    public int removeNhanVien(int index){
        if (index!=-1){
            NhanVien nv=DSNV.get(index);
            if (nv.equals(MaNVQuanLy)) MaNVQuanLy="";
            DSNV.remove(index);
        }
        return index;
    }
    public int removeNhanVien(String nv){
        int i=hasNhanVien(nv);
        if (i!=-1) DSNV.remove(i);
        return i;
    }
    public int removeNhanVien(NhanVien nv){
        return removeNhanVien(nv.getMa());
    }
}
