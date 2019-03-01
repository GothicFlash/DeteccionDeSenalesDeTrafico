/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Conexion;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.opencv.core.Core;

/**
 *
 * @author usuario
 */
public class FrmInicioS extends javax.swing.JFrame {
    private Conexion conect;
    /**
     * Creates new form FrmInicioSesion
     */
    public FrmInicioS() {
        initComponents();
        String line1 = "<html><u>¿Has olvidado tu contraseña?</u></html>";
        String line2 = "<html><u>Registrar</u></html>";
        lblRecuperar.setText(line1);
        lblRegistrar.setText(line2);
        setLocationRelativeTo(null);
    }
    
    private boolean datosCompletos(){
        if(!txtUsuario.getText().isEmpty() && !txtContraseña.getText().isEmpty())
            return true;
        return false;
    }
    
    public void cerrarConexion(){ //Función para cerrar la conexión con la base de datos
        if (conect != null) {
            try {
                conect.Conexion().close();
            } catch ( SQLException e ) { 
                System.out.println( e.getMessage());
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

        jButton1 = new javax.swing.JButton();
        lblIconUsuario = new javax.swing.JLabel();
        lblIconPass = new javax.swing.JLabel();
        lblRegistrar = new javax.swing.JLabel();
        lblRecuperar = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnIniciarS = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Info.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 720, 40, 40));

        lblIconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoPass.png"))); // NOI18N
        getContentPane().add(lblIconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 30, 30));

        lblIconPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoUsuario.png"))); // NOI18N
        getContentPane().add(lblIconPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 30, 30));

        lblRegistrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRegistrar.setForeground(new java.awt.Color(51, 51, 255));
        lblRegistrar.setText("Registrarse");
        lblRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseClicked(evt);
            }
        });
        getContentPane().add(lblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 680, 90, 30));

        lblRecuperar.setBackground(new java.awt.Color(102, 0, 204));
        lblRecuperar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRecuperar.setForeground(new java.awt.Color(255, 51, 51));
        lblRecuperar.setText("¿Has olvidado tu contraseña?");
        lblRecuperar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRecuperar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRecuperarMouseClicked(evt);
            }
        });
        getContentPane().add(lblRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 650, 240, 30));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 730, 360));

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoApp.png"))); // NOI18N
        getContentPane().add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 100));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 310, 40));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 310, 40));

        btnIniciarS.setBackground(new java.awt.Color(51, 0, 204));
        btnIniciarS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIniciarS.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarS.setText("Iniciar Sesión");
        btnIniciarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarS.setOpaque(false);
        btnIniciarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSMouseClicked(evt);
            }
        });
        getContentPane().add(btnIniciarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 350, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 769));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSMouseClicked
        // TODO add your handling code here:
        conect = new Conexion();
        
       if(datosCompletos()){
           String tipo = conect.acceder(txtUsuario.getText(), txtContraseña.getText());
            if(tipo!=null){
                if(tipo.compareTo("usuario")==0){
                    FrmUsuario frmU = new FrmUsuario(txtUsuario.getText());
                    frmU.setVisible(true);
                    dispose();
                }else{
                    FrmAdmin frmA = new FrmAdmin(txtUsuario.getText());
                    frmA.setVisible(true);
                    dispose();
                }
            }
       }else{
           JOptionPane.showMessageDialog(null,"Debes llenar primero todos los campos","Datos incompletos",JOptionPane.ERROR_MESSAGE);
       }
        
       cerrarConexion();
    }//GEN-LAST:event_btnIniciarSMouseClicked

    private void lblRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseClicked
        // TODO add your handling code here:
        FrmRegistro frmReg = new FrmRegistro();
        frmReg.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblRegistrarMouseClicked

    private void lblRecuperarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecuperarMouseClicked
        // TODO add your handling code here:
        conect = new Conexion();
        try {
            JFrame frame = new JFrame("InputDialog");
            String email = JOptionPane.showInputDialog(frame, "Ingresa el correo electronico: ");
            if(email.isEmpty() || email==null){
                JOptionPane.showMessageDialog(null,"Debes ingresar un correo electronico valido","Campo vacio",JOptionPane.ERROR_MESSAGE);
            }else{
                String password = conect.buscarContraseña(email);
                if(password != null){
                    try {
                        Properties props = new Properties();
                        props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");
                        props.setProperty("mail.smtp.starttls.enable", "true");
                        props.setProperty("mail.smtp.port", "587");
                        props.setProperty("mail.smtp.auth", "true");

                        Session session = Session.getDefaultInstance(props);

                        String correoRemitente = "soporte.dst.upemor@gmail.com";
                        String passwordRemitente = "upemordst";
                        String correoReceptor = email;
                        String asunto = "Recuperación de contraseña";
                        String mensaje = "Tu contraseña es: "+password;

                        MimeMessage message = new MimeMessage(session);
                        message.setFrom(new InternetAddress(correoRemitente));

                        message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
                        message.setSubject(asunto);
                        message.setText(mensaje);

                        Transport t = session.getTransport("smtp");
                        t.connect(correoRemitente, passwordRemitente);
                        t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));

                        t.close();

                        JOptionPane.showMessageDialog(null,"La contraseña ha sido enviada al correo ingresado","Recuperacion exitosa",JOptionPane.PLAIN_MESSAGE);
                    } catch (MessagingException ex) {
                        Logger.getLogger(FrmInicioS.class.getName()).log(Level.SEVERE, null, ex);
                    }  
                }
            }
        }catch (Exception e) {
            System.out.println("");
        }
    }//GEN-LAST:event_lblRecuperarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Sistema desarrollado por: \n\nEliacim Nolasco Ortiz\nEsteban Esquivel Martínez\n\nCarrera: Ingeniería en informática\n\nConcepto: Servicio social\n\nProfesor: Roberto Enrique López Díaz");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInicioS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicioS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicioS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicioS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME); //Linea necesaria para las librerias Mat
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicioS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIconPass;
    private javax.swing.JLabel lblIconUsuario;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRecuperar;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}