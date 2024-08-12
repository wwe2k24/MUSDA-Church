/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.musda.church;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author romanreigns
 */
@SuppressWarnings("serial")
public class LogIn extends JFrame implements ActionListener {
    
    private JTextField user;
    private JPasswordField pass;
    private JButton submit;
    private JButton previous;
    private JButton quit;
    private JButton signup;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JPanel p;
    private JPanel p1;
    private JLabel result;
    
     LogIn(String instance){
        
        setTitle("" + NewMain.title + " (" + instance + ")");
        setLocation(430,150);
        setSize(685,450);
        getContentPane().setBackground(new Color(0,0,0));
        setLayout(new GridLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setAlwaysOnTop(false);
        setResizable(false);
        setVisible(true);
        
        Icon icon1 = new ImageIcon("/home/romanreigns/Pictures/IMG_1722617422902.png");
        add(new JLabel(icon1));
        
        add(p = new JPanel());
        p.setBackground(new Color(3, 22, 65));
        
        p1 = new JPanel();
        p1.setBackground(new Color(130,209,255, 255));
        p1.add(l3 = new JLabel("<html><font size = '7'><center>"
                + "<font ><i>MUSDA"
                + "<sub> Church</sub></i></font><font size = '4' color = green>CNC</font>"
                + "</font></center></html>"));
        l3.setForeground(new Color(0, 23, 65));
        
        p.add(p1);
        
        p.add(l1 = new JLabel("<html>"
                + "<font size = '6'><font color = white>Enter your </font ><i>username</i></font>"
                + "</html>"));
        l1.addKeyListener(new l());
        l1.setForeground(new Color(141, 255, 12));
        p.add(user = new JTextField(23)); 
        user.setForeground(new Color(255, 196, 0));
        user.setBackground(Color.BLACK);
        user.setCaretColor(new Color(250,250,0));
        user.setSelectionColor(new Color(112, 243, 221));
        user.setSelectedTextColor(new Color(212, 0, 255));
        
        p.add(l2 = new JLabel("<html>"
                + "<font size = '6'><font color = white>Enter your </font ><i>password</i></font>"
                + "</html>"));
        l2.setForeground(new Color(141, 255, 12));
        p.add(pass = new JPasswordField(23));
        pass.setForeground(new Color(21, 255, 216));
        pass.setBackground(Color.BLACK);
        pass.setCaretColor(new Color(0, 217, 255));
        pass.setSelectionColor(new Color(112, 243, 221));
        pass.setSelectedTextColor(new Color(212, 0, 255));
        
        p.add(previous = new JButton());
        previous.setText("<html><font size = '5'> Back</font></html>");
        previous.setForeground(Color.YELLOW);
        previous.setBackground(Color.BLACK);
        previous.addActionListener(new Previous());
        
        p.add(submit = new JButton());
        submit.setText("<html><font size = '5'> Log In </font></html>");
        submit.setForeground(Color.CYAN);
        submit.setBackground(Color.BLACK);
        submit.addActionListener(this);
        
        p.add(quit = new JButton());
        quit.setText("<html><font size = '5'> Quit </font></html>");
        quit.setForeground(Color.RED);
        quit.setBackground(Color.BLACK);
        quit.addActionListener(new Quit());
        
        p.add(result = new JLabel("<html><font></font><br></html>"));
        
        p.add(l1 = new JLabel("<html>"
                + "<font size = '5' color = aqua>If you don't have an <font ><i>account</i></font></font>"
                + "</html>"));
        
        p.add(signup = new JButton());
        signup.setText("<html><font size = '5'> Sign Up</font></html>");
        signup.setForeground(new Color(27, 247, 82));
        signup.setBackground(Color.BLACK);
        signup.addActionListener(new Signup());
        
        p.add(l3 = new JLabel("<html>"
                + "<font size = '5'>Developed by<font color = white><i> Thee_Hacker</i></font></font>"
                + "</html>"));
        l3.setForeground(new Color(253, 47, 126));
        
    }
    
    public static void Login(String instance){
        JFrame j = new LogIn(instance);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String User = user.getText();
        @SuppressWarnings("deprecation")
        String Pass = pass.getText();
        
        try (BufferedReader u = new BufferedReader(new FileReader("/home/romanreigns/Desktop/My_Projects/MUSDA Church Files/Confidential/Usernames/"+User+" - (username).txt"))){
            String ur = u.readLine();
            if (User.equals(ur)){
                try(BufferedReader p = new BufferedReader(new FileReader("/home/romanreigns/Desktop/My_Projects/MUSDA Church Files/Confidential/Passwords/"+User+" - (password).txt"))){
                    String ps = p.readLine();
                    if (Pass.equals(ps)){
                        Home.home();
                    } else {
                        result.setText("<html>"
                + "<font size = '5'>Incorrect Password</font>"
                + "</html>");
                        result.setForeground(new Color(245, 144, 13));
                    }
                }
            } else {
                result.setText("<html>"
                + "<font size = '5'>Incorrect Username</font>"
                + "</html>");
                result.setForeground(new Color(245, 144, 13));
            }
            u.close();
        } catch (IOException ex) {
            result.setText("<html>"
                + "<font size = '5'>Username does not exist</font>"
                + "</html>");
            result.setForeground(new Color(245, 144, 13));
        }
    }

    private static class l implements KeyListener {

        public l() {
        }

        @Override
        public void keyTyped(KeyEvent ke) {
            System.exit(0);
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private class Quit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }

    }

    private class Previous implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            Start.start();
        }

    }
    
    private class Signup implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            SignUp.Signup("Signup");
        }
    }
}
