/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import javax.swing.JButton;
import static support.SupportUIClass.createNewJFrame;

/**
 *
 * @author Dell
 */
public class QuanLyKhachHangUI extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyKhachHangUI
     */
    
    private DanhSachKhachHangUI danhSachKhachHangUI;
    private ChiTietKhachHangUI chiTietKhachHangUI;
    private ChiTietNhaCungCapUI chiTietNhaCungCapUI;
    private DanhSachNhaCungCapUI danhSachNhaCungCapUI;
   
    public QuanLyKhachHangUI() {
        initComponents();
    }

    public DanhSachKhachHangUI getDanhSachKhachHangUI() {
        return danhSachKhachHangUI;
    }

    public void setDanhSachKhachHangUI(DanhSachKhachHangUI danhSachKhachHangUI) {
        this.danhSachKhachHangUI = danhSachKhachHangUI;
    }

    public ChiTietKhachHangUI getChiTietKhachHangUI() {
        return chiTietKhachHangUI;
    }

    public void setChiTietKhachHangUI(ChiTietKhachHangUI chiTietKhachHangUI) {
        this.chiTietKhachHangUI = chiTietKhachHangUI;
    }

    public JButton getBtnDanhSachKhachHang() {
        return btnDanhSachKhachHang;
    }

    public void setBtnDanhSachKhachHang(JButton btnDanhSachKhachHang) {
        this.btnDanhSachKhachHang = btnDanhSachKhachHang;
    }

    public JButton getBtnDanhSachNhaCungCap() {
        return btnDanhSachNhaCungCap;
    }

    public void setBtnDanhSachNhaCungCap(JButton btnDanhSachNhaCungCap) {
        this.btnDanhSachNhaCungCap = btnDanhSachNhaCungCap;
    }

    public ChiTietNhaCungCapUI getChiTietNhaCungCapUI() {
        return chiTietNhaCungCapUI;
    }

    public void setChiTietNhaCungCapUI(ChiTietNhaCungCapUI chiTietNhaCungCapUI) {
        this.chiTietNhaCungCapUI = chiTietNhaCungCapUI;
    }

    public DanhSachNhaCungCapUI getDanhSachNhaCungCapUI() {
        return danhSachNhaCungCapUI;
    }

    public void setDanhSachNhaCungCapUI(DanhSachNhaCungCapUI danhSachNhaCungCapUI) {
        this.danhSachNhaCungCapUI = danhSachNhaCungCapUI;
    }

    public JButton getBtnDanhSachKhachHang1() {
        return btnThemKhachHang;
    }

    public void setBtnDanhSachKhachHang1(JButton btnDanhSachKhachHang1) {
        this.btnThemKhachHang = btnDanhSachKhachHang1;
    }

    public JButton getBtnDanhSachNhaCungCap1() {
        return btnThemNhaCungCap;
    }

    public void setBtnDanhSachNhaCungCap1(JButton btnDanhSachNhaCungCap1) {
        this.btnThemNhaCungCap = btnDanhSachNhaCungCap1;
    }
    
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDanhSachNhaCungCap = new javax.swing.JButton();
        btnDanhSachKhachHang = new javax.swing.JButton();
        btnThemKhachHang = new javax.swing.JButton();
        btnThemNhaCungCap = new javax.swing.JButton();

        btnDanhSachNhaCungCap.setBackground(new java.awt.Color(0, 204, 255));
        btnDanhSachNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDanhSachNhaCungCap.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachNhaCungCap.setText("Danh sách nhà cung cấp");
        btnDanhSachNhaCungCap.setToolTipText("");
        btnDanhSachNhaCungCap.setBorderPainted(false);
        btnDanhSachNhaCungCap.setFocusPainted(false);
        btnDanhSachNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachNhaCungCapActionPerformed(evt);
            }
        });

        btnDanhSachKhachHang.setBackground(new java.awt.Color(0, 204, 255));
        btnDanhSachKhachHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDanhSachKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachKhachHang.setText("Danh sách khách hàng");
        btnDanhSachKhachHang.setToolTipText("");
        btnDanhSachKhachHang.setBorderPainted(false);
        btnDanhSachKhachHang.setFocusPainted(false);
        btnDanhSachKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachKhachHangActionPerformed(evt);
            }
        });

        btnThemKhachHang.setBackground(new java.awt.Color(0, 204, 255));
        btnThemKhachHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThemKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        btnThemKhachHang.setText("Thêm khách hàng");
        btnThemKhachHang.setToolTipText("");
        btnThemKhachHang.setBorderPainted(false);
        btnThemKhachHang.setFocusPainted(false);
        btnThemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKhachHangActionPerformed(evt);
            }
        });

        btnThemNhaCungCap.setBackground(new java.awt.Color(0, 204, 255));
        btnThemNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThemNhaCungCap.setForeground(new java.awt.Color(255, 255, 255));
        btnThemNhaCungCap.setText("Thêm nhà cung cấp");
        btnThemNhaCungCap.setToolTipText("");
        btnThemNhaCungCap.setBorderPainted(false);
        btnThemNhaCungCap.setFocusPainted(false);
        btnThemNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNhaCungCapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThemKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDanhSachKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThemNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(btnDanhSachNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDanhSachKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDanhSachNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(337, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDanhSachNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachNhaCungCapActionPerformed
        // TODO add your handling code here:
         danhSachNhaCungCapUI = new DanhSachNhaCungCapUI();
         createNewJFrame(danhSachNhaCungCapUI, "Danh sách nhà cung cấp");
    }//GEN-LAST:event_btnDanhSachNhaCungCapActionPerformed

    private void btnDanhSachKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachKhachHangActionPerformed
        // TODO add your handling code here:
        danhSachKhachHangUI = new DanhSachKhachHangUI();
        createNewJFrame(danhSachKhachHangUI, "Danh sách khách hàng");
    }//GEN-LAST:event_btnDanhSachKhachHangActionPerformed

    private void btnThemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKhachHangActionPerformed
        // TODO add your handling code here:
        chiTietKhachHangUI = new ChiTietKhachHangUI();
        createNewJFrame(chiTietKhachHangUI, "Chi tiết khách hàng");
    }//GEN-LAST:event_btnThemKhachHangActionPerformed

    private void btnThemNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNhaCungCapActionPerformed
        // TODO add your handling code here:
        chiTietNhaCungCapUI = new ChiTietNhaCungCapUI();
        createNewJFrame(chiTietNhaCungCapUI, "Thêm nhà cung cấp");
    }//GEN-LAST:event_btnThemNhaCungCapActionPerformed
 
        
        
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDanhSachKhachHang;
    private javax.swing.JButton btnDanhSachNhaCungCap;
    private javax.swing.JButton btnThemKhachHang;
    private javax.swing.JButton btnThemNhaCungCap;
    // End of variables declaration//GEN-END:variables
}
