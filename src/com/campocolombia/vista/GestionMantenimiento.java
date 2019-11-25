
package com.campocolombia.vista;

import com.campocolombia.controlador.ControladorGestionMantenimiento;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;


public class GestionMantenimiento extends javax.swing.JFrame {

   public ControladorGestionMantenimiento controlador = null;
    public GestionMantenimiento() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        textIDColmena = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        textTipoMantenimiento = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btmIngresar = new javax.swing.JButton();
        fechaMantenimiento = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAnotaciones = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        selectBorrado = new javax.swing.JComboBox<>();
        textIDMantenimiento = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        btmModificar = new javax.swing.JButton();
        btmConsulta = new javax.swing.JButton();
        btmBorrado = new javax.swing.JButton();
        fechaMantenimientoConsulta = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mantenimiento.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        jLabel2.setText("Gestión del Mantenimiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel2)
                        .addGap(0, 215, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 150));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel18.setText("ID Colmena");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        textIDColmena.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        textIDColmena.setBorder(null);
        textIDColmena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDColmenaActionPerformed(evt);
            }
        });
        jPanel10.add(textIDColmena, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 228, 30));
        jPanel10.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 228, 10));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel19.setText("Tipo Mantenimiento");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        textTipoMantenimiento.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        textTipoMantenimiento.setBorder(null);
        jPanel10.add(textTipoMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 228, 30));
        jPanel10.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 228, 12));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel20.setText("Anotaciones");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel23.setText("Fecha");
        jPanel10.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        btmIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btmIngresar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btmIngresar.setText("Ingresar");
        jPanel10.add(btmIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        fechaMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        fechaMantenimiento.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel10.add(fechaMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 230, 30));

        textAnotaciones.setColumns(20);
        textAnotaciones.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        textAnotaciones.setRows(5);
        jScrollPane1.setViewportView(textAnotaciones);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 190, 230, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        selectBorrado.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        selectBorrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por ID" }));

        textIDMantenimiento.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        textIDMantenimiento.setBorder(null);

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel17.setText("ID");

        btmModificar.setBackground(new java.awt.Color(255, 255, 255));
        btmModificar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btmModificar.setText("Modificar");
        btmModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmModificarActionPerformed(evt);
            }
        });

        btmConsulta.setBackground(new java.awt.Color(255, 255, 255));
        btmConsulta.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btmConsulta.setText("Consulta");

        btmBorrado.setBackground(new java.awt.Color(255, 255, 255));
        btmBorrado.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btmBorrado.setText("Borrado");

        fechaMantenimientoConsulta.setBackground(new java.awt.Color(255, 255, 255));
        fechaMantenimientoConsulta.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel21.setText("Por Fecha");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(selectBorrado, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(fechaMantenimientoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textIDMantenimiento)
                                    .addComponent(jSeparator11))
                                .addGap(54, 54, 54)))))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btmModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btmConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btmBorrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(textIDMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btmModificar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btmConsulta)
                    .addComponent(fechaMantenimientoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectBorrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmBorrado))
                .addGap(126, 126, 126))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 550, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblConsulta);

        btnAtras.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnAtras.setText("Atras");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 600, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textIDColmenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDColmenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDColmenaActionPerformed

    private void btmModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btmModificarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionMantenimiento().setVisible(true);
            }
        });
    }
public void setControlador(ControladorGestionMantenimiento controlador) {
        
        //Bototones Abeja
        this.controlador = controlador;     
        this.addWindowListener((WindowListener) controlador);
        this.btmConsulta.addActionListener((ActionListener) controlador);
        this.btmIngresar.addActionListener((ActionListener) controlador);
        this.btmModificar.addActionListener((ActionListener) controlador);
        this.btmBorrado.addActionListener((ActionListener) controlador);
        this.btnAtras.addActionListener((ActionListener) controlador);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btmBorrado;
    public javax.swing.JButton btmConsulta;
    public javax.swing.JButton btmIngresar;
    public javax.swing.JButton btmModificar;
    public javax.swing.JButton btnAtras;
    public com.toedter.calendar.JDateChooser fechaMantenimiento;
    public com.toedter.calendar.JDateChooser fechaMantenimientoConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    public javax.swing.JComboBox<String> selectBorrado;
    public javax.swing.JTable tblConsulta;
    public javax.swing.JTextArea textAnotaciones;
    public javax.swing.JTextField textIDColmena;
    public javax.swing.JTextField textIDMantenimiento;
    public javax.swing.JTextField textTipoMantenimiento;
    // End of variables declaration//GEN-END:variables
}
