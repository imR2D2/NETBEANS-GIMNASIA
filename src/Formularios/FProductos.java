
package Formularios;
import Menu_Principal.Principal;
import Formularios.*;
import Productos.*;
import javax.swing.JOptionPane;
public class FProductos extends javax.swing.JFrame {

    public FProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo = new javax.swing.JLabel();
        L_Nombre = new javax.swing.JLabel();
        TF_Nombre = new javax.swing.JTextField();
        L_Kg_Inv = new javax.swing.JLabel();
        FT_Stock = new javax.swing.JTextField();
        L_Precio = new javax.swing.JLabel();
        TF_Precio = new javax.swing.JTextField();
        L_Tipo = new javax.swing.JLabel();
        CB_Tipo = new javax.swing.JComboBox<>();
        L_ID = new javax.swing.JLabel();
        TF_ID = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        Label_Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Agregar Producto");
        Label_Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 21, 440, -1));

        L_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Nombre.setText("Color:");
        L_Nombre.setToolTipText("");
        getContentPane().add(L_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 84, 103, -1));

        TF_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 80, 116, -1));

        L_Kg_Inv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Kg_Inv.setText("Stock:");
        getContentPane().add(L_Kg_Inv, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 114, 103, -1));

        FT_Stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(FT_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 110, 116, -1));

        L_Precio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Precio.setText("Precio por unidad:");
        getContentPane().add(L_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 140, -1, 24));

        TF_Precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 140, 116, -1));

        L_Tipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Tipo.setText("Productos:");
        getContentPane().add(L_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 181, 103, -1));

        CB_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCOGER", "Traje", "Zapatillas", "Magnesia", "Guantes" }));
        CB_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_TipoActionPerformed(evt);
            }
        });
        getContentPane().add(CB_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 176, 116, -1));

        L_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_ID.setText("ID:");
        getContentPane().add(L_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 208, 99, 24));

        TF_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 208, 115, -1));

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/devices_floppydisk_dispositivos_691.png"))); // NOI18N
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 238, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otra.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 340));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Settings_30027 (4).png"))); // NOI18N

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

    private void CB_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_TipoActionPerformed
        int a = CB_Tipo.getSelectedIndex();
        switch(a)
        {
            case 0:
            TF_ID.setText("");
            TF_Nombre.setText("");
            FT_Stock.setText("");
            TF_Precio.setText("");
        }

        if(TF_Nombre.getText().isEmpty() || FT_Stock.getText().isEmpty() || TF_Precio.getText().isEmpty())
            
        {
            JOptionPane.showMessageDialog(null,"INGRESA TODOS LOS DATOS!");
        //Sirve para ver cuantos datos podremos guardar en el stock asi que solo se podran 200
        }
        else if(Double.parseDouble(FT_Stock.getText()) < 0 || Double.parseDouble(FT_Stock.getText()) > 200)
        {
            if(Double.parseDouble(FT_Stock.getText()) < 0)
            {
                JOptionPane.showMessageDialog(null,"LAS UNIDADES SON MENORES A 0, DANDO A ENTENDER QUE NO EXISTEN!");
                FT_Stock.setText("");
            }
            else
            {
               JOptionPane.showMessageDialog(null,"NO PODEMOS ALMACENAR TANTOS PRODUCTOS EN STOCK!");
               FT_Stock.setText("");
            }
            FT_Stock.setText("");
        }
        else if(Double.parseDouble(TF_Precio.getText()) < 10 || Double.parseDouble(TF_Precio.getText()) > 1000 )
        {
            if(Double.parseDouble(TF_Precio.getText()) < 10)
            {
                JOptionPane.showMessageDialog(null, "NOS DARAS PERDIDAS, ES UN PRECIO BAJO!");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"NO TE EXEDAS AMIGO, ES UN PRECIO ALTO!");
            }
            TF_Precio.setText("");
        }

    }//GEN-LAST:event_CB_TipoActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        String ID, Nombre;
        double Kg, Precio;
        int a = CB_Tipo.getSelectedIndex();

        if(TF_Nombre.getText().isEmpty() || FT_Stock.getText().isEmpty() || TF_Precio.getText().isEmpty() || TF_ID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Ingresa todos los datos chaval");
        }
        else if(Double.parseDouble(FT_Stock.getText()) < 0 || Double.parseDouble(FT_Stock.getText()) > 1000)
        {
            if(Double.parseDouble(FT_Stock.getText()) < 0)
            {
                JOptionPane.showMessageDialog(null,"Las unidades son menores a 0");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No caben tantas unidades en el almacen");
            }
            FT_Stock.setText("");
        }
        else if(Double.parseDouble(TF_Precio.getText()) < 5 || Double.parseDouble(TF_Precio.getText()) > 1000 )
        {
            if(Double.parseDouble(TF_Precio.getText()) < 6)
            {
                JOptionPane.showMessageDialog(null,"Precio Bajo");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Precio Muy Alto");
            }
            TF_Precio.setText("");
        }
///////////////////////////////////////////////////////////////////////////////////////
        else
        {
            switch(a)
            {
        case 1:
                System.out.println("---MAGNESIA---");

                ID = TF_ID.getText();
                System.out.println("ID: "+ID); //ID del Producto
                Nombre = TF_Nombre.getText();
                System.out.println("Nombre: "+Nombre); //Nombre del Producto
                Kg = Double.parseDouble(FT_Stock.getText());
                System.out.println("Kg em Inventario: "+Kg); //Kg del Producto
                Precio = Double.parseDouble(TF_Precio.getText());
                System.out.println("Precio: "+Precio); //Precio del Producto

                //Ingresar datos al objeto
                Productos M = new P_Magnesia(ID, Nombre, "Magnesia", Kg, Precio);
                Productos.ArrayP.add(M);

                CB_Tipo.setSelectedIndex(0);
                break;
        case 2:
                System.out.println("---ZAPATILLAS---");

                ID = TF_ID.getText();
                System.out.println("ID: "+ID); //ID del Producto
                Nombre = TF_Nombre.getText();
                System.out.println("Nombre: "+Nombre); //Nombre del Producto
                Kg = Double.parseDouble(FT_Stock.getText());
                System.out.println("Kg em Inventario: "+Kg); //Kg del Producto
                Precio = Double.parseDouble(TF_Precio.getText());
                System.out.println("Precio: "+Precio); //Precio del Producto

                //Ingresar datos al objeto
                Productos Z = new P_Zapatillas(ID, Nombre, "Zapatillas", Kg, Precio);
                Productos.ArrayP.add(Z);
                CB_Tipo.setSelectedIndex(0);
                break;
        case 3:
                System.out.println("---TRAJES---");

                ID = TF_ID.getText();
                System.out.println("ID: "+ID); //ID del Producto
                Nombre = TF_Nombre.getText();
                System.out.println("Nombre: "+Nombre); //Nombre del Producto
                Kg = Double.parseDouble(FT_Stock.getText());
                System.out.println("Kg en Inventario: "+Kg); //Kg del Producto
                Precio = Double.parseDouble(TF_Precio.getText());
                System.out.println("Precio: "+Precio); //Precio del Producto

                //Ingresar datos al objeto
                Productos T = new P_Traje(ID, Nombre, "Traje", Kg, Precio);
                Productos.ArrayP.add(T);

                CB_Tipo.setSelectedIndex(0);
                break;
        case 4:
                System.out.println("---GUANTES---");

                ID = TF_ID.getText();
                System.out.println("ID: "+ID); //ID del Producto
                Nombre = TF_Nombre.getText();
                System.out.println("Nombre: "+Nombre); //Nombre del Producto
                Kg = Double.parseDouble(FT_Stock.getText());
                System.out.println("Kg en Inventario: "+Kg); //Kg del Producto
                Precio = Double.parseDouble(TF_Precio.getText());
                System.out.println("Precio: "+Precio); //Precio del Producto

                //Ingresar datos al objeto
                Productos Co = new P_Guantes(ID, Nombre, "Guantes", Kg, Precio);
                Productos.ArrayP.add(Co);

                CB_Tipo.setSelectedIndex(0);
                break;
                default:
                System.out.println("");
/////               ocultar();
                TF_Nombre.setText("");
                FT_Stock.setText("");
                TF_Precio.setText("");
                Agregar.setVisible(false);
                break;
            }
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Principal o = new Principal(); 
        o.setVisible(true);
        this.dispose(); 
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
            java.util.logging.Logger.getLogger(FProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox<String> CB_Tipo;
    private javax.swing.JTextField FT_Stock;
    private javax.swing.JLabel L_ID;
    private javax.swing.JLabel L_Kg_Inv;
    private javax.swing.JLabel L_Nombre;
    private javax.swing.JLabel L_Precio;
    private javax.swing.JLabel L_Tipo;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_Nombre;
    private javax.swing.JTextField TF_Precio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
