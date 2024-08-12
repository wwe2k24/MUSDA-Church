/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.musda.church;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author romanreigns
 */
@SuppressWarnings("serial")
public class Home extends JFrame implements ActionListener {
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5, pa, pb ,pb1,pb2;
    private JTextField j1;
    private JLabel k;
    private JButton b1;
    
    Home(){
        setBounds(100,100,600,600);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);
        setLayout(new GridLayout(2,3));
        
        pa = new JPanel();
        pa.setLayout(new GridLayout());
        
        pb = new JPanel();
        pb.setBackground(Color.cyan);
        pb.setLayout(new GridLayout());
        
        pb1 = new JPanel();
        pb1.setBackground(Color.black);
        pb2 = new JPanel();
        pb2.setBackground(Color.orange);
        
        pb.add(pb1);
        pb.add(pb2);
        
        add(pb);
        add(pa);
        
        p1 = new JPanel();
        p1.setBackground(Color.black);
        p1.add(new JLabel("<html><font size = 5>Zipporah Samuel (<font color = aqua><i>Bestie</i></font>)</html>"));
        Icon icon1 = new ImageIcon("/home/romanreigns/Pictures/Friends/Zippy.jpg");
        p1.add(new JLabel(icon1));
        pa.add(p1,BorderLayout.NORTH);
        
        p2 = new JPanel();
        p2.setBackground(Color.black);
        p2.add(new JLabel("<html><font size = 5>Wendy Achieng' (<font color = fuchsia><i>Sis</i></font>)</html>"));
        Icon icon2 = new ImageIcon("/home/romanreigns/Pictures/Friends/IMG-20240701-WA0039.jpg");
        p2.add(new JLabel(icon2));
        pa.add(p2,BorderLayout.SOUTH);
        
        p3 = new JPanel();
        p3.setBackground(Color.black);
        p3.add(new JLabel("<html><font size = 5>Lynda Matini (<font color = orange><i>Mom</i></font>)</font></html>"));
        Icon icon3 = new ImageIcon("/home/romanreigns/Pictures/Friends/Lynda 1.jpg");
        p3.add(new JLabel(icon3));
        pa.add(p3,BorderLayout.WEST);
        
        p4 = new JPanel();
        p4.setBackground(Color.black);
        p4.add(new JLabel("<html><font size = 5>Daniel Mogoba (<font color = yellow><i>Bro</i></font>)</font></html>"));
        Icon icon4 = new ImageIcon("/home/romanreigns/Pictures/WhatsApp Image 2024-04-27 at 22.37.50 (1).jpeg");
        p4.add(new JLabel(icon4));
        pa.add(p4,BorderLayout.EAST);
        
        p5 = new JPanel();
        p5.setBackground(Color.orange);
        //add(p5,BorderLayout.CENTER);
    }
    public static void home() {
        JFrame m = new Home();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
