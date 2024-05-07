/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author User
 */
public class ContohGUI extends JFrame{
    JPanel pl = new JPanel();
    JLabel lbl1 = new JLabel("String 1");
    JLabel lbl2 = new JLabel("String 2");
    JLabel lbl3 = new JLabel("Hasil");

    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();

    JButton b1 = new JButton("Proses");
    JButton b2 = new JButton("Hapus");
    
    public ContohGUI(){
        add(lbl1);
        add(lbl2);
        add(lbl3);
        
        add(t1);
        add(t2);
        add(t3);
        
        add(b1);
        add(b2);
        add(pl);
        
    setTitle("GUI Swing"); 
    setBounds(100, 100, 300, 300); 
    lbl1.setBounds(15,20,80,25); //15 jarak antr pinggir 
    lbl2.setBounds(15,55,125,25);
    lbl3.setBounds(15,90,125,25);
        
    t1.setBounds(120,20,80,25); 
    t2.setBounds(120,50,110,25); 
    t3.setBounds(120,80,150,25); 
        
    b1.setBounds (15,190,100,25); 
    b2.setBounds(120,190,80,25); 
        
    setDefaultCloseOperation (EXIT_ON_CLOSE);
        
    b1.addActionListener(new ActionListener() { 
        public void actionPerformed (ActionEvent e) { 
            kirimdata();} 

            private void kirimdata() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    b2.addActionListener(new ActionListener() { 
        public void actionPerformed (ActionEvent e) { 
            hapusdata();} 
        }); 
    }
    
    public void hapusdata(){ 
        t1.setText("");
        t2.setText(""); 
        t3.setText(""); 
    }
    public static void main(String[] args) { 
        ContohGUI demo = new ContohGUI(); 
        demo.setVisible(true);
    }
}