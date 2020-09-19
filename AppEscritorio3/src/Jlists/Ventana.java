package Jlists;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comboBox2.Categorias;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame
{
    
    private JPanel contentPane;
    private JTextField txtNombre;
    private JTextField txtID;
    private JList listCategorias;
    private DefaultListModel<Categorias> dlModel;
    
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
        setBounds(100, 100, 525, 377);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblId = new JLabel("ID");
        lblId.setBounds(10, 11, 46, 14);
        contentPane.add(lblId);
        
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(10, 36, 46, 14);
        contentPane.add(lblNombre);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(66, 33, 190, 20);
        contentPane.add(txtNombre);
        txtNombre.setColumns(10);
        
        txtID = new JTextField();
        txtID.setColumns(10);
        txtID.setBounds(66, 8, 190, 20);
        contentPane.add(txtID);
        
        listCategorias = new JList<Categorias>();
        listCategorias.setBounds(10, 99, 489, 228);
        contentPane.add(listCategorias);
        
        dlModel = new DefaultListModel<Categorias>();
        listCategorias.setModel(dlModel);
        
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Categorias cat = new Categorias(Integer.parseInt(txtID.getText()), txtNombre.getText());
                dlModel.addElement(cat);
            }
        });
        btnAceptar.setBounds(10, 65, 89, 23);
        contentPane.add(btnAceptar);
        
        
    }
}
