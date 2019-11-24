
package com.campocolombia.vista;

import com.campocolombia.controlador.ControladorPrincipal;


public class Principal extends javax.swing.JFrame {

   
    //Variables
    public ControladorPrincipal controlador = null;

    /**
     * Creates new form MenuPrincipal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    public Principal(String usuario, String cargo) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        this.lblUsuarioEmpleado.setText(usuario);
        this.lblCargoEmpleado.setText(cargo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jPanel4 = new javax.swing.JPanel();
        labNombreEmpleadoLogin = new javax.swing.JLabel();
        labCargoLogin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblUsuarioEmpleado = new javax.swing.JLabel();
        lblCargoEmpleado = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btmGestionAbejas = new javax.swing.JButton();
        btmMantenimiento = new javax.swing.JButton();
        btmProduccion = new javax.swing.JButton();
        btmClima = new javax.swing.JButton();
        btmGestionUser = new javax.swing.JButton();
        btmGestionAbejas1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTituloA = new javax.swing.JLabel();
        lblTituloP = new javax.swing.JLabel();
        lblTituloM = new javax.swing.JLabel();
        lblTituloCl = new javax.swing.JLabel();
        lblTituloE = new javax.swing.JLabel();
        lblTituloA1 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CampoColombia_Pequeno.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setMaximumSize(new java.awt.Dimension(1069, 490));
        jLabel5.setMinimumSize(new java.awt.Dimension(1069, 490));
        jLabel5.setPreferredSize(new java.awt.Dimension(1069, 490));
        jFrame1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, 487, 202));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/abeja.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setFocusable(false);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mantenimiento.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusable(false);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setFocusable(false);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clima.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setFocusable(false);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setBorderPainted(false);
        jButton5.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Salir");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1000, 500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setText("Nombre Empleador");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setText("Cargo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(794, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jFrame1.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 240));

        jMenu3.setText("Archivo");

        jMenuItem1.setText("jMenuItem1");
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Editar");
        jMenuBar2.add(jMenu4);

        jFrame1.setJMenuBar(jMenuBar2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        labNombreEmpleadoLogin.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        labNombreEmpleadoLogin.setText("Nombre Empleador");

        labCargoLogin.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        labCargoLogin.setText("Cargo");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CampoColombia_Pequeno.png"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setMaximumSize(new java.awt.Dimension(1069, 490));
        jLabel7.setMinimumSize(new java.awt.Dimension(1069, 490));
        jLabel7.setPreferredSize(new java.awt.Dimension(1069, 490));

        lblUsuarioEmpleado.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblUsuarioEmpleado.setText("jLabel1");

        lblCargoEmpleado.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblCargoEmpleado.setText("jLabel2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNombreEmpleadoLogin)
                    .addComponent(labCargoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuarioEmpleado)
                    .addComponent(lblCargoEmpleado))
                .addGap(118, 118, 118))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblUsuarioEmpleado)
                                .addGap(18, 18, 18)
                                .addComponent(lblCargoEmpleado))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(labNombreEmpleadoLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labCargoLogin)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 240));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btmGestionAbejas.setBackground(new java.awt.Color(255, 255, 255));
        btmGestionAbejas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/abeja.png"))); // NOI18N
        btmGestionAbejas.setBorder(null);
        btmGestionAbejas.setFocusable(false);

        btmMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        btmMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mantenimiento.png"))); // NOI18N
        btmMantenimiento.setBorder(null);
        btmMantenimiento.setBorderPainted(false);
        btmMantenimiento.setFocusable(false);

        btmProduccion.setBackground(new java.awt.Color(255, 255, 255));
        btmProduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario.png"))); // NOI18N
        btmProduccion.setBorder(null);
        btmProduccion.setBorderPainted(false);
        btmProduccion.setFocusable(false);

        btmClima.setBackground(new java.awt.Color(255, 255, 255));
        btmClima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clima.png"))); // NOI18N
        btmClima.setBorder(null);
        btmClima.setBorderPainted(false);
        btmClima.setFocusable(false);

        btmGestionUser.setBackground(new java.awt.Color(255, 255, 255));
        btmGestionUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        btmGestionUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btmGestionUser.setBorderPainted(false);
        btmGestionUser.setFocusable(false);

        btmGestionAbejas1.setBackground(new java.awt.Color(255, 255, 255));
        btmGestionAbejas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ciencia.png"))); // NOI18N
        btmGestionAbejas1.setBorder(null);
        btmGestionAbejas1.setFocusable(false);

        btnSalir.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnSalir.setText("Salir");

        lblTituloA.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblTituloA.setText("Abejas");

        lblTituloP.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblTituloP.setText("Produccion");

        lblTituloM.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblTituloM.setText("Mantenimiento");

        lblTituloCl.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblTituloCl.setText("Clima");

        lblTituloE.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblTituloE.setText("Empleado");

        lblTituloA1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblTituloA1.setText("Investigación");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btmGestionAbejas)
                        .addGap(40, 40, 40)
                        .addComponent(btmProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btmMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btmClima, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btmGestionUser, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblTituloA1))
                            .addComponent(btmGestionAbejas1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lblTituloE)
                        .addGap(115, 115, 115))))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(lblTituloA)
                    .addGap(111, 111, 111)
                    .addComponent(lblTituloP)
                    .addGap(80, 80, 80)
                    .addComponent(lblTituloM)
                    .addGap(97, 97, 97)
                    .addComponent(lblTituloCl)
                    .addContainerGap(315, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btmGestionUser, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmClima, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmGestionAbejas)
                    .addComponent(btmProduccion)
                    .addComponent(btmMantenimiento))
                .addGap(26, 26, 26)
                .addComponent(lblTituloE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btmGestionAbejas1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTituloA1)))
                .addGap(41, 41, 41))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(252, 252, 252)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTituloA)
                        .addComponent(lblTituloP)
                        .addComponent(lblTituloM)
                        .addComponent(lblTituloCl))
                    .addContainerGap(253, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1000, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    public void setControlador(ControladorPrincipal controlador) {
        this.controlador = controlador;
        this.btnSalir.addActionListener(controlador);
        this.btmGestionAbejas.addActionListener(controlador);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btmClima;
    public javax.swing.JButton btmGestionAbejas;
    public javax.swing.JButton btmGestionAbejas1;
    public javax.swing.JButton btmGestionUser;
    public javax.swing.JButton btmMantenimiento;
    public javax.swing.JButton btmProduccion;
    public javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JLabel labCargoLogin;
    public javax.swing.JLabel labNombreEmpleadoLogin;
    public javax.swing.JLabel lblCargoEmpleado;
    private javax.swing.JLabel lblTituloA;
    private javax.swing.JLabel lblTituloA1;
    private javax.swing.JLabel lblTituloCl;
    private javax.swing.JLabel lblTituloE;
    private javax.swing.JLabel lblTituloM;
    private javax.swing.JLabel lblTituloP;
    public javax.swing.JLabel lblUsuarioEmpleado;
    // End of variables declaration//GEN-END:variables
}
