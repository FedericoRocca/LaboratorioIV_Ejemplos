package ejemplo1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main
{
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLocation(350, 350);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle("Titulo de la ventana");
        
        JButton btn = new JButton();
        btn.setText("Texto");
        btn.setBounds(10, 10, 140, 30);
        // Layout nulo, trabaja con X e Y (En pixeles)
        frame.setLayout(null);
        frame.getContentPane().add(btn);
        frame.setVisible(true);
    }
    
}
