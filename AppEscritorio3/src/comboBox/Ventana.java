package comboBox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame
{
    
    private JPanel contentPane;
    private JComboBox<String> cbxLocalidades;
    private JButton btnAceptar;
    
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

    public Ventana()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 403, 77);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        cbxLocalidades = new JComboBox<String>();
        cbxLocalidades.setBounds(10, 11, 164, 20);
        cbxLocalidades.addItem("Tigre");
        cbxLocalidades.addItem("San fernando");
        cbxLocalidades.addItem("San miguel");
        
        contentPane.add(cbxLocalidades);
        
        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "Se seleccionó: " + cbxLocalidades.getSelectedItem());
            }
        });
        btnAceptar.setBounds(184, 10, 89, 23);
        contentPane.add(btnAceptar);
    }
}
