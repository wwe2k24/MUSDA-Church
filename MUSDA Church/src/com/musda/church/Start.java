/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.musda.church;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author romanreigns
 */
@SuppressWarnings("serial")
public class Start extends JFrame implements ActionListener {
    
    
    private JButton login;
    private JButton quit;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JPanel p, pr ;
    private JPanel p1;
            
    Start(){
        
        setTitle(NewMain.title + "");
        setLocation(430,150);
        setSize(685,450);
        getContentPane().setBackground( new Color(3, 22, 65));
        setLayout(new GridLayout());
        
        setAlwaysOnTop(true);
        //setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(p = new JPanel());
        p.setBackground(new Color(3, 22, 65));
        add(pr = new JPanel());
        pr.setBackground(new Color(3, 22, 65));
        
        Icon icon1 = new ImageIcon("/home/romanreigns/Pictures/IMG_1722617422902.png");
        pr.add(new JLabel(icon1));
        pr.setLayout(new GridLayout(1,1));
        
        p.add(p1 = new JPanel());
        p1.setBackground(new Color(130,209,255, 255));
        p1.add(l1 = new JLabel("<html><font size = '7'><center>"
                + "<font ><i>MUSDA"
                + "<sub> Church</sub></i></font><font size = '4' color = green>CNC</font>"
                + "</font></center></html>"));
        l1.setForeground(new Color(0, 23, 65));
        
        JTabbedPane tp = new JTabbedPane();
        //add(tp);
       
        p.add(l2 = new JLabel("<html>"
                + "<font size = '5'><center>Maseno University<br>"
                + " <br>"
                + "<font color = orange><i>Seventh Day Adventist Church</i></font>"
                + "</center></font>"
                + "</html>"));
        l2.setForeground(new Color(250, 200, 0));
           
        p.add(l3 = new JLabel("<html>"
                + "<font size = '5'><font color = white><i> Thee_Hacker</i></font></font>"
                + "</html>"));
        
        p.add(login = new JButton());
        login.setText("<html><font size = '5'>Launch</font></html>");
        login.setForeground(new Color(53, 173, 253));
        login.setBackground(Color.BLACK);
        login.addActionListener(new Login());
        
        p.add(l3 = new JLabel("<html>"
                + "<font size = '6'>Developed by<font color = white><i> Thee_Hacker</i></font></font>"
                + "</html>"));
        l3.setForeground(new Color(253, 47, 126));
        
    }
    
    static void start() {
        JFrame j = new Start();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }

    

    private class Login implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            LogIn.Login("Login");
        }
    }
}
