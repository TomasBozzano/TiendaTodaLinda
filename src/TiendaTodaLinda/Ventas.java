package TiendaTodaLinda;

import static java.awt.Color.black;
import static java.awt.Color.gray;

public class Ventas extends javax.swing.JPanel {

    public Ventas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new java.awt.Panel();
        ContenedorVentas = new java.awt.Panel();
        CargarVenta = new java.awt.Panel();
        jNombreL = new javax.swing.JLabel();
        jCodL = new javax.swing.JLabel();
        jCodProd = new javax.swing.JTextField();
        jProdNombre = new javax.swing.JTextField();
        jAgregarVenta = new javax.swing.JButton();
        jModificarVenta = new javax.swing.JButton();
        jCliL = new javax.swing.JLabel();
        jCantL = new javax.swing.JLabel();
        jComboCli = new javax.swing.JComboBox<>();
        jResetear = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jCant = new javax.swing.JTextField();
        jPrecioL = new javax.swing.JLabel();
        jPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jVenta = new javax.swing.JTable();
        jTotalL = new javax.swing.JLabel();
        jTotal = new javax.swing.JTextField();
        jGuardarVenta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();

        Contenedor.setBackground(new java.awt.Color(183, 226, 209));
        Contenedor.setMaximumSize(new java.awt.Dimension(900, 730));
        Contenedor.setMinimumSize(new java.awt.Dimension(900, 730));
        Contenedor.setPreferredSize(new java.awt.Dimension(900, 730));
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContenedorVentas.setBackground(new java.awt.Color(254, 249, 245));
        ContenedorVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ContenedorVentas.setMaximumSize(new java.awt.Dimension(700, 450));
        ContenedorVentas.setMinimumSize(new java.awt.Dimension(700, 450));

        CargarVenta.setBackground(new java.awt.Color(254, 255, 190));
        CargarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CargarVenta.setForeground(new java.awt.Color(255, 255, 255));
        CargarVenta.setMaximumSize(new java.awt.Dimension(610, 450));
        CargarVenta.setMinimumSize(new java.awt.Dimension(610, 450));

        jNombreL.setBackground(new java.awt.Color(204, 204, 204));
        jNombreL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNombreL.setText("Nombre :");
        jNombreL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jCodL.setBackground(new java.awt.Color(204, 204, 204));
        jCodL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCodL.setText("Cod. Producto :");
        jCodL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jCodProd.setForeground(new java.awt.Color(102, 102, 102));
        jCodProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCodProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCodProdFocusLost(evt);
            }
        });

        jProdNombre.setForeground(new java.awt.Color(102, 102, 102));
        jProdNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jProdNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jProdNombreFocusLost(evt);
            }
        });

        jAgregarVenta.setText("Agregar");
        jAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarVentaActionPerformed(evt);
            }
        });

        jModificarVenta.setText("Modificar");
        jModificarVenta.setActionCommand("Modificar");
        jModificarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarVentaActionPerformed(evt);
            }
        });

        jCliL.setBackground(new java.awt.Color(204, 204, 204));
        jCliL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCliL.setText("Cliente :");
        jCliL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jCantL.setBackground(new java.awt.Color(204, 204, 204));
        jCantL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCantL.setText("Cant :");
        jCantL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jComboCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese el Cliente" }));

        jResetear.setText("Limpiar");
        jResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetearActionPerformed(evt);
            }
        });

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jCant.setForeground(new java.awt.Color(102, 102, 102));
        jCant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCantFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCantFocusLost(evt);
            }
        });
        jCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCantKeyPressed(evt);
            }
        });

        jPrecioL.setBackground(new java.awt.Color(204, 204, 204));
        jPrecioL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPrecioL.setText("Precio :");
        jPrecioL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPrecio.setForeground(new java.awt.Color(102, 102, 102));
        jPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPrecioFocusLost(evt);
            }
        });
        jPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPrecioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout CargarVentaLayout = new javax.swing.GroupLayout(CargarVenta);
        CargarVenta.setLayout(CargarVentaLayout);
        CargarVentaLayout.setHorizontalGroup(
            CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargarVentaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargarVentaLayout.createSequentialGroup()
                        .addComponent(jCodL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(CargarVentaLayout.createSequentialGroup()
                        .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CargarVentaLayout.createSequentialGroup()
                                .addComponent(jCantL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCant, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(CargarVentaLayout.createSequentialGroup()
                                .addComponent(jPrecioL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jAgregarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jModificarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(CargarVentaLayout.createSequentialGroup()
                        .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CargarVentaLayout.createSequentialGroup()
                                .addComponent(jNombreL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProdNombre))
                            .addGroup(CargarVentaLayout.createSequentialGroup()
                                .addComponent(jCliL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboCli, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        CargarVentaLayout.setVerticalGroup(
            CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargarVentaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboCli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCliL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCodL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProdNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNombreL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jResetear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargarVentaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jModificarVenta)
                            .addComponent(jAgregarVenta)))
                    .addGroup(CargarVentaLayout.createSequentialGroup()
                        .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPrecioL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCantL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nro", "Cod. Prod", "Nombre", "Uni.Precio", "Cant", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jVenta);

        jTotalL.setBackground(new java.awt.Color(204, 204, 204));
        jTotalL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTotalL.setText("Venta Total :");
        jTotalL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTotal.setForeground(new java.awt.Color(102, 102, 102));
        jTotal.setEnabled(false);
        jTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTotalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTotalFocusLost(evt);
            }
        });
        jTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTotalKeyPressed(evt);
            }
        });

        jGuardarVenta.setText("Generar venta");
        jGuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorVentasLayout = new javax.swing.GroupLayout(ContenedorVentas);
        ContenedorVentas.setLayout(ContenedorVentasLayout);
        ContenedorVentasLayout.setHorizontalGroup(
            ContenedorVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorVentasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ContenedorVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContenedorVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CargarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addGroup(ContenedorVentasLayout.createSequentialGroup()
                        .addComponent(jTotalL, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jGuardarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        ContenedorVentasLayout.setVerticalGroup(
            ContenedorVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CargarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContenedorVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTotalL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGuardarVenta))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Contenedor.add(ContenedorVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 650, 510));

        jTitulo.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jTitulo.setText("Ventas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jTitulo)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        Contenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 290, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCodProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCodProdFocusGained
        if (jCodProd.getText().equals("Escriba el codigo del producto")) {
            jCodProd.setText("");
            jCodProd.setForeground(black);
        }
    }//GEN-LAST:event_jCodProdFocusGained

    private void jCodProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCodProdFocusLost
        if (jCodProd.getText().equals("")) {
            jCodProd.setText("Escriba el codigo del producto");
            jCodProd.setForeground(gray);
        }
    }//GEN-LAST:event_jCodProdFocusLost

    private void jProdNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jProdNombreFocusGained
        if (jProdNombre.getText().equals("Escriba el nombre del producto")) {
            jProdNombre.setText("");
            jProdNombre.setForeground(black);
        }
    }//GEN-LAST:event_jProdNombreFocusGained

    private void jProdNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jProdNombreFocusLost
        if(jProdNombre.getText().equals("")) {
            jProdNombre.setText("Escriba el nombre del producto");
            jProdNombre.setForeground(gray);
        }
    }//GEN-LAST:event_jProdNombreFocusLost

    private void jAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarVentaActionPerformed

    }//GEN-LAST:event_jAgregarVentaActionPerformed

    private void jModificarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarVentaActionPerformed
        
    }//GEN-LAST:event_jModificarVentaActionPerformed

    private void jResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetearActionPerformed
        
    }//GEN-LAST:event_jResetearActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jCantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCantFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jCantFocusGained

    private void jCantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCantFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jCantFocusLost

    private void jCantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCantKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCantKeyPressed

    private void jPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPrecioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecioFocusGained

    private void jPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPrecioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecioFocusLost

    private void jPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPrecioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecioKeyPressed

    private void jTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTotalFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalFocusGained

    private void jTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTotalFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalFocusLost

    private void jTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTotalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalKeyPressed

    private void jGuardarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGuardarVentaActionPerformed

    //metodo buscar codigo para llenar 
public void buscar(){
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel CargarVenta;
    private java.awt.Panel Contenedor;
    private java.awt.Panel ContenedorVentas;
    private javax.swing.JButton jAgregarVenta;
    private javax.swing.JButton jBuscar;
    private javax.swing.JTextField jCant;
    private javax.swing.JLabel jCantL;
    private javax.swing.JLabel jCliL;
    private javax.swing.JLabel jCodL;
    private javax.swing.JTextField jCodProd;
    private javax.swing.JComboBox<String> jComboCli;
    private javax.swing.JButton jGuardarVenta;
    private javax.swing.JButton jModificarVenta;
    private javax.swing.JLabel jNombreL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPrecio;
    private javax.swing.JLabel jPrecioL;
    private javax.swing.JTextField jProdNombre;
    private javax.swing.JButton jResetear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JTextField jTotal;
    private javax.swing.JLabel jTotalL;
    private javax.swing.JTable jVenta;
    // End of variables declaration//GEN-END:variables
}
