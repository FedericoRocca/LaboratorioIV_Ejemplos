package ejemplo2;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ventana extends JFrame
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JButton btn = new JButton();
    JTextField txtNombre;
    
    public Ventana()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(350, 350);
        setTitle("Titulo de la ventana");
        setLayout(null);
        
        btn.setText("Texto");
        btn.setBounds(63, 73, 140, 30);
        txtNombre = new JTextField();
        txtNombre.setColumns(10);
        txtNombre.setBounds(63, 33, 200, 36);
        //Pasaje de control por constructor
        //btn.addActionListener(new eventobtn(txtNombre));
        
        //Pasaje de control por set
        eventobtn eventobtn = new eventobtn();
        eventobtn.setTextField(txtNombre);
        btn.addActionListener(eventobtn);

        getContentPane().add(btn);
        getContentPane().add(txtNombre);
    }
    
    public void setVisibility(Boolean state)
    {
        setVisible(state);
    }
    
}

class eventobtn implements ActionListener
{
    public JTextField getTextField()
    {
        return textField;
    }

    public void setTextField(JTextField textField)
    {
        this.textField = textField;
    }

    JTextField textField;

    public eventobtn(JTextField txtNombre)
    {
        textField = txtNombre;
    }
    
    public eventobtn()
    {
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Texto ingresado: " + textField.getText());
    }
    
}
