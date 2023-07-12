/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class EMPLEADOS extends javax.swing.JFrame {

    SQL s = new SQL();
    String atributo = "id_empleado";
    /**
     * Creates new form EMPLEADOS
     */
    public EMPLEADOS() {
        initComponents();
        mostrarTabla("");
        AgregarItem();
    }
     void AgregarItem() {
        combo.addItem("ID_EMPLEADO");
        combo.addItem("NOMBRE");
        combo.addItem("EMAIL");
        
    }

    private void limpiarCajas() {
        IDE.setText("");
        NOMBREE.setText("");
        APELLIDOE.setText("");
        EXTENSIONE.setText("");
        EMAILE.setText("");
        OFICINAE.setText("");
        JEFEE.setText("");
        CARGOE.setText("");


    }
    void mostrarTabla(String valor) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código empleado");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Extensión");
        modelo.addColumn("Email");
        modelo.addColumn("Oficina");
        modelo.addColumn("Jefe");
        modelo.addColumn("Cargo");
        tablaempleados.setModel(modelo);

        String SQL = "";

        if (valor.equals("")) {
            SQL = "SELECT * FROM empleados";
        } else {
            SQL = "SELECT * FROM empleados WHERE " + atributo + "='" + valor + "'";
        }
        String datos[] = new String[8];

        Statement st;

        try {
            st = s.cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                modelo.addRow(datos);
            }
            tablaempleados.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        empleados = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        OFICINAE = new javax.swing.JTextField();
        JEFEE = new javax.swing.JTextField();
        EMAILE = new javax.swing.JTextField();
        APELLIDOE = new javax.swing.JTextField();
        CARGOE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IDE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EXTENSIONE = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NOMBREE = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        RESTABLECER = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        REGISTRAR = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        SELECCIONAR = new javax.swing.JButton();
        ACTUALIZAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempleados = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BID = new javax.swing.JRadioButton();
        BNOMBRE = new javax.swing.JRadioButton();
        BCP = new javax.swing.JRadioButton();
        txtbuscar = new javax.swing.JTextField();
        BUSCAR = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        combo = new javax.swing.JComboBox<>();
        txtbuscarC = new javax.swing.JTextField();
        BUSCAR_COMBO_BOX = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMPLEADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        OFICINAE.setBackground(java.awt.Color.white);
        OFICINAE.setForeground(new java.awt.Color(0, 0, 0));

        JEFEE.setBackground(java.awt.Color.white);
        JEFEE.setForeground(new java.awt.Color(0, 0, 0));

        EMAILE.setBackground(java.awt.Color.white);
        EMAILE.setForeground(new java.awt.Color(0, 0, 0));

        APELLIDOE.setBackground(java.awt.Color.white);
        APELLIDOE.setForeground(new java.awt.Color(0, 0, 0));

        CARGOE.setBackground(java.awt.Color.white);
        CARGOE.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EXTENSIÓN");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("OFICINA");

        IDE.setBackground(java.awt.Color.white);
        IDE.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("APELLIDO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE");

        EXTENSIONE.setBackground(java.awt.Color.white);
        EXTENSIONE.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EMAIL");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("JEFE");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CARGO");

        NOMBREE.setBackground(java.awt.Color.white);
        NOMBREE.setForeground(new java.awt.Color(0, 0, 0));

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

        ELIMINAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ELIMINAR.setForeground(new java.awt.Color(0, 102, 102));
        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        REGISTRAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        REGISTRAR.setForeground(new java.awt.Color(0, 102, 102));
        REGISTRAR.setText("REGISTRAR");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
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

        SELECCIONAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SELECCIONAR.setForeground(new java.awt.Color(0, 102, 102));
        SELECCIONAR.setText("SELECCIONAR");
        SELECCIONAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SELECCIONARActionPerformed(evt);
            }
        });

        ACTUALIZAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ACTUALIZAR.setForeground(new java.awt.Color(0, 102, 102));
        ACTUALIZAR.setText("ACTUALIZAR");
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel9)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EMAILE, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(APELLIDOE, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EXTENSIONE, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(IDE, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(NOMBREE, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JEFEE, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OFICINAE, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CARGOE, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SELECCIONAR)
                    .addComponent(REGISTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ACTUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ELIMINAR)
                        .addGap(25, 25, 25)
                        .addComponent(RESTABLECER, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDE)
                    .addComponent(jLabel8)
                    .addComponent(OFICINAE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOMBREE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(JEFEE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(APELLIDOE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EXTENSIONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EMAILE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CARGOE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(REGISTRAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(limpiar)
                        .addComponent(RESTABLECER)
                        .addComponent(ELIMINAR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SELECCIONAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ACTUALIZAR))
                    .addComponent(jButton1))
                .addContainerGap())
        );

        tablaempleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaempleados);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSULTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES DE BUSQUEDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        empleados.add(BID);
        BID.setForeground(new java.awt.Color(0, 102, 102));
        BID.setText("ID");
        BID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIDActionPerformed(evt);
            }
        });

        empleados.add(BNOMBRE);
        BNOMBRE.setForeground(new java.awt.Color(0, 102, 102));
        BNOMBRE.setText("NOMBRE");

        empleados.add(BCP);
        BCP.setForeground(new java.awt.Color(0, 102, 102));
        BCP.setText("EMAIL");

        txtbuscar.setBackground(new java.awt.Color(255, 255, 255));

        BUSCAR.setForeground(new java.awt.Color(0, 102, 102));
        BUSCAR.setText("BUSCAR");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BID)
                        .addGap(18, 18, 18)
                        .addComponent(BNOMBRE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BCP))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BUSCAR)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BID)
                    .addComponent(BNOMBRE)
                    .addComponent(BCP))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUSCAR))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES DE BUSQUEDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13), new java.awt.Color(0, 102, 102))); // NOI18N

        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        txtbuscarC.setBackground(new java.awt.Color(255, 255, 255));
        txtbuscarC.setForeground(new java.awt.Color(0, 0, 0));

        BUSCAR_COMBO_BOX.setForeground(new java.awt.Color(0, 102, 102));
        BUSCAR_COMBO_BOX.setText("BUSCAR");
        BUSCAR_COMBO_BOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCAR_COMBO_BOXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbuscarC)
                    .addComponent(combo, 0, 161, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BUSCAR_COMBO_BOX)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUSCAR_COMBO_BOX))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        // TODO add your handling code here:
        int fila = tablaempleados.getSelectedRow();

        if (fila >= 0) {
            try {
                PreparedStatement pps = s.cn.prepareStatement("DELETE FROM empleados where id_empleado='" + IDE.getText() + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "DATO ELIMINADO");
                mostrarTabla("");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "DATO NO ELIMINADO");
            }
        }
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void RESTABLECERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESTABLECERActionPerformed
        // TODO add your handling code here:
        mostrarTabla("");
    }//GEN-LAST:event_RESTABLECERActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new SQL().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        try {
            // TODO add your handling code here:
            PreparedStatement pps = s.cn.prepareStatement("UPDATE empleados SET id_empleado='" + IDE.getText() + "',nombre='" + NOMBREE.getText() + "',apellido='" + APELLIDOE.getText() + "',extension='" + EXTENSIONE.getText() + "',email='" + EMAILE.getText() + "',id_oficina='" + OFICINAE.getText() + "',jefe='" + JEFEE.getText() + "',cargo='" + CARGOE.getText() + "' WHERE id_empleado='" + IDE.getText() + "'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
            limpiarCajas();
            mostrarTabla("");
        } catch (SQLException ex) {
            Logger.getLogger(OFICINAS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ACTUALIZARActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_limpiarActionPerformed

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
        try {
            // TODO add your handling code here:
            String consulta = "SELECT * FROM empleados where id_empleado = ?";
            PreparedStatement stmt = s.cn.prepareStatement(consulta);
            stmt.setString(1, IDE.getText());
            ResultSet resultados = stmt.executeQuery();

            if (resultados.next()) {
                JOptionPane.showMessageDialog(null, "This ID is already related to an employee.");
            } else {
                PreparedStatement pps = s.cn.prepareStatement("INSERT INTO empleados(id_empleado,nombre,apellido,extension,email,id_oficina,jefe,cargo) VALUES (?,?,?,?,?,?,?,?)");
                pps.setString(1, IDE.getText());
                pps.setString(2, NOMBREE.getText());
                pps.setString(3, APELLIDOE.getText());
                pps.setString(4, EXTENSIONE.getText());
                pps.setString(5, EMAILE.getText());
                pps.setString(6, OFICINAE.getText());
                pps.setString(7, JEFEE.getText());
                pps.setString(8, CARGOE.getText());

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

    private void SELECCIONARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SELECCIONARActionPerformed
        // TODO add your handling code here:
        int fila = tablaempleados.getSelectedRow();

        if (fila >= 0) {

            IDE.setText(tablaempleados.getValueAt(fila, 0).toString());
            NOMBREE.setText(tablaempleados.getValueAt(fila, 1).toString());
            APELLIDOE.setText(tablaempleados.getValueAt(fila, 2).toString());
            EXTENSIONE.setText(tablaempleados.getValueAt(fila, 3).toString());
            EMAILE.setText(tablaempleados.getValueAt(fila, 4).toString());
            OFICINAE.setText(tablaempleados.getValueAt(fila, 5).toString());
            JEFEE.setText(tablaempleados.getValueAt(fila, 6).toString());
            CARGOE.setText(tablaempleados.getValueAt(fila, 7).toString());

        } else {
            JOptionPane.showMessageDialog(null, "FILA NO SELECCIONADA");
        }
    }//GEN-LAST:event_SELECCIONARActionPerformed

    private void BIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BIDActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        // TODO add your handling code here:
        if (BID.isSelected()) {
            atributo = "id_empleado";
            mostrarTabla(txtbuscar.getText());
        } else if (BNOMBRE.isSelected()) {
            atributo = "nombre";
            mostrarTabla(txtbuscar.getText());
        } else if (BCP.isSelected()) {
            atributo = "email";
            mostrarTabla(txtbuscar.getText());
        } else {
            JOptionPane.showMessageDialog(null, "NO SE HA SELECCIONADO NINGÚN TIPO DE BUSQUEDA");
        }
    }//GEN-LAST:event_BUSCARActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void BUSCAR_COMBO_BOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCAR_COMBO_BOXActionPerformed
        // TODO add your handling code here:
        atributo = combo.getSelectedItem().toString();
        mostrarTabla(txtbuscarC.getText());
    }//GEN-LAST:event_BUSCAR_COMBO_BOXActionPerformed

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
            java.util.logging.Logger.getLogger(EMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EMPLEADOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JTextField APELLIDOE;
    private javax.swing.JRadioButton BCP;
    private javax.swing.JRadioButton BID;
    private javax.swing.JRadioButton BNOMBRE;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JButton BUSCAR_COMBO_BOX;
    private javax.swing.JTextField CARGOE;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JTextField EMAILE;
    private javax.swing.JTextField EXTENSIONE;
    private javax.swing.JTextField IDE;
    private javax.swing.JTextField JEFEE;
    private javax.swing.JTextField NOMBREE;
    private javax.swing.JTextField OFICINAE;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JButton RESTABLECER;
    private javax.swing.JButton SELECCIONAR;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.ButtonGroup empleados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTable tablaempleados;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtbuscarC;
    // End of variables declaration//GEN-END:variables
}