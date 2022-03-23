
package Formularios;
import Clases.Alumno;
import Clases.Padre;
import Menu_Principal.Principal;
import javax.swing.JOptionPane;

public class FPadres extends javax.swing.JFrame {

    public FPadres() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTF_MatriculaNiño = new javax.swing.JTextField();
        JTF_NombrePa = new javax.swing.JTextField();
        JTF_Direcc = new javax.swing.JTextField();
        JTF_Curp = new javax.swing.JTextField();
        JTF_Num = new javax.swing.JTextField();
        JTF_Parent = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(JTF_MatriculaNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 150, -1));
        getContentPane().add(JTF_NombrePa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, -1));

        JTF_Direcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_DireccActionPerformed(evt);
            }
        });
        getContentPane().add(JTF_Direcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 150, -1));
        getContentPane().add(JTF_Curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, -1));
        getContentPane().add(JTF_Num, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 150, -1));
        getContentPane().add(JTF_Parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 150, -1));

        jLabel2.setText("MATRICULA DEL NIÑO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel4.setText("DIRECCION:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel5.setText("CURP:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jLabel6.setText("TELEFONO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel7.setText("PARENTEZCO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/devices_floppydisk_dispositivos_691.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 150, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("REGISTRAR PADRES");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otra.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 460));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 380, 10));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 460));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Settings_30027 (4).png"))); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logout (2).png"))); // NOI18N
        jMenuItem1.setText("REGRESAR AL MENU");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_DireccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_DireccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_DireccActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Principal a = new Principal(); 
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         for(int i = 0; i < Alumno.listasalumno.size(); i++){
            if(Alumno.listasalumno.get(i).getMatricula().equals(JTF_MatriculaNiño.getText())){
                
                Padre padre = new Padre(JTF_MatriculaNiño.getText(), Alumno.listasalumno.get(i).getNombre(),
                JTF_NombrePa.getText(), JTF_Direcc.getText(), JTF_Curp.getText(), JTF_Num.getText(), JTF_Parent.getText());
                
                Padre.listaspadres.add(padre); 
                JOptionPane.showMessageDialog(null, "Se regitro de manera correcta");
                //mostrar(); 
                JTF_MatriculaNiño.setText("");
                JTF_NombrePa.setText("");
                JTF_Direcc.setText("");
                JTF_Curp.setText("");
                JTF_Num.setText("");
                JTF_Parent.setText(""); 
            }else{
            JOptionPane.showMessageDialog(rootPane, "El id no existe");
            
                JTF_MatriculaNiño.setText("");
                JTF_NombrePa.setText("");
                JTF_Direcc.setText("");
                JTF_Curp.setText("");
                JTF_Num.setText("");
                JTF_Parent.setText(""); 
            }
         }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FPadres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPadres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPadres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPadres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPadres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTF_Curp;
    private javax.swing.JTextField JTF_Direcc;
    private javax.swing.JTextField JTF_MatriculaNiño;
    private javax.swing.JTextField JTF_NombrePa;
    private javax.swing.JTextField JTF_Num;
    private javax.swing.JTextField JTF_Parent;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
