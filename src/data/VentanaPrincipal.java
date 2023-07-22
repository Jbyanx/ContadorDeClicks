/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/**
 *
 * @author HP
 */
public class VentanaPrincipal extends JFrame{
    private JPanel panel;
    private JLabel label;
    private JTextArea areatexto;
    private JButton boton;
    private JScrollPane barra;
    
    public VentanaPrincipal(){
        
        iniciarPanel();
        iniciarComponentes();
        oyenteRaton();
    }

    private void iniciarPanel() {
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        panel  = new JPanel();
        panel.setSize(this.getContentPane().getWidth(),this.getContentPane().getHeight());
        this.getContentPane().add(panel);
    }

    private void iniciarComponentes() {
        panel.setLayout(null);
        label = new JLabel("Metodos del MouseEvent");
        label.setBounds(20,30,400,40);
        label.setFont(new Font("arial",0,20));
        panel.add(label);
        
        areatexto = new JTextArea(20,30);
        areatexto.setBounds(20,150,250,200);
        areatexto.setEditable(false);
        panel.add(areatexto);
        
        boton = new JButton("click");
        boton.setBounds(20,400,80,40);
        panel.add(boton);
      
        barra = new JScrollPane(areatexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(areatexto.getX(),areatexto.getY(),areatexto.getWidth(),areatexto.getHeight());
        panel.add(barra);
    }

    private void oyenteRaton() {
        areatexto.setText("Acciones:\n");
        
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                
                if(e.isAltDown()){
                    areatexto.append("Alt presionado\n");
                } else if (e.isControlDown()){
                    areatexto.append("Control presionado\n");
                } else if (e.isShiftDown()){
                    areatexto.append("Shift presionado\n");
                } else if(e.isMetaDown())
                    areatexto.append("click derecho presionado\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        boton.addMouseListener(ml);
    }
}