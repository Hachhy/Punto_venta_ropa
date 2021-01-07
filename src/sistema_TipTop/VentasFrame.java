/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_TipTop;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistema_TipTop.datos.baseDatos;
import sistema_TipTop.pojos.articulo;

/**
 *
 * @author Jose
 */
public class VentasFrame extends javax.swing.JInternalFrame {

    DefaultTableModel modeloTabla = new DefaultTableModel();
    baseDatos bd = new baseDatos();

    public VentasFrame() {
        initComponents();
        this.setSize(1024, 688);

        cargarColumnasTabla();
        cargarModeloTabla();
    }

    private void cargarColumnasTabla() {

        modeloTabla.addColumn("Clave");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Existencias");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Precio Unidad");
        modeloTabla.addColumn("Costo");

    }
    int i = 0;

    private void cargarModeloTabla() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbVentas = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblVentaAcumulada = new javax.swing.JLabel();
        lblVenta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txfNombre = new javax.swing.JTextField();
        txfCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRealizarVenta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txfCodigo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txAreaDetallesCompra = new javax.swing.JTextArea();

        setTitle("Ventas");

        tbVentas.setModel(modeloTabla);
        jScrollPane1.setViewportView(tbVentas);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText("Venta del dia");

        lblVentaAcumulada.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblVentaAcumulada.setText("S/0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblVentaAcumulada, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblVentaAcumulada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblVenta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblVenta.setText("S/0.00");

        jLabel4.setText("Cantidad");

        btnIngresar.setBackground(new java.awt.Color(0, 204, 102));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRealizarVenta.setBackground(new java.awt.Color(0, 153, 153));
        btnRealizarVenta.setText("Realizar venta");
        btnRealizarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRealizarVentaMouseClicked(evt);
            }
        });
        btnRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVentaActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre");

        jLabel6.setText("Codigo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(txfNombre)
                            .addComponent(txfCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnRealizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addComponent(btnRealizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de Compra"));

        txAreaDetallesCompra.setColumns(20);
        txAreaDetallesCompra.setRows(5);
        jScrollPane2.setViewportView(txAreaDetallesCompra);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    double venta = 0;
    double ventaAcumulada=0;
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        try {
            articulo art = null;

            if (!txfNombre.getText().equals("") && txfCodigo.getText().equals("")) {

                String nombre = txfNombre.getText();
                int cantidad = Integer.parseInt(txfCantidad.getText());

                art = bd.obtenerArticuloParaVenta(nombre);

                if (art == null) {
                    JOptionPane.showMessageDialog(this, "No se encontro articulo");
                } else {
                    modeloTabla.setNumRows(i + 1);

                    modeloTabla.setValueAt(art.getNombreArt(), i, 1);
                    modeloTabla.setValueAt(art.getIdArticulo(), i, 0);
                    modeloTabla.setValueAt(art.getExistenciasArticulo(), i, 2);
                    modeloTabla.setValueAt(cantidad, i, 3);
                    modeloTabla.setValueAt(art.getpVentaArticulo(), i, 4);

                    double costo = cantidad * art.getpVentaArticulo();

                    modeloTabla.setValueAt(costo, i, 5);
                    i++;
                    actualizarLblVentas();
                    txfNombre.setText("");
                    txfCantidad.setText("");
                }
            }
//            if (!txfCodigo.getText().equals("") && txfNombre.getText().equals("")) {
//                int clave = Integer.parseInt(txfCodigo.getText());
//                int cantidad = Integer.parseInt(txfCantidad.getText());
//                System.out.println("codigo"+clave);
//                art = bd.obtenerArticuloParaVenta(String.valueOf(clave));
//                modeloTabla.setNumRows(i + 1);
//
//                modeloTabla.setValueAt(art.getNombreArt(), i, 0);
//                modeloTabla.setValueAt(art.getIdArticulo(), i, 1);
//                modeloTabla.setValueAt(cantidad, i, 2);
//                i++;
//
//            } 
            if (txfCodigo.getText().equals("") && txfNombre.getText().equals("")) {
                System.out.println("inserte codigo o nombre");
            }

//            String h=  (String) modeloTabla.getValueAt(1, 1);
//            System.out.println(h);
        } catch (Exception e) {
            e.getMessage();
        }


    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas eliminar el articulo?");

        if (opcion == 0) {
            modeloTabla.removeRow(tbVentas.getSelectedRow());
            i--;
            actualizarLblVentas();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRealizarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRealizarVentaMouseClicked
        
            
    }//GEN-LAST:event_btnRealizarVentaMouseClicked

    private void btnRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVentaActionPerformed
       
//        ArrayList<articulo> listaArtVenta=new ArrayList<articulo>();
        articulo art=null;
        String nombre;
        int cantidad, nuevaEx;
        double costo;
        
        for(int x=0;x<i;x++){
            
            nombre=(String) tbVentas.getValueAt(x, 1);
            cantidad=(int) tbVentas.getValueAt(x, 3);
            costo=(double) tbVentas.getValueAt(x, 5);
            
            art=bd.obtenerArticuloParaVenta(nombre);
//            listaArtVenta.add(art);
            
            nuevaEx=art.getExistenciasArticulo()-cantidad;
            bd.actualizarInventario(art, nuevaEx);
            detalleCompras(art,costo,cantidad);
        }
        double montoCompra=venta;
        actualizarVentaAcumulada(montoCompra);
        limpiarTabla();
        
    }//GEN-LAST:event_btnRealizarVentaActionPerformed

    public void detalleCompras(articulo art,double costo,int cantidad){
        
        txAreaDetallesCompra.append("\nArticulo: "+art.getNombreArt() +" -- "+"Cantidad: "+cantidad+" Costo:"+costo);
    }
    
    
    public void actualizarLblVentas() {
        this.venta = 0;
        if (tbVentas.getRowCount() <= 0) {
            lblVenta.setText("S/ " + venta);
        } else {
            for (int x = 0; x < i; x++) {
                double costos = (double) tbVentas.getValueAt(x, 5);
                this.venta = venta + costos;
                lblVenta.setText("S/ " + venta);
            }
        }
    }
    
    public void actualizarVentaAcumulada(double monto){
            this.ventaAcumulada=ventaAcumulada+monto;
            lblVentaAcumulada.setText("S/ "+ventaAcumulada);
    }
    
    public void limpiarTabla(){
        int numFilas = modeloTabla.getRowCount();
        if (numFilas > 0) {
            for (int x = numFilas - 1; x >= 0; x--) {
                modeloTabla.removeRow(x);
            }
        }
        this.i=0;
        actualizarLblVentas();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRealizarVenta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblVenta;
    private javax.swing.JLabel lblVentaAcumulada;
    private javax.swing.JTable tbVentas;
    private javax.swing.JTextArea txAreaDetallesCompra;
    private javax.swing.JTextField txfCantidad;
    private javax.swing.JTextField txfCodigo;
    private javax.swing.JTextField txfNombre;
    // End of variables declaration//GEN-END:variables
}
