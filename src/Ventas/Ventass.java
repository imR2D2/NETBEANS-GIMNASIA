
package Ventas;
import Clases.Alumno;
import Clases.Padre;
import Productos.*;
import Menu_Principal.Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public final class Ventass extends javax.swing.JFrame {

    public Ventass() {
        initComponents();
        AgregarPadress();
        this.setLocationRelativeTo(null);
              if(Productos.ArrayP.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"No hay productos agregados");
        }
        else 
        {   
            String matriz [] [] = new String [Productos.ArrayP.size()] [4];
            Productoss(matriz);
        }
              
     
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Kg = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        TF_Unidades = new javax.swing.JTextField();
        L_Costo = new javax.swing.JLabel();
        TF_Costo = new javax.swing.JTextField();
        Label_Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Productos = new javax.swing.JTable();
        L_Pago = new javax.swing.JLabel();
        TF_Pago = new javax.swing.JTextField();
        Calcular_Precio = new javax.swing.JButton();
        L_Cambio = new javax.swing.JLabel();
        L_ID = new javax.swing.JLabel();
        TF_Cambio = new javax.swing.JTextField();
        TF_ID = new javax.swing.JTextField();
        Calcular_Cambio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPadres = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L_Kg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Kg.setText("Unidades:");
        getContentPane().add(L_Kg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/recycle_recyclebin_full_delete_trash_1772.png"))); // NOI18N
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 70, 60));

        TF_Unidades.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 100, -1));

        L_Costo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Costo.setText("Costo:");
        getContentPane().add(L_Costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 265, 38, -1));

        TF_Costo.setEditable(false);
        TF_Costo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 261, 89, -1));

        Label_Titulo.setFont(new java.awt.Font("Lemon", 1, 36)); // NOI18N
        Label_Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("VENTAS");
        Label_Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Label_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 459, -1));

        Tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Unidades", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_Productos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 132, 421, 86));

        L_Pago.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Pago.setText("Pagó:");
        getContentPane().add(L_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 301, 34, -1));

        TF_Pago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 297, 89, -1));

        Calcular_Precio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/price_tag_icon-icons.com_54425.png"))); // NOI18N
        Calcular_Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcular_PrecioActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 50, 50));

        L_Cambio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Cambio.setText("Cambio:");
        getContentPane().add(L_Cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 387, -1, -1));

        L_ID.setForeground(new java.awt.Color(0, 0, 0));
        L_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_ID.setText("ID Producto:");
        getContentPane().add(L_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 80, -1));

        TF_Cambio.setEditable(false);
        TF_Cambio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_Cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 383, 89, -1));

        TF_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 100, -1));

        Calcular_Cambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Banking_00016_A_icon-icons.com_59832.png"))); // NOI18N
        Calcular_Cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcular_CambioActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular_Cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 50, 50));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PRODUCTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 98, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PADRES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 254, -1, -1));

        TablaPadres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Padre", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaPadres);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 297, 421, 86));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 72, 740, 20));

        jLabel3.setText("ID NIÑO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 87, -1));

        jLabel4.setText("NOMBRE PADRE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 97, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/devices_floppydisk_dispositivos_691.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 60, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otra.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 570));

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

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
limpiar();
    }//GEN-LAST:event_CancelarActionPerformed

    
    public void limpiar(){
        TF_Cambio.setText("");
        TF_Costo.setText("");
        TF_ID.setText("");
        TF_Pago.setText("");
        TF_Unidades.setText("");
    }
    
    
    private void Calcular_PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcular_PrecioActionPerformed

        int a = IDs(TF_ID.getText());
        if(TF_ID.getText().isEmpty() || TF_Unidades.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"INGRESA LOS DATOS POR FAVOR CHAVAL");
        }
        else if(Productos.ArrayP.get(a).getId_Producto().equals(TF_ID.getText()))
        {
            double b = Double.parseDouble(TF_Unidades.getText());
            if(Productos.ArrayP.get(a).getTamaño() <= 0)
            {
                JOptionPane.showMessageDialog(null,"NO HAY" + Productos.ArrayP.get(a).getNombre() + " EN STOCK");
            }
            else if(b <= Productos.ArrayP.get(a).getTamaño())
            {
                TF_ID.setEditable(false);
                TF_Unidades.setEditable(false);
                TF_Costo.setText(Venta(a, Double.parseDouble(TF_Unidades.getText()))+"$");
     
            }
            else
            {
                JOptionPane.showMessageDialog(null,"NADA MAS DISPONEMOS DE " + Productos.ArrayP.get(a).getTamaño()+ " UNIDADES EN STOCK!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"NO SE PUDO ENCONTRAR EL ID: " + TF_ID.getText() + "!");
            TF_ID.setText("");
        }
    }//GEN-LAST:event_Calcular_PrecioActionPerformed

      public double Venta(int a, double tamaño)
    {
        double Venta = (tamaño * Productos.ArrayP.get(a).getPrecio());
        return Venta;
    }
    
    private void Calcular_CambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcular_CambioActionPerformed
       int a = IDs(TF_ID.getText());
        double b = Double.parseDouble(TF_Pago.getText());

        if(b >= Venta(a, Double.parseDouble(TF_Unidades.getText())))
        {
            Productos.ArrayP.get(a).Venta(Double.parseDouble(TF_Unidades.getText()));

            b = b - Productos.ArrayP.get(a).getGanancia();

            TF_Cambio.setText(b + "$");

      
            String matriz [] [] = new String [Productos.ArrayP.size()] [4];
            Productoss(matriz);
        }
        else
        {
            b = Venta(a, Double.parseDouble(TF_Unidades.getText())) - b;
            JOptionPane.showMessageDialog(null,"NEL CARNAL, TE FALTAN:  " + b + "$" + " NO ME QUIERAS TOMAR EL PELO!");
        }
    }//GEN-LAST:event_Calcular_CambioActionPerformed

     
        public void Productoss(String [] [] matriz )
    {
        for(int i=0; i<Productos.ArrayP.size(); i++)
            {
                String carne = Productos.ArrayP.get(i).getTipo();
                switch(carne)
                {
                case "Guantes":
                        AgregarProd("Guantes",matriz);
                        break;
                    case "Magnesia":
                        AgregarProd("Magnesia",matriz);
                        break;
                    case "Traje":
                        AgregarProd("Traje",matriz);
                        break;
                    case "Zapatillas":
                        AgregarProd("Zapatillas",matriz);
                        break;
                    default:
                        System.out.println("Que haces aqui _ Edit");
                        break;
                }
                Tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String [] {
                    "ID", "Producto Seleccionado", "Stock", "Precio"
                }
                ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
                });
            }
    }
        
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Principal d = new Principal();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

  
    public void AgregarProd(String Tipo, String[][] matriz)
    {
        if(Productos.ArrayP.isEmpty()){}
        else
        {
            for(int i=0; i<Productos.ArrayP.size(); i++)
            {
                if(Productos.ArrayP.get(i).getTipo().equals(Tipo))
                {
                    matriz [i] [0] = " " + Productos.ArrayP.get(i).getId_Producto();
                    matriz [i] [1] = " " + Productos.ArrayP.get(i).getTipo();
                    matriz [i] [2] = " " + Productos.ArrayP.get(i).getTamaño();
                    matriz [i] [3] = " " + Productos.ArrayP.get(i).getPrecio()+"$";
                }
            }
        }
    }
    
    public int IDs(String ID)
    {
        int a = 0;
        if(Productos.ArrayP.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"NO HAY PRODUCTOS REGISTRADOS!");
        }
        else
        {
            for(int i=0; i<Productos.ArrayP.size(); i++)
            {
                if(Productos.ArrayP.get(i).getId_Producto().equals(ID))
                {
                    a = i;
                }
            }
        }
        return a;
    }
    

        public void AgregarPadress(){
        String Matriz[][]  = new String[Alumno.listasalumno.size()][4];
        for(int i = 0; i < Alumno.listasalumno.size(); i++){
            Matriz [i] [0] = " " + Padre.listaspadres.get(i).getMatricula();
            Matriz [i] [1] = " " + Padre.listaspadres.get(i).getNombrealum();
            Matriz [i] [2] = " " + Padre.listaspadres.get(i).getNombre();
            Matriz [i] [3] = " " + Padre.listaspadres.get(i).getTelefono();
        }
       TablaPadres.setModel(new javax.swing.table.DefaultTableModel(
          Matriz, 
          new String []{
              "ID", "Alumno", "Padre", "Telefono"
          }
       ));
      }
    
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
            java.util.logging.Logger.getLogger(Ventass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular_Cambio;
    private javax.swing.JButton Calcular_Precio;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel L_Cambio;
    private javax.swing.JLabel L_Costo;
    private javax.swing.JLabel L_ID;
    private javax.swing.JLabel L_Kg;
    private javax.swing.JLabel L_Pago;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JTextField TF_Cambio;
    private javax.swing.JTextField TF_Costo;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_Pago;
    private javax.swing.JTextField TF_Unidades;
    private javax.swing.JTable TablaPadres;
    private javax.swing.JTable Tabla_Productos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
