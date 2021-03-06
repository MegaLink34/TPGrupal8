/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad.Vistas;

import Universidad.Modelo.Conexion;
import Universidad.Control.*;
import Universidad.Modelo.Usuario;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class MenuPrincipal extends javax.swing.JFrame {
    private static Usuario user = null;
    private Conexion conexion;
    private AlumnoData alumnoData;
    private InscripcionData inscripcionData;
    private MateriaData materiaData;
    private UsuarioData usuarioData;
    
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
        alumnoData = new AlumnoData(conexion);
        inscripcionData = new InscripcionData(conexion);
        materiaData = new MateriaData(conexion);
        usuarioData = new UsuarioData(conexion);
    }
    
    public MenuPrincipal(Usuario user) {
        initComponents();
        
        try {
            conexion = new Conexion();
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo crear conexion");
        }
        
        VistaMenuAlumno vistaMenuAlumno = new VistaMenuAlumno(this, user, alumnoData, materiaData, inscripcionData, usuarioData);
            
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
    
    public void setIngreso(Usuario user){
        MenuPrincipal.user = user;
        switch(user.getRolUsuario()){
        
            case 1:
                System.out.println("Ingreso Admin exitoso");
                this.sesionAdmin(user);
                break;
            case 2:
                System.out.println("Ingreso Docente exitoso");
                this.sesionDocente(user);
                break;
            case 3:
                System.out.println("Ingreso Alumno exitoso");
                this.sesionAlumno(user);
                break;
        }
    }
    
    public Usuario getUser(){
        return MenuPrincipal.user;
    }
    public void sesionAdmin(Usuario usuario){
        VistaMenuAdmin vistaMenuAdmin = new VistaMenuAdmin(this, usuario);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaMenuAdmin);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaMenuAdmin);

        vistaMenuAdmin.setVisible(true);
    }
    
    public void sesionAlumno(Usuario usuario){
        VistaMenuAlumno vistaMenuAlumno = new VistaMenuAlumno(this, usuario, alumnoData, materiaData, inscripcionData, usuarioData);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaMenuAlumno);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaMenuAlumno);

        vistaMenuAlumno.setVisible(true);
    }
    
    public void verInscripcionAlumno(){
        VistaInscripcionAlumno vistaInscripcionAlumno = new VistaInscripcionAlumno(this, user, alumnoData, materiaData, inscripcionData, usuarioData);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaInscripcionAlumno);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaInscripcionAlumno);

        vistaInscripcionAlumno.setVisible(true);
    }
    
     public void verInscripcionBajaAlumno(){
        VistaInscripcionBajaAlumno vistaInscripcionBajaAlumno = new VistaInscripcionBajaAlumno(this, user, alumnoData, materiaData, inscripcionData, usuarioData);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaInscripcionBajaAlumno);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaInscripcionBajaAlumno);

        vistaInscripcionBajaAlumno.setVisible(true);
    }
     
     public void verInscriptosPorMateria(){
        VistaVerInscriptos vistaVerInscriptos = new VistaVerInscriptos(this, user, alumnoData, materiaData, inscripcionData, usuarioData);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaVerInscriptos);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaVerInscriptos);

        vistaVerInscriptos.setVisible(true);
     }
     
     public void verVerModNotas(){
        VistaVerModNotas vistaVerModNotas = new VistaVerModNotas(this, user, alumnoData, materiaData, inscripcionData, usuarioData);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaVerModNotas);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaVerModNotas);

        vistaVerModNotas.setVisible(true);
     }
     
     public void verVerModAlumno(){
        VistaVerModAlumno vistaVerModAlumno = new VistaVerModAlumno(this, user, alumnoData, materiaData, inscripcionData, usuarioData);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaVerModAlumno);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaVerModAlumno);

        vistaVerModAlumno.setVisible(true);
     }
     
     public void verBorrarUsuario(){
        VistaBorrarUsuario vistaBorrarUsuario = new VistaBorrarUsuario(this, user, usuarioData);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaBorrarUsuario);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaBorrarUsuario);

        vistaBorrarUsuario.setVisible(true);
     }
     
     public void verVistaVerModMateria(){
        VistaVerModMateria VistaVerModMateria = new VistaVerModMateria(this, user, usuarioData, materiaData);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(VistaVerModMateria);
        jDesktopPane.repaint();
        jDesktopPane.add(VistaVerModMateria);

        VistaVerModMateria.setVisible(true);
     }
     
     public void verVerModUsuario(){
        VistaVerModUsuario vistaVerModUsuario = new VistaVerModUsuario(this, user, usuarioData);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaVerModUsuario);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaVerModUsuario);

        vistaVerModUsuario.setVisible(true);
     }
     
     public void verVistaVerAlumnos(){
        VistaVerAlumnos VistaVerAlumnos = new VistaVerAlumnos(this, user, usuarioData, alumnoData);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(VistaVerAlumnos);
        jDesktopPane.repaint();
        jDesktopPane.add(VistaVerAlumnos);

        VistaVerAlumnos.setVisible(true);
     }
     
     public void verVistaVerMaterias(){
        VistaVerMaterias VistaVerMaterias = new VistaVerMaterias(this, user, usuarioData, materiaData);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(VistaVerMaterias);
        jDesktopPane.repaint();
        jDesktopPane.add(VistaVerMaterias);

        VistaVerMaterias.setVisible(true);
     }
     
     
    
    public void sesionDocente(Usuario usuario){
        VistaMenuDocente vistaMenuDocente = new VistaMenuDocente(this, user, alumnoData, materiaData, inscripcionData, usuarioData);
        jDesktopPane.removeAll();
        jDesktopPane.moveToFront(vistaMenuDocente);
        jDesktopPane.repaint();
        jDesktopPane.add(vistaMenuDocente);

        vistaMenuDocente.setVisible(true);
    }
    
    public void iniciarSesion(Usuario user){
        VistaInicio vistaInicio = new VistaInicio(conexion, this);
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuItemSesion = new javax.swing.JMenu();
        jMenuItemCambiarSesion = new javax.swing.JMenuItem();
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

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        jMenuItemSesion.setText("Sesión");
        jMenuItemSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSesionActionPerformed(evt);
            }
        });

        jMenuItemCambiarSesion.setText("Cambiar Sesión");
        jMenuItemCambiarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCambiarSesionActionPerformed(evt);
            }
        });
        jMenuItemSesion.add(jMenuItemCambiarSesion);

        jMenuBar1.add(jMenuItemSesion);

        jMenuSalir.setText("Salir");
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSesionActionPerformed

    private void jMenuItemCambiarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCambiarSesionActionPerformed
        // TODO add your handling code here:
        
        user = null;
        
        this.iniciarSesion(user);
    }//GEN-LAST:event_jMenuItemCambiarSesionActionPerformed

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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCambiarSesion;
    private javax.swing.JMenu jMenuItemSesion;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}