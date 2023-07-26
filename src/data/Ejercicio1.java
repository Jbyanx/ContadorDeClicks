/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author HP
 */
public class Ejercicio1 extends JFrame{
    private JPanel panel;
    private JLabel label;
    private JButton boton;
    private int contador = 0;
    
    
    public Ejercicio1(){
        iniciarComponentes();
        colocarLabel();
        colocarBoton();
        botonClick();
    }

    private void iniciarComponentes() {
        this.setSize(500,500);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        panel = new JPanel();
        
        panel.setSize(this.getWidth(),this.getHeight());
        panel.setLayout(null);
        this.add(panel); //this.getContentPane().add(panel);
    }

    private void colocarLabel() {
        label = new JLabel("Pulse el Botón");
        label.setBounds(125,50,250,50);
        label.setFont(new Font("Dialog",1,24));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel.add(label);
    }

    private void colocarBoton() {
        boton = new JButton("Click Aquí");
        boton.setBounds(125,250,250,50);
        boton.setFont(new Font("Dialog",1,20));
        
        panel.add(boton);
    }

    private void botonClick() {
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                label.setText("Mouse presionado "+contador+" veces");
                label.setFont(new Font("Dialog",0,20));
                label.setBounds(50,50,400,50);
                label.setHorizontalAlignment(SwingConstants.CENTER);
            }
        };
        
        boton.addActionListener(l);
    }
}
