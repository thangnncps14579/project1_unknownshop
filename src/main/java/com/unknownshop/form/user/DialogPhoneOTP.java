package com.unknownshop.form.user;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.unknownshop.constant.XConstant;
import com.unknownshop.form.DialogLoading;
import com.unknownshop.util.XHover;
import com.unknownshop.util.XMess;
import com.unknownshop.util.XPanel;

public class DialogPhoneOTP extends javax.swing.JFrame {
    
    private final String ACCOUNT_SID = "ACb026363721bae0f1ff08bd958ca9b281";
    private final String AUTH_TOKEN = "2ed8942159fbb1b0f9ad9c79b410d1bb";
    private int OTP = 0;
    private String phone;
    public int check = -1;
    
    public DialogPhoneOTP(String phone) {
        initComponents();
        this.phone = phone;
        init();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnKiemTra = new javax.swing.JButton();
        txtOTP = new com.unknownshop.swing.textfield.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("UNKNOW STORE");

        btnKiemTra.setBackground(new java.awt.Color(0, 102, 204));
        btnKiemTra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKiemTra.setForeground(new java.awt.Color(255, 255, 255));
        btnKiemTra.setText("Kiểm Tra");
        btnKiemTra.setContentAreaFilled(false);
        btnKiemTra.setOpaque(true);
        btnKiemTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKiemTraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKiemTraMouseExited(evt);
            }
        });
        btnKiemTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiemTraActionPerformed(evt);
            }
        });

        txtOTP.setBackground(new java.awt.Color(51, 51, 51));
        txtOTP.setForeground(new java.awt.Color(255, 255, 255));
        txtOTP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOTP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOTP.setLabelText("Nhập Mã OTP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnKiemTra, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnKiemTra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

// ---------------------- Start Event ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Event btnKiemTra">
    private void btnKiemTraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKiemTraMouseEntered
        XHover.enterButton(btnKiemTra, XConstant.WHITE_255, XConstant.BLACK_51);
    }//GEN-LAST:event_btnKiemTraMouseEntered

    private void btnKiemTraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKiemTraMouseExited
        XHover.exitButton(btnKiemTra);
    }//GEN-LAST:event_btnKiemTraMouseExited
  
    private void btnKiemTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiemTraActionPerformed
        check();
    }//GEN-LAST:event_btnKiemTraActionPerformed

   // </editor-fold >

// ---------------------- End Method ----------------------
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogPhoneOTP("0949006346").setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKiemTra;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private com.unknownshop.swing.textfield.TextField txtOTP;
    // End of variables declaration//GEN-END:variables

// ---------------------- Start Method ----------------------
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức gửi mã OTP">
    private void init() {
        XPanel.pnlPhoneOTP = this;
        // Tạo luồng và hiện dialog loading
        new Thread(){
            @Override
            public void run(){
                DialogLoading dlog = new DialogLoading();
                dlog.setVisible(true);
                OTP = (int) Math.round((Math.random() * 8999) + 1000);
                String body = "\nMã xác nhận của bạn là : " + OTP + "\nKhông chia sẻ mã với người khác";
                Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
                Message.creator(new com.twilio.type.PhoneNumber("+84" + phone),
                                "MGd0c0392f6936fa713639809bb32b2f95",
                                body).create();
                dlog.setVisible(false);
            }
        }.start();
         addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                if(XMess.confirm(null, "Bạn muốn đóng OTP?")){
                    XPanel.mainForm.setEnabled(true);
                    check = 0;
                    dispose();
                }
            }
        });
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Phương thức kiểm tra mã OTP">
    private void check(){
        if(Integer.valueOf(txtOTP.getText()) == OTP){
            setVisible(false);
            DialogPayment zaloPay = new DialogPayment();
            zaloPay.setVisible(true);
        }else{
            XMess.alert(this,"Sai mã OTP");
        }
    }
    // </editor-fold>
    
// ---------------------- End Method ----------------------
}


