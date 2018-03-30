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
public class ObjectVPP {
    private String Ma;
    /**************************************
     *các hàm kiểm tra dùng để thay đổi thuộc tính:
     * isDate kiểm tra chuổi đưa vào có đúng form dd/MM/yyyy{ true: false}
     *các hàm so sánh 
     * equals so sánh Ma {true:false}
     */
    public ObjectVPP(){
        Ma=new String();
    }
    public ObjectVPP(String Ma){
        setMa(Ma);
    }
    public void setMa(String Ma){
        if (Ma.isEmpty()) return;
        this.Ma=Ma;
    }
    public String getMa(){
        return Ma;
    }
    public boolean equals(String Ma){
        if (this.Ma.equals(Ma)) return true;
        return false;
    }
    public boolean equals(ObjectVPP O){
        if (O.equals(Ma)) return true;
        return false;
    }
        public static boolean isDate(String Date) {
        if (Date.length() != 10) {
            return false;
        }
        byte[] date = Date.getBytes();
        int day = (date[0] - 48) * 10 + date[1] - 48;
        int month = (date[3] - 48) * 10 + date[4] - 48;
        int year = (date[6] - 48) * 1000 + (date[7] - 48) * 100 + (date[8] - 48) * 10 + date[9] - 48;
        return ObjectVPP.isDate(day, month, year);
    }
          public static boolean isDate(int day, int month, int year) {
        int max;
        if (month == 2) {
            if (year % 100 == 0) {
                max = 28;
            } else {
                max = (year % 4) == 0 ? 29 : 28;
            }
        } else {
            if (month < 8) {
                max = (month % 2) == 1 ? 31 : 30;
            } else {
                max = (month % 2) == 1 ? 30 : 31;
            }
        }
        return 1 <= day && day <= max;
    }

        
}
