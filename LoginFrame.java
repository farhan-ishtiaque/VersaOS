package com.mycompany.project;

import java.awt.Panel;
import java.io.*;
import java.util.*;
import javax.swing.*;

/*import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;*/
/**
 *
 * @author ishma
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginFrame() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getClassLoader().getResource("Company ICON.png")).getImage());
        AdminPanel.getPanel();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Email : ");

        EmailField.setBackground(new java.awt.Color(255, 234, 255));
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });
        EmailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EmailFieldKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Password :");

        PasswordField.setBackground(new java.awt.Color(255, 234, 255));
        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyPressed(evt);
            }
        });

        jButtonLogin.setBackground(new java.awt.Color(255, 234, 255));
        jButtonLogin.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButtonLogin.setText("LOGIN");
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
        });
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jButtonLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonLoginKeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 234, 255));
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton2.setText("SIGN UP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Change Password?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PasswordField)
            .addComponent(EmailField)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Company LOGO 1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void EmailFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailFieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            PasswordField.requestFocus();
        }
    }//GEN-LAST:event_EmailFieldKeyPressed

    private void PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            jButtonLogin.requestFocus();
        }
    }//GEN-LAST:event_PasswordFieldKeyPressed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        if (EmailField.getText().isBlank()) {
            JOptionPane.showMessageDialog(LoginFrame.this, "Enter your Email Address");
        }
        char[] passwordChars = PasswordField.getPassword();
        if (passwordChars.length == 0) {
            JOptionPane.showMessageDialog(LoginFrame.this, "Password is empty!");
        }

        if (!EmailField.getText().isBlank() && passwordChars.length != 0) {

        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLoginKeyPressed

    }//GEN-LAST:event_jButtonLoginKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UserForm user = new UserForm();
        user.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked
        /*boolean condition1 = true;
        boolean condition2 = true;
        if (EmailField.getText().isBlank()) {
            condition1 = false;
            JOptionPane.showMessageDialog(LoginFrame.this, "Enter Email Address");
        }
        if (Arrays.toString(PasswordField.getPassword()).isBlank()) {
            condition2 = false;
            JOptionPane.showMessageDialog(LoginFrame.this, "Enter Password");
        }
        if (condition1 && condition2) {
            List<Account> accounts = readUserAccountsFromFile("user_database.dat");
            for (Account account : accounts) {
                if (account.getEmail().equals(EmailField.getText()) && account.getPassword().equals(new String(PasswordField.getPassword()))) {
                    MainFrame mf = new MainFrame(account);
                    mf.setVisible(true);
                    dispose();
                }
            }
        }*/
        boolean condition1 = true;
        boolean condition2 = true;
        List<Account> accounts = readUserAccountsFromFile("user_database.dat");
        if (EmailField.getText().isBlank()) {
            condition1 = false;
            JOptionPane.showMessageDialog(LoginFrame.this, "Enter Email Address");
        }
        if (Arrays.toString(PasswordField.getPassword()).isBlank()) {
            condition2 = false;
            JOptionPane.showMessageDialog(LoginFrame.this, "Enter Password");
        }
        if (condition1 && condition2) {
            if (AdminPanel.getPanel().getAdministrator().getEmail().equals(EmailField.getText()) && AdminPanel.getPanel().getAdministrator().getPassword().equals(new String(PasswordField.getPassword()))) {
                MainFrameAdmin mfa = new MainFrameAdmin();
                mfa.setVisible(true);
                dispose();
            } else if (AdminPanel.getPanel().getModerator().getEmail().equals(EmailField.getText()) && AdminPanel.getPanel().getModerator().getPassword().equals(new String(PasswordField.getPassword()))) {
                MainFrameModerator mfm = new MainFrameModerator();
                mfm.setVisible(true);
                dispose();
            }
        else
            {
                
        int count = 0, count2 = 0;
        for (Account account : accounts) {
            if (!(EmailField.getText().equals(account.getEmail()))) {
                count++;
            }
            if (!(account.getPassword().equals(new String(PasswordField.getPassword())))) {
                count2++;
            }
        }
        if (accounts.size() == count) {
            JOptionPane.showMessageDialog(LoginFrame.this, "Email Address does not exist!");
        }
        if (accounts.size() == count2) {
            JOptionPane.showMessageDialog(LoginFrame.this, "Wrong password!");
        }

        if (condition1 && condition2) {
            for (Account account : accounts) {
                if (account.getEmail().equals(EmailField.getText()) && account.getPassword().equals(new String(PasswordField.getPassword()))) {
                    MainFrame mf = new MainFrame(account);
                    mf.setVisible(true);
                    dispose();
                }
            }

        }
    }
        }
    }//GEN-LAST:event_jButtonLoginMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
        PasswordResetFrame prf = new PasswordResetFrame();
        prf.setVisible(true);

    }//GEN-LAST:event_jLabel4MouseClicked

    private static List<Account> readUserAccountsFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            // Read the serialized List<Account> from the file
            return (List<Account>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
