package TiendaTodaLinda;

import TiendaTodaLinda.Clases.Conexion;
import static java.awt.Color.black;
import static java.awt.Color.gray;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Informe extends javax.swing.JPanel {
    
    Connection con;
    Statement st;
    DefaultTableModel modelo;
    PreparedStatement ps;
    ResultSet rs;
    CallableStatement cs;
    ResultSetMetaData rsMd;

    public Informe() {
        initComponents();
        
        jFechaI.setText("Ingrese fecha de inicio");
        jFechaF.setText("Ingrese fecha final");
        jCli.setText("Ingrese el nombre o Documento");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new java.awt.Panel();
        ContenedorInforme = new java.awt.Panel();
        CargarVenta = new java.awt.Panel();
        jFechaFL = new javax.swing.JLabel();
        jFechaIL = new javax.swing.JLabel();
        jFechaI = new javax.swing.JTextField();
        jFechaF = new javax.swing.JTextField();
        jBuscarCli = new javax.swing.JButton();
        jResetear = new javax.swing.JButton();
        jBuscarFecha = new javax.swing.JButton();
        jCliL = new javax.swing.JLabel();
        jCli = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jInforme = new javax.swing.JTable();
        jTotalL = new javax.swing.JLabel();
        jTotal = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();

        Contenedor.setBackground(new java.awt.Color(183, 226, 209));
        Contenedor.setMaximumSize(new java.awt.Dimension(900, 730));
        Contenedor.setMinimumSize(new java.awt.Dimension(900, 730));
        Contenedor.setPreferredSize(new java.awt.Dimension(900, 730));
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContenedorInforme.setBackground(new java.awt.Color(254, 249, 245));
        ContenedorInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ContenedorInforme.setMaximumSize(new java.awt.Dimension(700, 450));
        ContenedorInforme.setMinimumSize(new java.awt.Dimension(700, 450));

        CargarVenta.setBackground(new java.awt.Color(254, 255, 190));
        CargarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CargarVenta.setForeground(new java.awt.Color(255, 255, 255));
        CargarVenta.setMaximumSize(new java.awt.Dimension(610, 450));
        CargarVenta.setMinimumSize(new java.awt.Dimension(610, 450));

        jFechaFL.setBackground(new java.awt.Color(204, 204, 204));
        jFechaFL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFechaFL.setText("Fecha Final :");
        jFechaFL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jFechaIL.setBackground(new java.awt.Color(204, 204, 204));
        jFechaIL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFechaIL.setText("Fecha Inicio :");
        jFechaIL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jFechaI.setForeground(new java.awt.Color(102, 102, 102));
        jFechaI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFechaIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFechaIFocusLost(evt);
            }
        });

        jFechaF.setForeground(new java.awt.Color(102, 102, 102));
        jFechaF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFechaFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFechaFFocusLost(evt);
            }
        });

        jBuscarCli.setText("Por cliente");
        jBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarCliActionPerformed(evt);
            }
        });

        jResetear.setText("Limpiar");
        jResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetearActionPerformed(evt);
            }
        });

        jBuscarFecha.setText("Por fechas");
        jBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarFechaActionPerformed(evt);
            }
        });

        jCliL.setBackground(new java.awt.Color(204, 204, 204));
        jCliL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCliL.setText("Cliente :");
        jCliL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jCli.setForeground(new java.awt.Color(102, 102, 102));
        jCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCliFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCliFocusLost(evt);
            }
        });

        javax.swing.GroupLayout CargarVentaLayout = new javax.swing.GroupLayout(CargarVenta);
        CargarVenta.setLayout(CargarVentaLayout);
        CargarVentaLayout.setHorizontalGroup(
            CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargarVentaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargarVentaLayout.createSequentialGroup()
                        .addComponent(jCliL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCli, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(CargarVentaLayout.createSequentialGroup()
                        .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CargarVentaLayout.createSequentialGroup()
                                .addComponent(jFechaFL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFechaF))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CargarVentaLayout.createSequentialGroup()
                                .addComponent(jFechaIL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(jResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        CargarVentaLayout.setVerticalGroup(
            CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargarVentaLayout.createSequentialGroup()
                .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargarVentaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFechaIL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFechaFL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuscarFecha)))
                    .addGroup(CargarVentaLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jResetear)))
                .addGap(18, 18, 18)
                .addGroup(CargarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCliL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscarCli))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jInforme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Cliente", "Cant", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jInforme);

        jTotalL.setBackground(new java.awt.Color(204, 204, 204));
        jTotalL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTotalL.setText("Venta Total :");
        jTotalL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTotal.setForeground(new java.awt.Color(102, 102, 102));
        jTotal.setEnabled(false);

        javax.swing.GroupLayout ContenedorInformeLayout = new javax.swing.GroupLayout(ContenedorInforme);
        ContenedorInforme.setLayout(ContenedorInformeLayout);
        ContenedorInformeLayout.setHorizontalGroup(
            ContenedorInformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorInformeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ContenedorInformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContenedorInformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CargarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addGroup(ContenedorInformeLayout.createSequentialGroup()
                        .addComponent(jTotalL, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        ContenedorInformeLayout.setVerticalGroup(
            ContenedorInformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorInformeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CargarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContenedorInformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTotalL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Contenedor.add(ContenedorInforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 650, 510));

        jTitulo.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jTitulo.setText("Informes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jTitulo)
                .addContainerGap(71, Short.MAX_VALUE))
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

    private void jFechaIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFechaIFocusGained
        if (jFechaI.getText().equals("Ingrese fecha de inicio")) {
            jFechaI.setText("");
            jFechaI.setForeground(black);
        }
    }//GEN-LAST:event_jFechaIFocusGained

    private void jFechaIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFechaIFocusLost
        if (jFechaI.getText().equals("")) {
            jFechaI.setText("Ingrese fecha de inicio");
            jFechaI.setForeground(gray);
        }
    }//GEN-LAST:event_jFechaIFocusLost

    private void jFechaFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFechaFFocusGained
        if (jFechaF.getText().equals("Ingrese fecha final")) {
            jFechaF.setText("");
            jFechaF.setForeground(black);
        }
    }//GEN-LAST:event_jFechaFFocusGained

    private void jFechaFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFechaFFocusLost
        if(jFechaF.getText().equals("")) {
            jFechaF.setText("Ingrese fecha final");
            jFechaF.setForeground(gray);
        }
    }//GEN-LAST:event_jFechaFFocusLost

    private void jBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarCliActionPerformed

    }//GEN-LAST:event_jBuscarCliActionPerformed

    private void jResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetearActionPerformed

    }//GEN-LAST:event_jResetearActionPerformed

    private void jBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarFechaActionPerformed
        buscarFecha();
    }//GEN-LAST:event_jBuscarFechaActionPerformed

    private void jCliFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCliFocusGained
        if(jCli.getText().equals("Ingrese el nombre o Documento")){
            jCli.setText("");
            jCli.setForeground(black);
        }
    }//GEN-LAST:event_jCliFocusGained

    private void jCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCliFocusLost
        if(jCli.getText().equals("")){
            jCli.setText("Ingrese el nombre o Documento");
            jCli.setForeground(gray);
        }
    }//GEN-LAST:event_jCliFocusLost
    //metodo de cuscar por fecha
public void buscarFecha(){
    String inicioFecha = jFechaI.getText();
    String finalFecha = jFechaF.getText();
    
    if(inicioFecha.equals("") || finalFecha.equals("")){
        JOptionPane.showMessageDialog(null, "Deberá completar los datos de fechas, por favor");
    }
    String sql = "{call EliminarProd(?, ?)}";

    try (CallableStatement cs = con.prepareCall(sql)) {

                // Establecer los parámetros del stored procedure
                cs.setString(1, inicioFecha);
                cs.setString(2, finalFecha);

                cs.executeUpdate();
                JOptionPane.showMessageDialog(null, "Producto eliminado");
        }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel CargarVenta;
    private java.awt.Panel Contenedor;
    private java.awt.Panel ContenedorInforme;
    private javax.swing.JButton jBuscarCli;
    private javax.swing.JButton jBuscarFecha;
    private javax.swing.JTextField jCli;
    private javax.swing.JLabel jCliL;
    private javax.swing.JTextField jFechaF;
    private javax.swing.JLabel jFechaFL;
    private javax.swing.JTextField jFechaI;
    private javax.swing.JLabel jFechaIL;
    private javax.swing.JTable jInforme;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jResetear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JTextField jTotal;
    private javax.swing.JLabel jTotalL;
    // End of variables declaration//GEN-END:variables
}
