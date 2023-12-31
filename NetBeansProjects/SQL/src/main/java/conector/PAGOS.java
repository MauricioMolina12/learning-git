/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conector;

import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class PAGOS extends javax.swing.JFrame {

    SQL s = new SQL();
    String atributo = "NumeroFactura";

    /**
     * Creates new form PAGOS
     */
    public PAGOS() {
        initComponents();
        mostrarTabla("");

    }

    private void limpiarCajas() {
        NFACTURA.setText("");
        jdfecha.setDate(null);
        TOTAL.setText("");
        CLIENTE.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CLIENTE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NFACTURA = new javax.swing.JTextField();
        TOTAL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        REGISTRAR = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        RESTABLECER = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jdfecha = new com.toedter.calendar.JDateChooser();
        ELIMINAR = new javax.swing.JButton();
        SELECCIONAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapagos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PAGOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        CLIENTE.setBackground(java.awt.Color.white);
        CLIENTE.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TOTAL");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FECHA");

        NFACTURA.setBackground(java.awt.Color.white);
        NFACTURA.setForeground(new java.awt.Color(0, 0, 0));

        TOTAL.setBackground(java.awt.Color.white);
        TOTAL.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("N FACTURA");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CLIENTE");

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("________________________________________________________________________________________________________");

        REGISTRAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        REGISTRAR.setForeground(new java.awt.Color(0, 102, 102));
        REGISTRAR.setText("REGISTRAR");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });

        limpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        limpiar.setForeground(new java.awt.Color(0, 102, 102));
        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        RESTABLECER.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RESTABLECER.setForeground(new java.awt.Color(0, 102, 102));
        RESTABLECER.setText("RESTABLECER");
        RESTABLECER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESTABLECERActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jdfecha.setDateFormatString("yyyy/MM/dd HH:mm:ss");

        ELIMINAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ELIMINAR.setForeground(new java.awt.Color(0, 102, 102));
        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        SELECCIONAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SELECCIONAR.setForeground(new java.awt.Color(0, 102, 102));
        SELECCIONAR.setText("SELECCIONAR");
        SELECCIONAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SELECCIONARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NFACTURA, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(jdfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(REGISTRAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SELECCIONAR, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ELIMINAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RESTABLECER, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NFACTURA)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jdfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REGISTRAR)
                    .addComponent(limpiar)
                    .addComponent(ELIMINAR)
                    .addComponent(RESTABLECER))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(SELECCIONAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        tablapagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablapagos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void mostrarTabla(String valor) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Número de Factura");
        modelo.addColumn("Fecha");
        modelo.addColumn("Total");
        modelo.addColumn("Cliente");
        tablapagos.setModel(modelo);

        String SQL = "";

        if (valor.equals("")) {
            SQL = "SELECT * FROM pagos";
        } else {
            SQL = "SELECT * FROM pagos WHERE " + atributo + "='" + valor + "'";
        }
        String datos[] = new String[4];

        Statement st;

        try {
            st = s.cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);

                modelo.addRow(datos);
            }
            tablapagos.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }
    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
        try {
            // TODO add your handling code here:
            String consulta = "SELECT * FROM pagos where NumeroFactura = ?";
            PreparedStatement stmt = s.cn.prepareStatement(consulta);
            stmt.setString(1, NFACTURA.getText());
            ResultSet resultados = stmt.executeQuery();

            if (resultados.next()) {
                JOptionPane.showMessageDialog(null, "This ID is already related to a payment.");
            } else {
                PreparedStatement pps = s.cn.prepareStatement("INSERT INTO pagos(NumeroFactura,fecha,total,id_cliente) VALUES (?,?,?,?)");
                pps.setString(1, NFACTURA.getText());
                pps.setString(2, ((JTextField) jdfecha.getDateEditor().getUiComponent()).getText());
                pps.setString(3, TOTAL.getText());
                pps.setString(4, CLIENTE.getText());

                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS");
                limpiarCajas();
                mostrarTabla("");
                pps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "REGISTRO NO HECHO");
        }
    }//GEN-LAST:event_REGISTRARActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_limpiarActionPerformed

    private void RESTABLECERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESTABLECERActionPerformed
        // TODO add your handling code here:
        mostrarTabla("");
    }//GEN-LAST:event_RESTABLECERActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new SQL().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        // TODO add your handling code here:
        int fila = tablapagos.getSelectedRow();

        if (fila >= 0) {
            try {
                PreparedStatement pps = s.cn.prepareStatement("DELETE FROM pagos where NumeroFactura='" + NFACTURA.getText() + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "DATO ELIMINADO");
                mostrarTabla("");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "DATO NO ELIMINADO");
            }
        }
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void SELECCIONARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SELECCIONARActionPerformed
        // TODO add your handling code here:
        
        int fila = tablapagos.getSelectedRow();
        if (fila >= 0) {
            String numeroFactura = tablapagos.getValueAt(fila, 0).toString();

            try {
                String sql = "SELECT fecha, total, id_cliente FROM pagos WHERE NumeroFactura = ?";
                PreparedStatement statement = s.cn.prepareStatement(sql);
                statement.setString(1, numeroFactura);
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    
                    NFACTURA.setText(tablapagos.getValueAt(fila, 0).toString());
                    
                    java.sql.Timestamp f = resultSet.getTimestamp("fecha");
                    jdfecha.setDate(new java.util.Date(f.getTime()));

                    double total = resultSet.getDouble("total");
                    TOTAL.setText(Double.toString(total));

                    int idCliente = resultSet.getInt("id_cliente");
                    CLIENTE.setText(Integer.toString(idCliente));
                    
                } else {
                    
                    JOptionPane.showMessageDialog(null, "FILA NO SELECCIONADA", "¡ERROR!", HEIGHT);
                    
                    
                }

               
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        
    }//GEN-LAST:event_SELECCIONARActionPerformed

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
            java.util.logging.Logger.getLogger(PAGOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PAGOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PAGOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PAGOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PAGOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CLIENTE;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JTextField NFACTURA;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JButton RESTABLECER;
    private javax.swing.JButton SELECCIONAR;
    private javax.swing.JTextField TOTAL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdfecha;
    private javax.swing.JButton limpiar;
    private javax.swing.JTable tablapagos;
    // End of variables declaration//GEN-END:variables
}
