/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import GiaoDien.ChucNangChinhUI;
import GiaoDien.LoginUI;
import ModelVPP.NhanVien;
import ModelVPP.SQLConnect;
import ModelVPP.SQLNhanVien;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Dell
 */
public class QuanLyVanPhongPham {
    private JFrame win;
    private SQLNhanVien sQLNhanVien;
    public static NhanVien nhanVienLoggingIn;
    private ChucNangChinhUI chucNangChinhUI;
    
    QuanLyVanPhongPham(){
        SQLConnect.createSQLConnect();
        sQLNhanVien = new SQLNhanVien();
        chucNangChinhUI = new ChucNangChinhUI();
        win=new JFrame("Dang Nhap");
         LoginUI login=new LoginUI();
         
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(460,140);
        win.setLocationRelativeTo(null);
        win.add(login);
        win.setVisible(true);
        
        login.DangNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nhanVienLoggingIn = login.loggin();
                if (nhanVienLoggingIn !=null){
                    phanQuyen();
                    win.remove(login);
                    win.add(chucNangChinhUI);
                    win.setTitle("Quan Ly Van Phong Pham");
                    win.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    win.revalidate();
                    win.repaint();
                }
            }
        });
    }
    
    public void phanQuyen()
    {
        if(nhanVienLoggingIn != null)
        {
            if(!nhanVienLoggingIn.getCPQLNhanVien())
                chucNangChinhUI.getBtnQuanLyNhanVien().setVisible(false);
            if(!nhanVienLoggingIn.getCPQLThuChi())
                chucNangChinhUI.getBtnQuanLyThuChi().setVisible(false);
            if(!nhanVienLoggingIn.getCPQLThongKe())
                chucNangChinhUI.getBtnQuanLyBaoCao().setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new QuanLyVanPhongPham();
        
        //System.out.println(support.SupportUIClass.chuanHoaChuoi("   vu    duc dsds   "));
    }
    
    
}
