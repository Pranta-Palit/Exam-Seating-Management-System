/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uapseatplanner;
import java.io.*;
import java.util.*;
/**
 *
 * @author Shovik
 */
public class LoginWindow extends javax.swing.JFrame {

    /**
     * Creates new form LoginWindow
     */
    public LoginWindow() {
        initComponents();
    }

    public String authentication_check() throws Exception
    {
        //Declaring a object for properties file.
        Properties authentication = new Properties();
        authentication.load(new FileInputStream("auth.properties"));
        
        //Extracting the username & password from properties file.
        String user = authentication.getProperty("user");
        String pass = authentication.getProperty("password");
        
        if((username_field.getText()).equals(user) && (password_field.getText()).equals(pass) )
        {
            return("Login Successful!");
        }
        else
        {
            return("Username or Password is incorrect.");
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username_field = new javax.swing.JTextField();
        username_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        password_field = new javax.swing.JTextField();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        username_field.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });

        username_label.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        username_label.setText("Username:");

        password_label.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        password_label.setText("Password:");

        password_field.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(username_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(password_label)
                                .addGap(10, 10, 10)
                                .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try
        {
            System.out.println(authentication_check());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });*/
       
       Processing p = new Processing();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton login;
    private javax.swing.JTextField password_field;
    private javax.swing.JLabel password_label;
    private javax.swing.JTextField username_field;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
