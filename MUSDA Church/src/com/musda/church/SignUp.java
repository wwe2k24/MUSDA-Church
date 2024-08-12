/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.musda.church;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class SignUp extends JFrame implements ActionListener {
    
    private JTextField user1;
    private JPasswordField pass1;
    private JPasswordField pass2;
    private JButton submit;
    private JButton previous;
    private JButton quit;
    private JButton signup;
    private JLabel result;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JPanel p;
    private JPanel p1;
    
    SignUp(String instance){
        
        setTitle("" + NewMain.title + " (" + instance + ")");
        setLocation(430,150);
        setSize(685,450);
        getContentPane().setBackground(new Color(0,0,0));
        setLayout(new GridLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setAlwaysOnTop(false);
        setResizable(false);
        setVisible(true);
        
        Icon icon = new ImageIcon("/home/romanreigns/Pictures/IMG_1722617422902.png");
        add(new JLabel(icon));
        
        add(p = new JPanel());
        p.setBackground(new Color(3, 22, 65));
        
//        Icon icon1 = new ImageIcon("/home/romanreigns/Pictures/Friends/Lynda 01.jpg");
//        add(new JLabel(icon1));
//     
        
        p1 = new JPanel();
        p1.setBackground(new Color(130,209,255, 255));
        p1.add(l4 = new JLabel("<html><font size = '7'><center>"
                + "<font ><i>MUSDA"
                + "<sub> Church</sub></i></font><font size = '4' color = green>CNC</font>"
                + "</font></center></html>"));
        l4.setForeground(new Color(0, 23, 65));
        
        p.add(p1);
        
        p.add(l1 = new JLabel("<html>"
                + "<font size = '6'><font color = white>Enter your </font ><i>username</i></font>"
                + "</html>"));
        l1.setForeground(new Color(141, 255, 12));
        p.add(user1 = new JTextField(23));
        user1.setForeground(new Color(255, 196, 0));
        user1.setBackground(Color.BLACK);
        user1.setCaretColor(new Color(250,250,0));
        user1.setSelectionColor(new Color(112, 243, 221));
        user1.setSelectedTextColor(new Color(212, 0, 255));
        
        p.add(l2 = new JLabel("<html>"
                + "<font size = '6'><font color = white>Enter your </font ><i>password</i></font>"
                + "</html>"));
        l2.setForeground(new Color(141, 255, 12));
        p.add(pass1 = new JPasswordField(23));
        pass1.setForeground(new Color(21, 255, 216));
        pass1.setBackground(Color.BLACK);
        pass1.setCaretColor(new Color(0, 217, 255));
        pass1.setSelectionColor(new Color(112, 243, 221));
        pass1.setSelectedTextColor(new Color(212, 0, 255));
        
        p.add(l3 = new JLabel("<html>"
                + "<font size = '6'><font color = white>Confirm your </font ><i>password</i></font>"
                + "</html>"));
        l3.setForeground(new Color(141, 255, 12));
        p.add(pass2 = new JPasswordField(23));
        pass2.setForeground(new Color(21, 255, 216));
        pass2.setBackground(Color.BLACK);
        pass2.setCaretColor(new Color(0, 217, 255));
        pass2.setSelectionColor(new Color(112, 243, 221));
        pass2.setSelectedTextColor(new Color(212, 0, 255));
        
        p.add(previous = new JButton());
        previous.setText("<html><font size = '5'> Back</font></html>");
        previous.setForeground(Color.YELLOW);
        previous.setBackground(Color.BLACK);
        previous.addActionListener(new Previous()); 
        
        p.add(submit = new JButton());
        submit.setText("<html><font size = '5'>Sign In</font></html>");
        submit.setForeground(Color.CYAN);
        submit.setBackground(Color.BLACK);
        submit.addActionListener(this);
        
        p.add(quit = new JButton());
        quit.setText("<html><font size = '5'> Quit </font></html>");
        quit.setForeground(Color.RED);
        quit.setBackground(Color.BLACK);
        quit.addActionListener(new Quit());
        
        p.add(result = new JLabel("🌹 love"));
        result.setForeground(new Color(245, 144, 13));
        
        p.add(l3 = new JLabel("<html>"
                + "<font size = '5'>Developed by<font color = white><i> Thee_Hacker</i></font></font>"
                + "</html>"));
        l3.setForeground(new Color(253, 47, 126));
        
    }
    
    public static void Signup(String instance){
        JFrame j = new SignUp(instance);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String User = user1.getText();
        @SuppressWarnings("deprecation")
        String Pass1 = pass1.getText();
        @SuppressWarnings("deprecation") 
        String Pass2 = pass2.getText();
        
        if (Pass2.equals(Pass1)){
            try(BufferedWriter user = new BufferedWriter(new FileWriter(
                    "/home/romanreigns/Desktop/My_Projects/MUSDA Church Files/Confidential/Usernames/"+User+" - (username).txt"))){
                user.write(User);
                user.close();
            } catch (IOException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }

            try(BufferedWriter pass = new BufferedWriter(new FileWriter(
                    "/home/romanreigns/Desktop/My_Projects/MUSDA Church Files/Confidential/Passwords/"+User+" - (password).txt"))){
                setVisible(false);
                pass.write(Pass1);
                pass.close();
                Registration.Registration();
            } catch (IOException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);                
            }
        } else {
            result.setText("<html>"
                + "<font size = '5'>ERROR! Passwords Do Not Match</font>"
                + "</html>");
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
            LogIn.Login("Login");
        }

    }
    
}
