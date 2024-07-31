package inicio;
import java.awt.*;
import javax.swing.*;

	public class home extends JFrame {
	    
	    public home() {
	        initComponents();
	        setLocationRelativeTo(null);
	    }
	    
	    private void initComponents() {
	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Home");

	        JLabel lblWelcome = new JLabel("Bienvenido al sistema");
	        lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
	        lblWelcome.setFont(new Font("Arial", Font.BOLD, 24));
	        
	        getContentPane().add(lblWelcome, BorderLayout.CENTER);
	        
	        setSize(400, 300); // Ajustar el tamaño de la ventana
	    }
	    
	    public static void main(String args[]) {
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new home().setVisible(true);
	            }
	        });
	    }

}


