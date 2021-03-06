/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad.Vistas;

import Universidad.Control.MateriaData;
import Universidad.Control.UsuarioData;
import Universidad.Modelo.Materia;
import Universidad.Modelo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauri
 */
public class VistaVerModMateria extends javax.swing.JInternalFrame {
    
    private Usuario user;
    private MateriaData md;
    private UsuarioData udat;
    private MenuPrincipal menu;
    /**
     * Creates new form VistaVerModMateria
     */
    
    public VistaVerModMateria(MenuPrincipal menu, Usuario user, UsuarioData uDat, MateriaData md){
        this.md = md;
        this.user = user;     
        this.udat = udat;
        this.menu = menu;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextIdMateria = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextAnio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxEstado = new javax.swing.JCheckBox();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButtonEditable = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AGREGAR ALUMNO");

        setClosable(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(640, 580));

        jTextIdMateria.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jTextIdMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdMateriaActionPerformed(evt);
            }
        });

        jTextNombre.setEditable(false);
        jTextNombre.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N

        jTextAnio.setEditable(false);
        jTextAnio.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel1.setText("ID de la Materia");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel3.setText("A??o al que pertenece");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        jLabel6.setText("* Busque para ver disponibilidad");

        jCheckBoxEstado.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jCheckBoxEstado.setText("Actualmente ACTIVA");
        jCheckBoxEstado.setEnabled(false);

        jButtonGuardar.setBackground(new java.awt.Color(0, 153, 51));
        jButtonGuardar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(204, 0, 51));
        jButtonSalir.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonLimpiar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonBuscar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("AGREGAR/MODIFICAR MATERIA");

        jButtonEditable.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jButtonEditable.setText("Habilitar edici??n");
        jButtonEditable.setEnabled(false);
        jButtonEditable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jTextIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBoxEstado))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addContainerGap(24, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonEditable)
                            .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jCheckBoxEstado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButtonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditable)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonSalir))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        menu.sesionDocente(user);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextIdMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdMateriaActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        int id = 0;
        try{
            id = Integer.valueOf(jTextIdMateria.getText());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"El campo ID solo admite caracteres num??ricos mayores a cero");
        }
        if(id>0){
            Materia m = new Materia();
            if(md.materiaExiste(id)){
                m = md.buscarMateria(id);
                jTextAnio.setText(m.getAnio()+"");
                jTextNombre.setText(m.getNombre());
                jButtonLimpiar.setEnabled(true);
                jButtonEditable.setEnabled(true);
                jTextNombre.setEditable(false);
                jTextAnio.setEditable(false);
                jCheckBoxEstado.setEnabled(false);
                if(m.isActivo())
                    jCheckBoxEstado.setSelected(true);
                JOptionPane.showMessageDialog(null, id + " , ya pertenece a una materia en el sistema, si desea puede editar la informaci??n");
            }else{
                JOptionPane.showMessageDialog(null, id + " , se encuentra disponible. Complete los campos");
                jButtonGuardar.setEnabled(true);
                jTextIdMateria.setEditable(false);
                jTextNombre.setEditable(true);
                jTextAnio.setEditable(true);
                jCheckBoxEstado.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        jTextNombre.setText("");
        jTextAnio.setText("");
        jTextIdMateria.setText("");
        jButtonLimpiar.setEnabled(true);
        jTextIdMateria.setEditable(true);
        jTextNombre.setEditable(false);
        jTextAnio.setEditable(false);
        jCheckBoxEstado.setEnabled(false);
        jButtonEditable.setEnabled(false);
        jButtonGuardar.setEnabled(false);
        jCheckBoxEstado.setSelected(false);
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonEditableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditableActionPerformed
        jTextIdMateria.setEditable(false);
        jButtonLimpiar.setEnabled(false);
        jTextNombre.setEditable(true);
        jTextAnio.setEditable(true);
        jCheckBoxEstado.setEnabled(true);
        jButtonGuardar.setEnabled(true);
    }//GEN-LAST:event_jButtonEditableActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        int id = 0, anio = 0;
        String nomb = "";
        boolean exc = false;
        Materia m = new Materia();
        try{    
            id = Integer.valueOf(jTextIdMateria.getText());
            anio = Integer.valueOf(jTextAnio.getText());
            nomb = jTextNombre.getText();
            if ("".equals(nomb) || anio<=0 || anio>5){
                exc = true;
                JOptionPane.showMessageDialog(null, "Ingrese un numero entre 1 y 5 para representar el a??o en que se cursa la materia");
            }
        }catch(Exception ex){
            exc = true;
        }
        if (!exc){
            if (md.materiaExiste(id)){
                m = md.buscarMateria(id);
                m.setNombre(nomb);
                m.setAnio(anio);
                if(jCheckBoxEstado.isSelected()!= m.isActivo())
                    md.modificarEstado(id);
                    md.actualizarMateria(m);
                    m = md.buscarMateria(id);
            }else{
                m.setNombre(nomb);
                m.setAnio(anio);
                m.setIdMateria(id);
                if(jCheckBoxEstado.isSelected())
                        m.setActivo(true);
                    else
                        m.setActivo(false);
                md.guardarMateria(m);
            }
            JOptionPane.showMessageDialog(null,"Materia guardada con ??xito");
        }else
            JOptionPane.showMessageDialog(null,"Alguno de los campos no cumple con el tipo de dato o se encuentra vacio.");
        jButtonLimpiarActionPerformed(evt);
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditable;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JCheckBox jCheckBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextAnio;
    private javax.swing.JTextField jTextIdMateria;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
