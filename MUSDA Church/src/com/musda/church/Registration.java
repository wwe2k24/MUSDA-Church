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
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

/**
 *      
 * @author romanreigns
 */
@SuppressWarnings("serial")
public class Registration extends JFrame implements ActionListener {
    
    private JTextField Name;
    private JTextField name1;
    private JTextField name2;
    private JTextField reg_no;
    private JTextField department;
    private JTextField faculty;
    private JTextField residence;
    private JTextField phone;
    private JTextField email;
    private JButton submit;
    private JButton previous;
    private JButton quit;
    private JLabel result;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JLabel l5;
    private JLabel l6;
    private JLabel l7;
    private JLabel l8;
    private JLabel l9;
    private JLabel l10;
    private JLabel l11;
    private JPanel p, p1, p2;
    private JPopupMenu pp;
    
    Registration() {
        
        setTitle(NewMain.title + " (Registration)");
        setSize(920,580);
        setLocation(430,150);
        getContentPane().setBackground( new Color(0, 0,0));
        setLayout(new GridLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setAlwaysOnTop(false);
        setResizable(false);
        setVisible(true);
        
        Icon icon1 = new ImageIcon("/home/romanreigns/Pictures/IMG_1722617422902.png");
        add(new JLabel(icon1));
        
        p1 = new JPanel();
        p1.setBackground( new Color(0, 23, 65,230));
        add(p1);
                               
        p1.add(p = new JPanel());
        p.setBackground(new Color(130,209,255, 255));
        
        
        p.add(l1 = new JLabel("<html><font size = '7'><center>"
                + "<font ><i>MUSDA"
                + "<sub> Church</sub></i></font><font size = '4' color = green>CNC </font>"
                + "</font></center></html>"));
        l1.setForeground(new Color(0, 23, 65));
        
        p1.add(l2 = new JLabel("<html>"
                + "<font size = '6'><i>Register as a member of <font color = orange><i>Calvary Class</i></font><br>"
                + " by entering the following details:</i></font>"
                + "</html>"));
        l2.setForeground(new Color(255, 217, 0));
        
        p1.add(l3 = new JLabel("<html>"
                + "<font size = '6'>first name</font>"
                + "</html>"));
        l3.setForeground(new Color(0, 255, 191));
        
        p1.add(l4 = new JLabel("<html>"
                + "<font size = '6'>middle name</font>"
                + "</html>")); 
        l4.setForeground(new Color(0, 255, 191));
        
        p1.add(l5 = new JLabel("<html>"
                + "<font size = '6'>surrname</font>"
                + "</html>")); 
        l5.setForeground(new Color(0, 255, 191));
        
        p1.add(name1 = new JTextField(10));
        name1.setForeground(new Color(255, 196, 0));
        name1.setBackground(Color.BLACK);
        name1.setCaretColor(new Color(250,250,0));
        name1.setSelectionColor(new Color(112, 243, 221));
        name1.setSelectedTextColor(new Color(212, 0, 255));
        
        p1.add(name2 = new JTextField(14));
        name2.setForeground(new Color(255, 196, 0));
        name2.setBackground(Color.BLACK);
        name2.setCaretColor(new Color(250,250,0));
        name2.setSelectionColor(new Color(112, 243, 221));
        name2.setSelectedTextColor(new Color(212, 0, 255));
        
        p1.add(Name = new JTextField(10));
        Name.setForeground(new Color(255, 196, 0));
        Name.setBackground(Color.BLACK);
        Name.setCaretColor(new Color(250,250,0));
        Name.setSelectionColor(new Color(112, 243, 221));
        Name.setSelectedTextColor(new Color(212, 0, 255));
        
        p1.add(l6 = new JLabel("<html>"
                + "<font size = '6'>Admission Number</font>"
                + "</html>"));
        l6.setForeground(new Color(0, 255, 64));
        p1.add(reg_no = new JTextField(18));
        reg_no.setForeground(new Color(234, 255, 44));
        reg_no.setBackground(Color.BLACK);
        reg_no.setCaretColor(new Color(0,0,0));
        
        p1.add(l7 = new JLabel("<html>"
                + "<font size = '6'> Department <font color = white size = '5'>(School)</font></font>"
                + "</html>"));
        l7.setForeground(new Color(0, 255, 64));
        p1.add(department = new JTextField(18));
        department.setForeground(new Color(234, 255, 44));
        department.setBackground(Color.BLACK);
        department.setCaretColor(new Color(0,0,0));
        
        p1.add(l8 = new JLabel("<html>"
                + "<font size = '6'>Faculty <font color = white size = '5'>(Course)</font> </font>"
                + "</html>"));
        l8.setForeground(new Color(0, 255, 64));
        p1.add(faculty = new JTextField(18));
        faculty.setForeground(new Color(234, 255, 44));
        faculty.setBackground(Color.BLACK);
        faculty.setCaretColor(new Color(0,0,0));
        
        p1.add(l9 = new JLabel("<html>"
                + "<font size = '6'>Residence</font>"
                + "</html>"));
        l9.setForeground(new Color(0, 255, 64));
        p1.add(residence = new JTextField(18));
        residence.setForeground(new Color(44, 248, 255));
        residence.setBackground(Color.BLACK);
        residence.setCaretColor(new Color(0,0,0));
        
        p1.add(l10 = new JLabel("<html>"
                + "<font size = '6'>Phone Number</font>"
                + "</html>"));
        l10.setForeground(new Color(0, 255, 64));
        p1.add(phone = new JTextField(18));
        phone.setForeground(new Color(44, 248, 255));
        phone.setBackground(Color.BLACK);
        phone.setCaretColor(new Color(0,0,0));
        
        p1.add(l11 = new JLabel("<html>"
                + "<font size = '6'>Email Address</font>"
                + "</html>"));
        l11.setForeground(new Color(0, 255, 64));
        p1.add(email = new JTextField(18));
        email.setForeground(new Color(44, 248, 255));
        email.setBackground(Color.BLACK);
        email.setCaretColor(new Color(0,0,0));
        
        p1.add(previous = new JButton());
        previous.setText("<html><font size = '5'> Back</font></html>");
        previous.setForeground(Color.YELLOW);
        previous.setBackground(Color.BLACK);
        previous.addActionListener(new Previous());
        
        p1.add(submit = new JButton());
        submit.setText("<html><font size = '5'>Submit</font></html>");
        submit.setForeground(Color.CYAN);
        submit.setBackground(Color.BLACK);
        submit.addActionListener(this);  
        
        p1.add(quit = new JButton());
        quit.setText("<html><font size = '5'> Quit </font></html>");
        quit.setForeground(Color.RED);
        quit.setBackground(Color.BLACK);
        quit.addActionListener(new Quit());
        
        p1.add(result = new JLabel());
        
        p1.add(l3 = new JLabel("<html>"
                + "<font size = '5'>Developed by<font color = white><i> Thee_Hacker</i></font></font>"
                + "</html>"));
        l3.setForeground(new Color(253, 47, 126));
        
    }
    
    public static void Registration() {
        JFrame reg = new Registration();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String FirstName = name1.getText();
        String MidName = name2.getText();
        String SurName = Name.getText();
        String Reg = reg_no.getText();
        String Dep = department.getText();
        String Fac = faculty.getText();
        String Res = residence.getText();
        String Phone = phone.getText();
        String Mail = email.getText();
        
        try(BufferedWriter details = new BufferedWriter(new FileWriter(
                "/home/romanreigns/Desktop/My_Projects/MUSDA Church Files/Confidential/Detailed User Information/"+(FirstName+" "+SurName)+".txt"))){
            details.write("PERSONAL INFORMATION \n");
            details.write("Full Name: " + FirstName + " "+ MidName +" "+ SurName +". \n");
            details.write("Registration Number: " + Reg + "\n");
            details.write("Department: "  + Dep + "\n");
            details.write("Faculty: " + Fac + "\n");
            details.write("\n CONTACT INFORMATION \n");
            details.write("Residence: " + Res + "\n");
            details.write("Phone Number: " + Phone + "\n");
            details.write("Email Address: " + Mail + "\n");
            details.write("");
            details.close();
        } catch (IOException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try(BufferedWriter register = new BufferedWriter(new FileWriter(
                "/home/romanreigns/Desktop/My_Projects/MUSDA Church Files/Members/Registered Members.txt", true))){
            register.write(" ~ " + FirstName + " " + MidName + " " + SurName+" " + Phone + "\n");
            register.close();
        } catch (IOException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
        Home.home();
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
            SignUp.Signup("Signup");
        }

    }
}
