/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad.Vistas;

import Universidad.Control.MateriaData;
import Universidad.Control.AlumnoData;
import Universidad.Control.InscripcionData;
import Universidad.Modelo.*;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Mauri
 */
public class VistaInscripcion extends javax.swing.JInternalFrame {
    private AlumnoData ad;
    private MateriaData md;
    private InscripcionData insDat;
    /**
     * Creates new form VistaInscripcion
     */
    public VistaInscripcion(AlumnoData ad,MateriaData md,InscripcionData insDat) {
        initComponents();
        this.ad = ad;
        this.md = md;
        this.insDat = insDat;
        Iterator<Alumno> it = ad.obtenerAlumnos().iterator();
        Iterator<Materia> it2 = md.obtenerMaterias().iterator();
        jComboBoxAlumnos.addItem(null);
        jComboBoxMateria.addItem(null);
        while(it.hasNext()){
            Alumno a1 = it.next();
            if(a1.isActivo()){
                jComboBoxAlumnos.addItem(a1);
            }
        }
        while(it2.hasNext()){
            Materia m1 = it2.next();
            if(m1.isActivo()){
                jComboBoxMateria.addItem(m1);
            }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxAlumnos = new javax.swing.JComboBox<>();
        jComboBoxMateria = new javax.swing.JComboBox<>();
        jButtonSalir = new javax.swing.JButton();
        jButtonVerificar = new javax.swing.JButton();
        jButtonInscripcion = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE DE LA VISTA");

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel1.setText("Seleccione un alumno ");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel2.setText("Seleccione una materia ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inscripción");

        jComboBoxAlumnos.setBackground(new java.awt.Color(0, 51, 255));
        jComboBoxAlumnos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jComboBoxAlumnos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBoxMateria.setBackground(new java.awt.Color(0, 51, 255));
        jComboBoxMateria.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jComboBoxMateria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonSalir.setBackground(new java.awt.Color(204, 0, 51));
        jButtonSalir.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonVerificar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonVerificar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonVerificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerificar.setText("Verificar");
        jButtonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarActionPerformed(evt);
            }
        });

        jButtonInscripcion.setBackground(new java.awt.Color(0, 153, 51));
        jButtonInscripcion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonInscripcion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInscripcion.setText("Inscribir");
        jButtonInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInscripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jButtonVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonInscripcion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir)
                    .addComponent(jButtonVerificar)
                    .addComponent(jButtonInscripcion))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarActionPerformed
        // TODO add your handling code here:
        Alumno a1 = (Alumno)jComboBoxAlumnos.getSelectedItem();
        Materia m1 = (Materia)jComboBoxMateria.getSelectedItem();
        boolean ok = false;
        
        if(a1!=null && m1!=null){
            List<Materia> lm = insDat.obtenerMateriasInscriptas((a1.getIdAlumno()));
            for(Materia m:lm){
                System.out.print(m.getIdMateria()+" ");
                System.out.println(m1.getIdMateria());
                if(m.getIdMateria() == m1.getIdMateria()){
                    ok=true;
                }
            }
        System.out.println(ok);
        if(!ok)
            jButtonInscripcion.setEnabled(true);
        else{
            JOptionPane.showMessageDialog(this,"No es posible, alumno ya se encuentra inscripto a la materia");
            jButtonInscripcion.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonVerificarActionPerformed

    private void jButtonInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInscripcionActionPerformed
        // TODO add your handling code here:
        Alumno a1 = (Alumno)jComboBoxAlumnos.getSelectedItem();
        Materia m1 = (Materia)jComboBoxMateria.getSelectedItem();
        Inscripcion ins1 = new Inscripcion(m1, a1);
        insDat.guardarCursada(ins1);
        jButtonInscripcion.setEnabled(false);
    }//GEN-LAST:event_jButtonInscripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonInscripcion;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVerificar;
    private javax.swing.JComboBox<Alumno> jComboBoxAlumnos;
    private javax.swing.JComboBox<Materia> jComboBoxMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
