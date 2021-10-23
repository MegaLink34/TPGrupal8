/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad.Vistas;

import Universidad.Modelo.Conexion;
import Universidad.Modelo.Usuario;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author EL MEGAS
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private static Usuario user = null;
    private Conexion conexion;

    /**
     * Creates new form MenuPrincipal
     */
    
    /* Inicié una vista de inicio en el constructor, ESTA A PRUEBA POR FUNCIONALIDAD.... FUNCIONAAAAAAAAAAAAAAA */
    public MenuPrincipal() {
        initComponents();
        
        try {
            conexion = new Conexion();
        
            this.iniciarSesion(user);
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo crear conexion");
        }
    }
    
    public MenuPrincipal(Usuario user) {
        initComponents();
        
        try {
            conexion = new Conexion();
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo crear conexion");
        }
        
        VistaMenuAlumno vistaMenuAlumno = new VistaMenuAlumno(user);
            
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaMenuAlumno);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaMenuAlumno);
        vistaMenuAlumno.setVisible(true);
    }
    
    public void agregarVentana(JInternalFrame subVentana) {
       
       this.jDesktopPane1.add(subVentana);
       
        subVentana.toFront();
        subVentana.setVisible(true);
    }
    
    public static void setIngreso(Usuario user){
        MenuPrincipal.user = user;
    }
    
    public Usuario getUser(){
        return MenuPrincipal.user;
    }
    
    public void sesionAlumno(Usuario usuario){
        VistaMenuAlumno vistaMenuAlumno = new VistaMenuAlumno(usuario);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaMenuAlumno);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaMenuAlumno);

        vistaMenuAlumno.setVisible(true);
    }
    
    public void sesionDocente(Usuario usuario){
        VistaMenuDocente vistaMenuDocente = new VistaMenuDocente(usuario);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaMenuDocente);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaMenuDocente);

        vistaMenuDocente.setVisible(true);
    }
    
    public void iniciarSesion(Usuario user){
        VistaInicio vistaInicio = new VistaInicio(conexion);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaInicio);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaInicio);

        vistaInicio.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemNA = new javax.swing.JMenuItem();
        jMenuItemBA = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemNM = new javax.swing.JMenuItem();
        jMenuItemBM = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemNI = new javax.swing.JMenuItem();
        jMenuItemBI = new javax.swing.JMenuItem();
        jMenuItemCS = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jMenu1.setText("Sesión");

        jMenu3.setText("Alumno");

        jMenuItemNA.setText("Nuevo alumno");
        jMenuItemNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNAActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemNA);

        jMenuItemBA.setText("Buscar Alumnos");
        jMenuItemBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBAActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemBA);

        jMenu1.add(jMenu3);

        jMenu4.setText("Materia");

        jMenuItemNM.setText("Nueva Materia");
        jMenuItemNM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNMActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemNM);

        jMenuItemBM.setText("Buscar Materias");
        jMenu4.add(jMenuItemBM);

        jMenu1.add(jMenu4);

        jMenu5.setText("Inscripción");

        jMenuItemNI.setText("Nueva Inscripción");
        jMenuItemNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNIActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemNI);

        jMenuItemBI.setText("Buscar Inscripciones");
        jMenu5.add(jMenuItemBI);

        jMenu1.add(jMenu5);

        jMenuItemCS.setText("Cambiar Sesión");
        jMenuItemCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCSActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCS);

        jMenuBar1.add(jMenu1);

        jMenuSalir.setText("Salir");
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNAActionPerformed
        // TODO add your handling code here:
        
        if (!"Admin".equals(user.getRolUsuario())){
            jMenuItemNA.setEnabled(true);
        }
    }//GEN-LAST:event_jMenuItemNAActionPerformed

    private void jMenuItemNMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNMActionPerformed
        // TODO add your handling code here:
        
        if (!"Admin".equals(user.getRolUsuario())){
            jMenuItemNM.setEnabled(true);
        }
    }//GEN-LAST:event_jMenuItemNMActionPerformed

    private void jMenuItemCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCSActionPerformed
        // TODO add your handling code here:
        
        user = null;
        
        this.iniciarSesion(user);
    }//GEN-LAST:event_jMenuItemCSActionPerformed

    private void jMenuItemBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemBAActionPerformed

    private void jMenuItemNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNIActionPerformed
        // TODO add your handling code here:
        if ("Alumno".equals(user.getRolUsuario())){
            jMenuItemNM.setEnabled(true);
        }
    }//GEN-LAST:event_jMenuItemNIActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemBA;
    private javax.swing.JMenuItem jMenuItemBI;
    private javax.swing.JMenuItem jMenuItemBM;
    private javax.swing.JMenuItem jMenuItemCS;
    private javax.swing.JMenuItem jMenuItemNA;
    private javax.swing.JMenuItem jMenuItemNI;
    private javax.swing.JMenuItem jMenuItemNM;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}
