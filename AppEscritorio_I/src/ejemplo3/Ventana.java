package ejemplo3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame
{
    
    private JPanel contentPane;
    private JTextField txtNombre;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    Ventana frame = new Ventana();
                    frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the frame.
     */
    public Ventana()
    {
        setTitle("Ventana 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblIngreseSuNombre = new JLabel("Ingrese su nombre");
        lblIngreseSuNombre.setBounds(10, 11, 95, 14);
        contentPane.add(lblIngreseSuNombre);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(115, 8, 116, 20);
        contentPane.add(txtNombre);
        txtNombre.setColumns(10);
        
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.out.println("Hola " + txtNombre.getText());
            }
        });
        btnAceptar.setBounds(115, 37, 89, 23);
        contentPane.add(btnAceptar);
    }
}
