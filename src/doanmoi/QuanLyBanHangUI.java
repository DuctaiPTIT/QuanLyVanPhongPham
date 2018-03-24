/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanmoi;

import java.awt.Dimension;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.WindowConstants;

/**
 *
 * @author Dell
 */
public class QuanLyBanHangUI extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyBanHangUI
     */
    
    private BanHangUI banHangUI;
    private DanhSachHoaDonUI danhSachHoaDonUI;
   
    
    public QuanLyBanHangUI() {
        initComponents();
        banHangUI = new BanHangUI();
        danhSachHoaDonUI = new DanhSachHoaDonUI();
    }

    public BanHangUI getBanHangUI() {
        return banHangUI;
    }

    public void setBanHangUI(BanHangUI banHangUI) {
        this.banHangUI = banHangUI;
    }

    public DanhSachHoaDonUI getDanhSachHoaDonUI() {
        return danhSachHoaDonUI;
    }

    public void setDanhSachHoaDonUI(DanhSachHoaDonUI danhSachHoaDonUI) {
        this.danhSachHoaDonUI = danhSachHoaDonUI;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBanHang = new javax.swing.JButton();
        btnDanhSachHoaDon = new javax.swing.JButton();

        btnBanHang.setBackground(new java.awt.Color(0, 204, 255));
        btnBanHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBanHang.setForeground(new java.awt.Color(255, 255, 255));
        btnBanHang.setText("Lập hóa đơn bán hàng");
        btnBanHang.setToolTipText("");
        btnBanHang.setBorderPainted(false);
        btnBanHang.setFocusPainted(false);
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });

        btnDanhSachHoaDon.setBackground(new java.awt.Color(0, 204, 255));
        btnDanhSachHoaDon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDanhSachHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhSachHoaDon.setText("Danh sách hóa đơn bán hàng");
        btnDanhSachHoaDon.setToolTipText("");
        btnDanhSachHoaDon.setBorderPainted(false);
        btnDanhSachHoaDon.setFocusPainted(false);
        btnDanhSachHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDanhSachHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDanhSachHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        // TODO add your handling code here:
        khoiTaoJFramBanHang();
    }//GEN-LAST:event_btnBanHangActionPerformed

    private void btnDanhSachHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachHoaDonActionPerformed
        // TODO add your handling code here:
        JFrame jfrBanHang = new JFrame("Danh sách hóa đơn bán hàng");
        jfrBanHang.getContentPane();
        jfrBanHang.add(danhSachHoaDonUI);
        jfrBanHang.setSize(danhSachHoaDonUI.getPreferredSize());
        jfrBanHang.setLocationRelativeTo(null);
        jfrBanHang.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jfrBanHang.setVisible(true);
    }//GEN-LAST:event_btnDanhSachHoaDonActionPerformed

    public void khoiTaoJFramBanHang(){
        JFrame jfrBanHang = new JFrame("Lập phiếu bán hàng");
        jfrBanHang.getContentPane();
        jfrBanHang.add(banHangUI);
        jfrBanHang.setSize(banHangUI.getPreferredSize());
        jfrBanHang.setLocationRelativeTo(null);
        jfrBanHang.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jfrBanHang.setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnDanhSachHoaDon;
    // End of variables declaration//GEN-END:variables
}