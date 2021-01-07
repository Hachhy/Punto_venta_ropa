/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_TipTop;

import javax.swing.JOptionPane;
import sistema_TipTop.datos.baseDatos;
import sistema_TipTop.pojos.proveedor;

/**
 *
 * @author Jose
 */
public class areaProveedor extends javax.swing.JDialog {
    
    baseDatos bd=new baseDatos();
    
    public areaProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(460,330);
        this.setTitle("Area de Proveedor");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        txfPrecioCompra = new javax.swing.JTextField();
        txfDireccion = new javax.swing.JTextField();
        txfTelefono = new javax.swing.JTextField();
        txfEmail = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txfClave = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txfContacto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Clave de Proveedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setText("Nombre del Proveedor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setText("Telefono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setText("Precio de Compra");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 235, -1));
        getContentPane().add(txfPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 235, -1));
        getContentPane().add(txfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 235, -1));
        getContentPane().add(txfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 235, -1));
        getContentPane().add(txfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 235, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 110, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 110, -1));
        getContentPane().add(txfClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 235, -1));

        jLabel6.setText("Dirección de Proveedor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel7.setText("Nombre de Contacto");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        getContentPane().add(txfContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 235, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       
        int clave =Integer.parseInt(txfClave.getText());
        String nombre=txfNombre.getText();
        String direccion=txfDireccion.getText();
        int telefono=Integer.parseInt(txfTelefono.getText());
        String email=txfEmail.getText();
        String contacto=txfContacto.getText();
        Double precioCompra=Double.parseDouble(txfPrecioCompra.getText());
        
        
        proveedor p=new proveedor(clave, nombre, direccion, telefono, email, contacto, precioCompra);
        bd.insertarProveedor(p);
        JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente");
        this.dispose();
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(areaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(areaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(areaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(areaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                areaProveedor dialog = new areaProveedor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txfClave;
    private javax.swing.JTextField txfContacto;
    private javax.swing.JTextField txfDireccion;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfPrecioCompra;
    private javax.swing.JTextField txfTelefono;
    // End of variables declaration//GEN-END:variables
}
