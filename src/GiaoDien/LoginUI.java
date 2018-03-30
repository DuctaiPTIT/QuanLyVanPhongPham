/*
 * To change this license header, choose License HeaderesultSet in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import ModelVPP.NhanVien;
import ModelVPP.SQLConnect;
import com.oracle.jrockit.jfr.ContentType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author NguyenNam
 */
public class LoginUI extends javax.swing.JPanel {

    /**
     * Creates new form LoginUI
     */
    public LoginUI() {
        initComponents();
        TenDangNhap.setDocument(new CheckCharacterUI());
        MatKhau.setDocument(new CheckCharacterUI());
    }

    public NhanVien loggin() {
        NhanVien nhanVien = null;

        String sql = "SELECT * FROM dbo.THONGTINDANGNHAP WHERE TENDANGNHAP = '" + TenDangNhap.getText() + "' AND MATKHAU = '"
                + MatKhau.getText() + "'";
        try {
            Statement statement = SQLConnect.conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if(!resultSet.next())
            {
                JOptionPane.showMessageDialog(new JFrame(), "Mật khẩu hoặc tài khoản không đúng","Lỗi đăng nhập", ERROR);
                
            }
            nhanVien = new NhanVien();
            sql = "SELECT * FROM dbo.NHANVIEN WHERE MANV = '"+resultSet.getString("MANV")+"'";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                nhanVien.setMa(resultSet.getString("MANV"));
//                nhanVien.setTen(resultSet.getString("TENNV"));
//                nhanVien.setSoDienThoai(resultSet.getString("SDT"));
//                nhanVien.setDiaChi(resultSet.getString("DIACHI") );
//                nhanVien.setEmail(resultSet.getString("EMAIL"));
//                nhanVien.setNgaySinh(resultSet.getString("NGAYSINH"));
//                nhanVien.setChucVu(resultSet.getString("CHUCVU"));
                nhanVien.setCPQLNhanVien(resultSet.getBoolean("CHOPHEPQUANLYNV"));
                nhanVien.setCPQLThongKe(resultSet.getBoolean("CHOPHEPQUANLYTK"));
                nhanVien.setCPQLThuChi(resultSet.getBoolean("CHOPHEPQUANLYTHUCHI"));
            }
            
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
        return nhanVien;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TenDangNhap = new javax.swing.JTextField();
        MatKhau = new javax.swing.JPasswordField();
        DangNhap = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 100));

        jPanel1.setLayout(new java.awt.BorderLayout());

        ad.setText("Tên Đăng Nhập");

        jLabel1.setText("Mật Khẩu");

        MatKhau.setToolTipText("");

        DangNhap.setText("Đăng Nhập");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DangNhap)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton DangNhap;
    public javax.swing.JPasswordField MatKhau;
    public javax.swing.JTextField TenDangNhap;
    private javax.swing.JLabel ad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
