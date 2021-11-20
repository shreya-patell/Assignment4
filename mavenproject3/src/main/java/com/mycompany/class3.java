/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author shreyapatel
 */
public class class3 extends JFrame {
    static String appName = class1.getAppName();
    
    public class3() throws HeadlessException {
        super (appName);
        init();
        
    }
    
    public static void main (String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new class3().setVisible(true);
            }
        });
    }
    
   private void init() {
        setLayout(new FlowLayout());
        add(new JLabel("Welcome to " + appName));
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
