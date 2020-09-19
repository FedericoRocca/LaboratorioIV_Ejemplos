package ejemplo1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JProgressBar;

public class Ventana extends JFrame
{
    
    private JPanel contentPane;

    public Ventana()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 424, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.RED);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        
        JButton btnNewButton = new JButton("New button");
        contentPane.add(btnNewButton, BorderLayout.NORTH);
        
        JButton btnNewButton_1 = new JButton("New button");
        contentPane.add(btnNewButton_1, BorderLayout.WEST);
        
        JButton btnNewButton_2 = new JButton("New button");
        contentPane.add(btnNewButton_2, BorderLayout.EAST);
        
        JButton btnNewButton_3 = new JButton("New button");
        contentPane.add(btnNewButton_3, BorderLayout.SOUTH);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JButton btnNewButton_6 = new JButton("New button");
        panel.add(btnNewButton_6);
        
        JButton btnNewButton_5 = new JButton("New button");
        panel.add(btnNewButton_5);
        
        JButton btnNewButton_4 = new JButton("New button");
        panel.add(btnNewButton_4);
        
        JProgressBar progressBar = new JProgressBar();
        panel.add(progressBar);
    }
    
}
