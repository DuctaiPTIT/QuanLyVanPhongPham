/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import GiaoDien.ChucNangChinhUI;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author Dell
 */
public class QuanLyChuongTrinh extends JFrame{
    
   
    

    /**
     * @param args the command line arguments
     */
    private ChucNangChinhUI chucNangChinhUI;
    
    
    
    public QuanLyChuongTrinh(String tieude) {
        super(tieude);
        addControls();
        addEvents();
    }

    
    
    private void addControls() {
        Container con = getContentPane();
        
        chucNangChinhUI = new ChucNangChinhUI();
        con.add(chucNangChinhUI);
    }

    private void addEvents() {
    }

   
     public void showWindows() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
