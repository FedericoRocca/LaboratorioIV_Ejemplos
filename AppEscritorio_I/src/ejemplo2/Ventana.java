package ejemplo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JButton btn = new JButton();
    
    public Ventana()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(350, 350);
        setTitle("Titulo de la ventana");
        setLayout(null);
        btn.setText("Texto");
        btn.setBounds(10, 10, 140, 30);
        btn.addActionListener(new eventobtn());
        
        getContentPane().add(btn);
    }
    
    public void setVisibility(Boolean state)
    {
        setVisible(state);
    }
    
}

class eventobtn implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("btn presionado");
    }
    
}
