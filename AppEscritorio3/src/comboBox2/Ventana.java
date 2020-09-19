package comboBox2;

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
    private JComboBox<Categorias> cbxCategorias;
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
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        cbxCategorias = new JComboBox<Categorias>();
        cbxCategorias.setBounds(10, 11, 208, 20);
        cbxCategorias.addItem( new Categorias(1, "Limpieza") );
        cbxCategorias.addItem( new Categorias(2, "Bebida") );
        contentPane.add(cbxCategorias);
        
        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Categoría seleccionada: " + ((Categorias)cbxCategorias.getSelectedItem()).getNombre());
            }
        });
        btnAceptar.setBounds(224, 10, 89, 23);
        contentPane.add(btnAceptar);
    }
    
}
