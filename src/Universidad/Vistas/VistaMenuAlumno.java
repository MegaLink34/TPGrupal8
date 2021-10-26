/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Universidad.Vistas;

import Universidad.Control.*;
import Universidad.Modelo.Usuario;

/**
 *
 * @author Agostina
 */
public class VistaMenuAlumno extends javax.swing.JInternalFrame {
    private Usuario user;
    private AlumnoData alumnoData;
    private MateriaData materiaData;
    private InscripcionData inscripcionData;
    private UsuarioData usuarioData;
    private MenuPrincipal menu;

    /**
     * Creates new form VistaMunuAlumno
     */
    public VistaMenuAlumno(MenuPrincipal menu, Usuario user, AlumnoData alumnoData, MateriaData materiaData, InscripcionData inscripcionData, UsuarioData usuarioData) {
        initComponents();
        
        this.user = user;
        this.alumnoData = alumnoData;
        this.materiaData = materiaData;
        this.inscripcionData = inscripcionData;
        this.usuarioData = usuarioData;
        this.menu = menu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonInscribirseAMateria = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonSalir1 = new javax.swing.JButton();

        jButtonSalir.setBackground(new java.awt.Color(204, 0, 51));
        jButtonSalir.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");

        setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido Alumno");

        jButtonInscribirseAMateria.setBackground(new java.awt.Color(153, 153, 153));
        jButtonInscribirseAMateria.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonInscribirseAMateria.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInscribirseAMateria.setText("Inscribirse a una materia");
        jButtonInscribirseAMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInscribirseAMateriaActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Darse de baja en una materia");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButtonSalir1.setBackground(new java.awt.Color(204, 0, 51));
        jButtonSalir1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonSalir1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir1.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButtonInscribirseAMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jButtonSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButtonInscribirseAMateria)
                .addGap(38, 38, 38)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(jButtonSalir1)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInscribirseAMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInscribirseAMateriaActionPerformed
        // TODO add your handling code here:
        menu.verInscripcionAlumno();

    }//GEN-LAST:event_jButtonInscribirseAMateriaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonInscribirseAMateria;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
