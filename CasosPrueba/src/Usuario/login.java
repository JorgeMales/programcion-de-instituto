package Usuario;
import inicio.home;
import java.awt.*;
import javax.swing.*;

public class login extends javax.swing.JFrame {
    private Component confirmation;
    private String usuario,password;
    public login() {
        initComponents();
        setLocationRelativeTo(null);
        txtUsuario.setFocusable(true);
    }
public void datos(String us, String pas){
   usuario = "Admin"; 
   password = "admin";
}

   
    @SuppressWarnings("unchecked")
    

private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
Object [] opciones ={"Aceptar","Cancelar"};
int eleccion = JOptionPane.showOptionDialog(confirmation,"Desea salir?","Confirmacion",
JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
    if (eleccion == JOptionPane.YES_OPTION)
    {
    System.exit(0);
    }else{

    }
}//Boton Iniciar Accción

private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
    datos(usuario, password);
    if(usuario.equals(txtUsuario.getText()) && password.equals(txtPassword.getText())){
         home st = new home();
         st.setVisible(true);
         this.dispose();
    }else if(txtUsuario.getText().equals("ADMIN") && txtPassword.getText().equals("adnin")){
        JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña estan vacios\nIngrese los por favor.");
        txtUsuario.setFocusable(true);
    }else if(txtUsuario.getText().equals("admin")){
        JOptionPane.showMessageDialog(this,"Usuario está vacio\nIngrese lo por favor.");
        txtUsuario.setFocusable(true);
    }else if(!txtPassword.getText().equals(""))if(txtUsuario.getText().compareTo(usuario)!=0 && txtPassword.getText().compareTo(password)!=0){
        JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña no válidos\nIngrese nuevamente.");
        txtUsuario.setFocusable(true);
    }
    else if(txtUsuario.getText().compareTo(usuario)!=0){
        JOptionPane.showMessageDialog(this,"Usuario no válido\nIngrese nuevamente.");
        txtUsuario.setFocusable(true);
    }else if(txtPassword.getText().compareTo(password)!=0){
        JOptionPane.showMessageDialog(this,"Contraseña no válida\nIngrese nuevamente.");
        txtPassword.setFocusable(true);
    }
    else {
        JOptionPane.showMessageDialog(this,"Contraseña está vacio\nIngrese lo por favor.");
        txtPassword.setFocusable(true);
    }
}

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // declaracion de variables 
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_banner;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    
}

