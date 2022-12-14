package projektiocr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Admin extends javax.swing.JFrame {

    ConnectionDB cDB = new ConnectionDB();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    public Admin() {
        super("Admin Panel");
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setUndecorated(true);

        setLocationRelativeTo(null);
        conn = cDB.getConnection();
        showDate();
        showTime();
    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd");
        dateLab.setText(s.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                timeLab.setText(s.format(d));
            }
        }).start();
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
        jLabel1 = new javax.swing.JLabel();
        timeLab = new javax.swing.JTextField();
        dateLab = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnStudents = new javax.swing.JButton();
        btnUsers = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(222, 229, 239));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Panel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(530, 100, 270, 80);

        timeLab.setEditable(false);
        timeLab.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel1.add(timeLab);
        timeLab.setBounds(990, 190, 116, 26);

        dateLab.setEditable(false);
        dateLab.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        dateLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateLabActionPerformed(evt);
            }
        });
        jPanel1.add(dateLab);
        dateLab.setBounds(990, 150, 116, 26);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(940, 150, 41, 21);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Time");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(940, 190, 41, 21);

        btnStudents.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnStudents.setText("STUDENTS");
        btnStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentsActionPerformed(evt);
            }
        });
        jPanel1.add(btnStudents);
        btnStudents.setBounds(580, 410, 131, 33);

        btnUsers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUsers.setText("USERS");
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsers);
        btnUsers.setBounds(580, 460, 131, 33);

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout);
        btnLogout.setBounds(580, 510, 131, 33);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projektiocr/icon/no-place-image.jpg"))); // NOI18N
        jLabel4.setText("        ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-30, -370, 1400, 1120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1365, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateLabActionPerformed

    private void btnStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsActionPerformed
        setVisible(false);
        Students ob = new Students();
        ob.setVisible(true);
    }//GEN-LAST:event_btnStudentsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        setVisible(false);
        LoginForm ob = new LoginForm();
        ob.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        setVisible(false);
        Users ob = new Users();
        ob.setVisible(true);
    }//GEN-LAST:event_btnUsersActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    
                    new OcrGui().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(OcrGui.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(OcrGui.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(OcrGui.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(OcrGui.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnStudents;
    private javax.swing.JButton btnUsers;
    private javax.swing.JTextField dateLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField timeLab;
    // End of variables declaration//GEN-END:variables
}
