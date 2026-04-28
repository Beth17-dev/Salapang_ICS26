
package SalapangPackage;

import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Textusername = new javax.swing.JTextField();
        Lusername = new javax.swing.JLabel();
        jCheckShowPass = new javax.swing.JCheckBox();
        jPassword = new javax.swing.JPasswordField();
        Lpassword = new javax.swing.JLabel();
        jButtonlogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bttnregister = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText(" Log in to Your Account ");

        Textusername.setBackground(new java.awt.Color(240, 248, 255));
        Textusername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Textusername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        Lusername.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Lusername.setForeground(new java.awt.Color(51, 51, 51));
        Lusername.setText("Username");

        jCheckShowPass.setBackground(new java.awt.Color(255, 255, 255));
        jCheckShowPass.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jCheckShowPass.setForeground(new java.awt.Color(51, 51, 51));
        jCheckShowPass.setText("Show Password");
        jCheckShowPass.addActionListener(this::jCheckShowPassActionPerformed);

        jPassword.setBackground(new java.awt.Color(240, 248, 255));
        jPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        Lpassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Lpassword.setForeground(new java.awt.Color(51, 51, 51));
        Lpassword.setText("Password");

        jButtonlogin.setBackground(new java.awt.Color(0, 0, 128));
        jButtonlogin.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonlogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonlogin.setText("Login");
        jButtonlogin.addActionListener(this::jButtonloginActionPerformed);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Dont have an account?");

        bttnregister.setForeground(new java.awt.Color(0, 0, 238));
        bttnregister.setText("Sign Up?");
        bttnregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnregisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(bttnregister))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckShowPass)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Lusername)
                                .addComponent(Lpassword)
                                .addComponent(Textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(Lusername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckShowPass)
                .addGap(33, 33, 33)
                .addComponent(jButtonlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(bttnregister))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        main.add(jPanel1);
        jPanel1.setBounds(30, 60, 400, 410);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SalapangPackage/loginbg.jpg"))); // NOI18N
        main.add(jLabel1);
        jLabel1.setBounds(-220, 0, 1070, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckShowPassActionPerformed
        if (jCheckShowPass.isSelected()) {
            jPassword.setEchoChar((char) 0); // ma visible ang password
        } else {
            jPassword.setEchoChar('*');//ma tago ang password
        }
    }//GEN-LAST:event_jCheckShowPassActionPerformed

    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonloginActionPerformed
        String user = Textusername.getText();
        String pass = new String(jPassword.getPassword());

        try {
            // Direct Connection Logic
            String url = "jdbc:mysql://localhost:3306/salapang_db";
            java.sql.Connection conn = java.sql.DriverManager.getConnection(url, "root", "");

            String sql = "SELECT id FROM users WHERE username = ? AND password = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, pass);

            java.sql.ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                new dashboards().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonloginActionPerformed

    private void bttnregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnregisterMouseClicked
        Registration reg = new Registration();
        reg.setVisible(true);
        dispose();
    }//GEN-LAST:event_bttnregisterMouseClicked
    

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lpassword;
    private javax.swing.JLabel Lusername;
    private javax.swing.JTextField Textusername;
    private javax.swing.JLabel bttnregister;
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JCheckBox jCheckShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables


    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Login().setVisible(true);
        }
    });
}
}
