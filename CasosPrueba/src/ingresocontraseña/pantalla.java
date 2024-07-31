package ingresocontraseña;
 
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class pantalla extends JFrame {
 
    private JPanel contentPane;
    private JTextField txtusu;
    private JPasswordField txtcontra;
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    pantalla frame = new pantalla();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the frame.
     */
    public pantalla() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 275, 195);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
 
        JLabel lblNewLabel = new JLabel("LOGIN");
        lblNewLabel.setBounds(150, 11, 83, 14);
        contentPane.add(lblNewLabel);
 
        JLabel lblNewLabel_1 = new JLabel("Usuario:");
        lblNewLabel_1.setBounds(10, 50, 60, 14);
        contentPane.add(lblNewLabel_1);
 
        JLabel lblNewLabel_2 = new JLabel("Contraseña:");
        lblNewLabel_2.setBounds(10, 75, 70, 14);
        contentPane.add(lblNewLabel_2);
 
        txtusu = new JTextField();
        txtusu.setBounds(126, 47, 86, 20);
        contentPane.add(txtusu);
        txtusu.setColumns(10);
 
        txtcontra = new JPasswordField();
        txtcontra.setBounds(126, 72, 86, 20);
        contentPane.add(txtcontra);
        txtcontra.setColumns(10);
 
        JButton btnNewButton = new JButton("Ingresar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String us = txtusu.getText();
                String con = new String(txtcontra.getPassword());
                if (us.equals("Admin") && con.equals("Admin")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido al Sistema");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Error de Ingreso al sistema");
                    System.out.println("usuario: " + us);
                    System.out.println("contraseña: " + con);
                }
            }
        });
        btnNewButton.setBounds(123, 101, 89, 23);
        contentPane.add(btnNewButton);
    }
}