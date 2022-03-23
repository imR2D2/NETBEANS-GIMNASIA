/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Menu_Principal.Principal;

import javax.swing.JOptionPane;
/*import sun.security.util.Password;*/
/**
 *
 * @author artur
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);

       
        
    }
    /*
***ES PARA PONER UN ICONO Y QUITAR LA TAZA DE CAFE DE CUANDO SE CORRE EL PROGRAMA
     //public Image getIconImage() {
         //Piner imagen para el logo de nuestro programa en vez de la taza de cafe, solo cambar lo de qui abajo por una imagen de nosotros
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logohp.png"));
        return retValue;
    }
*/
    
    //Sirve para limpiar el login si los datos son incorrectos
public void limpiar(){
        TF_User.setText("");
        Password.setText("");
        TF_User.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        TF_User = new java.awt.TextField();
        BT_Inicio = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/avatardefault_92824.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/door_internet_key_lock_password_safe_security_icon_127075 (1).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        Password.setBackground(new java.awt.Color(0, 0, 153));
        Password.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 120, 30));

        TF_User.setBackground(new java.awt.Color(0, 0, 153));
        TF_User.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TF_User.setForeground(new java.awt.Color(255, 255, 255));
        TF_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_UserActionPerformed(evt);
            }
        });
        getContentPane().add(TF_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, 30));

        BT_Inicio.setBackground(new java.awt.Color(0, 0, 153));
        BT_Inicio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BT_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        BT_Inicio.setLabel("Iniciar Sesión");
        BT_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_InicioActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/users_theuser_6177.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1014.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 420));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Settings_30027 (4).png"))); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logout (2).png"))); // NOI18N
        jMenuItem1.setText("CERRAR PROGRAMA");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/1486348822-music-play-pause-control-go-arrow-blue_80476.png"))); // NOI18N

        jMenuItem2.setText("...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_InicioActionPerformed

        String Usuario = "admin"; 
        String Contraseña = "123"; 
        
        String Pass = new String(Password.getPassword());
        //Para que sin importar la mayuscula o minuscula entre
        if(TF_User.getText().equals(Usuario)&&Pass.equals(Contraseña)){
            //Creamos el objeto y le diremos que esta en true para que se compruebe el acceso si todos los datos se ingresaron de manera correcta
            Principal PR = new Principal();
            PR.setVisible(true); 
            this.dispose();
        }
        else{
            limpiar();//Se manda a llamar desde arriba
            JOptionPane.showMessageDialog(this, "Usuario / Contraseña incorrecta");
        }
        
    }//GEN-LAST:event_BT_InicioActionPerformed

    private void TF_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_UserActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Musica m = new Musica();
        m.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BT_Inicio;
    private javax.swing.JPasswordField Password;
    private java.awt.TextField TF_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
