/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelVPP;

import java.util.ArrayList;

/**
 *
 * @author phnam
 */
public class SQLSanPham extends SQLConnect{
    public SQLSanPham(){}
    @Override
    public void insert(ObjectVPP O) {
        SanPham sp=(SanPham) O;
        
    }

    @Override
    public void update(ObjectVPP O) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SanPham> select(String O) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
