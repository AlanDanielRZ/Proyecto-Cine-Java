package proyectocinemagic;

import javax.swing.*;
import java.sql.*;

public class Empleados extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet tabla;
    int sw = 0;
    String sql = "", query="", nulo="";
    
    public Empleados() {
        initComponents();
        Conexion myconexion = new Conexion();
        con = myconexion.obtenConexion();
        this.setTitle("EMPLEADOS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn4 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        btn5 = new javax.swing.JButton();
        txt2 = new javax.swing.JTextField();
        btn6 = new javax.swing.JButton();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btn8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btn9 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btn10 = new javax.swing.JButton();
        txt11 = new javax.swing.JTextField();
        btn11 = new javax.swing.JButton();
        txt12 = new javax.swing.JTextField();
        btn12 = new javax.swing.JButton();
        txt13 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt15 = new javax.swing.JTextField();
        txt16 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jLabel2.setText("Nombre");

        jLabel5.setText("Ap. Paerno");

        jLabel6.setText("Ap. Materno");

        btn1.setText("Nuevo");

        jLabel7.setText("Dirección");

        btn2.setText("Grabar");

        jLabel8.setText("Fecha Nacimiento");

        btn3.setText("Modificar");

        jLabel9.setText("Sueldo");

        btn4.setText("Consultar");

        btn5.setText("Borrar");

        btn6.setText("Salir");

        jLabel1.setText("Id_Profesor");

        jMenuItem4.setText("jMenuItem4");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        txt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt8ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre");

        txt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt9ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ap. Paterno");

        txt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt10ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ap. Materno");

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mas.png"))); // NOI18N
        btn7.setText("Nuevo");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha Nacimiento");

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grabar.png"))); // NOI18N
        btn8.setText("Grabar");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Telefono");

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modifica.png"))); // NOI18N
        btn9.setText("Modificar");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sueldo");

        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btn10.setText("Consultar");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        txt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt11ActionPerformed(evt);
            }
        });

        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        btn11.setText("Borrar");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        txt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt12ActionPerformed(evt);
            }
        });

        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btn12.setText("Salir");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        txt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt13ActionPerformed(evt);
            }
        });

        txt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt14ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Id Empleado");

        jLabel17.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Empleados");

        jLabel18.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Id Puesto");

        txt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt15ActionPerformed(evt);
            }
        });

        txt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn8)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel18)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn10)
                    .addComponent(btn11)
                    .addComponent(btn12))
                .addGap(24, 24, 24))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gear.png"))); // NOI18N
        jMenu1.setText("Opciones");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jMenuItem5.setText("Volver al Menú");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/job.png"))); // NOI18N
        jMenuItem2.setText("Cerrar Sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ayuda.png"))); // NOI18N
        jMenu2.setText("Ayuda");

        jMenuItem3.setText("Ayuda (F1)");
        jMenu2.add(jMenuItem3);

        jMenuItem6.setText("Acerca de...");
        jMenu2.add(jMenuItem6);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt8ActionPerformed
        if (txt8.getText().equals("")){
            JOptionPane.showMessageDialog(null,"** La FEcha de Nacimiento es Obligatoria **");
        }else
        {
            txt9.requestFocusInWindow();
        }
    }//GEN-LAST:event_txt8ActionPerformed

    private void txt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt9ActionPerformed
        if (txt9.getText().equals("")){
            JOptionPane.showMessageDialog(null,"** El teléfono es Obligatoria **");
        }else
        {
            txt10.requestFocusInWindow();
        }
    }//GEN-LAST:event_txt9ActionPerformed

    private void txt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt10ActionPerformed
        if (txt10.getText().equals("")){
            JOptionPane.showMessageDialog(null,"** El Sueldo es Obligatorio **");
        }else
        {
            txt15.requestFocusInWindow();
        }
    }//GEN-LAST:event_txt10ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        //JOptionPane.showMessageDialog(null,"estoy en boton 1");
        nuevo();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        //JOptionPane.showMessageDialog(null,"estoy en boton 2");
        grabar();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        //JOptionPane.showMessageDialog(null,"estoy en boton 3");
        modificar();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        //JOptionPane.showMessageDialog(null,"estoy en boton 4");
        consultar();
    }//GEN-LAST:event_btn10ActionPerformed

    private void txt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt11ActionPerformed
        if (txt11.getText().equals("")){
            JOptionPane.showMessageDialog(null,"** El Id del Empleado es Obligatorio **");
        }else
        {
            txt12.requestFocusInWindow();
        }
    }//GEN-LAST:event_txt11ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        //JOptionPane.showMessageDialog(null,"estoy en boton 5");
        borrar();
    }//GEN-LAST:event_btn11ActionPerformed

    private void txt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt12ActionPerformed
        if (txt12.getText().equals("")){
            JOptionPane.showMessageDialog(null,"** El Nombre es Obligatorio **");
        }else
        {
            txt13.requestFocusInWindow();
        }
    }//GEN-LAST:event_txt12ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed

        salir();
    }//GEN-LAST:event_btn12ActionPerformed

    private void txt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt13ActionPerformed
        if (txt13.getText().equals("")){
            JOptionPane.showMessageDialog(null,"** El Apellido Paterno es Obligatorio **");
        }else
        {
            txt14.requestFocusInWindow();
        }
    }//GEN-LAST:event_txt13ActionPerformed

    private void txt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt14ActionPerformed
        if (txt14.getText().equals("")){
            JOptionPane.showMessageDialog(null,"** El Apellido Materno es Obligatorio **");
        }else
        {
            txt8.requestFocusInWindow();
        }
    }//GEN-LAST:event_txt14ActionPerformed

    private void txt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt15ActionPerformed
        if (txt15.getText().equals("")){
            JOptionPane.showMessageDialog(null,"** El Id de Puesto es Obligatorio **");
        }else
        {
            sw=0;
        try{
            sql = "select*from puestos where idpuesto=";
            sql += "\""+ txt15.getText()+"\"";
            stmt = con.prepareStatement(sql);
            tabla = stmt.executeQuery();
            while(tabla.next()){
            txt16.setText(tabla.getString(2));
            sw = 1;
            }
        }catch(SQLException e){JOptionPane.showMessageDialog(null, e.getMessage());}
            if(sw ==0){JOptionPane.showMessageDialog(null, "*** Registro No Existe ***");
            nuevo();
            }
            btn8.requestFocusInWindow();
        }
    }//GEN-LAST:event_txt15ActionPerformed

    private void txt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt16ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        salir();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       cerrarsesion();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        regresar();
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    
    public void nuevo(){
        txt11.setText("");
        txt12.setText("");
        txt13.setText("");
        txt14.setText("");
        txt8.setText("");
        txt9.setText("");
        txt10.setText("");
        txt15.setText("");
        txt16.setText("");
        txt11.requestFocusInWindow();
    }
    public void grabar(){
        try{
            sql = "insert into empleados values(";
            sql += "\""+ txt11.getText()+"\",";
            sql += "\""+ txt12.getText()+"\",";
            sql += "\""+ txt13.getText()+"\",";
            sql += "\""+ txt14.getText()+"\",";
            sql += "\""+ txt8.getText()+"\",";
            sql += "\""+ txt9.getText()+"\",";
            sql += "\""+ txt10.getText()+"\",";
            sql += "\""+ txt15.getText()+"\")";
            stmt = con.prepareStatement(sql);
            
            int sw = stmt.executeUpdate();
            if(sw !=0){JOptionPane.showMessageDialog(null, "*** Registro Insertado con Exito ***");
            nuevo();
            }
        }catch(SQLException e){JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }
    public void modificar(){
        try{
            sql = "update empleados set ";
            sql += "nombre=\""+ txt12.getText()+"\",";
            sql += "appat=\""+ txt13.getText()+"\",";
            sql += "apmat=\""+ txt14.getText()+"\",";
            sql += "fecnac=\""+ txt8.getText()+"\",";
            sql += "telefono=\""+ txt9.getText()+"\",";
            sql += "sueldo=\""+ txt10.getText()+"\",";
            sql += "idpuesto=\""+ txt15.getText()+"\"";
            sql += "where idempleado=\""+ txt11.getText()+"\"";
            stmt = con.prepareStatement(sql);
            
            int sw = stmt.executeUpdate();
            if(sw !=0){JOptionPane.showMessageDialog(null, "*** Registro Modificado con Exito ***");
            nuevo();
            }
        }catch(SQLException e){JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }
    public void consultar(){
        sw=0;
        try{
            sql = "select*from empleados where idempleado=";
            sql += "\""+ txt11.getText()+"\"";
            stmt = con.prepareStatement(sql);
            tabla = stmt.executeQuery();
            while(
            tabla.next()){
            txt12.setText(tabla.getString(2));
            txt13.setText(tabla.getString(3));
            txt14.setText(tabla.getString(4));
            txt8.setText(tabla.getString(5));
            txt9.setText(tabla.getString(6));
            txt10.setText(tabla.getString(7));
            txt15.setText(tabla.getString(8));
            sw = 1;
            }
        }catch(SQLException e){JOptionPane.showMessageDialog(null, e.getMessage());
        }
            if(sw ==0){JOptionPane.showMessageDialog(null, "*** Registro No Existe ***");
            nuevo();
            }
            
            sw=0;
        try{
            sql = "select*from puestos where idpuesto=";
            sql += "\""+ txt15.getText()+"\"";
            stmt = con.prepareStatement(sql);
            tabla = stmt.executeQuery();
            while(tabla.next()){
            txt16.setText(tabla.getString(2));
            sw = 1;
            }
        }catch(SQLException e){JOptionPane.showMessageDialog(null, e.getMessage());}
            if(sw ==0){JOptionPane.showMessageDialog(null, "*** Registro No Existe ***");
            nuevo();
            }
    }
    public void borrar(){
        try{
        sql = "delete from empleados ";
            sql += "where idempleado=\""+ txt11.getText()+"\"";
            stmt = con.prepareStatement(sql);
            
            int sw = stmt.executeUpdate();
            if(sw !=0){JOptionPane.showMessageDialog(null, "*** Registro Eliminado con Exito ***");
            nuevo();
            }
        }catch(SQLException e){JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void salir(){
        sw = 0;
        sw = JOptionPane.showConfirmDialog(null, "¿En verdad deseas salir?");
        if(sw == 0){
            System.exit(0);
        }
    }
    public void cerrarsesion(){
        this.dispose();
        Login mylogin = new Login();
        mylogin.setVisible(true);
    }
    
    public void regresar(){ 
        this.dispose();
        MenuPrincipal mymenu = new MenuPrincipal();
        mymenu.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
