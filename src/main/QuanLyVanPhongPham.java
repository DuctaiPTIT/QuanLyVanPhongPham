/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import GiaoDien.ChucNangChinhUI;
import GiaoDien.LoginUI;
import Model.SQLConnect;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class QuanLyVanPhongPham {
    private JFrame win;
    QuanLyVanPhongPham(){
        win=new JFrame("Dang Nhap");
        LoginUI login=new LoginUI();
        win.setSize(460,140);
        win.add(login);
        win.setVisible(true);
        login.DangNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (SQLConnect.createSQLConnect(login.TenDangNhap.getText()
                        ,login.MatKhau.getText())){
                    win.remove(login);
                    win.add(new ChucNangChinhUI());
                    win.setTitle("Quan Ly Van Phong Pham");
                    win.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    win.revalidate();
                    win.repaint();
                }
            }
        });
    }
    public static void main(String[] args){
        new QuanLyVanPhongPham();
    }
}
