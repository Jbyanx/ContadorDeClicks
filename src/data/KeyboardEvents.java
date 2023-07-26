/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author HP
 */
public class KeyboardEvents extends JFrame{
    private JPanel panel;
    private JTextField field;
    private JTextArea area;
    private JScrollPane scrol;
    
    public KeyboardEvents(){
        iniciarComponentes();
        colocarTextfield();
        colocarTextarea();
        colocarScroll();
        eventosTeclado();
    }
    
    private void iniciarComponentes(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        panel = new JPanel();
        
        this.getContentPane().add(panel);
        panel.setSize(this.getWidth(),this.getHeight());
        panel.setLayout(null);
    }

    private void colocarTextfield() {
        field = new JTextField();
        field.setBounds(50,50,150,30);
        
        panel.add(field);
    }

    private void colocarTextarea() {
        area = new JTextArea();
        area.setBounds(250,50,200,350);
        
        panel.add(area);
    }

    private void colocarScroll() {
        scrol = new JScrollPane(area,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrol.setBounds(area.getX(),area.getY(),area.getWidth(),area.getHeight());
        
        panel.add(scrol);
    }
    
    private void eventosTeclado() {
        
        KeyListener l = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //area.append("KeyTyped "+e.getKeyChar()+" \n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //area.append("KeyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                area.append("KeyReleased "+e.getKeyChar()+" \n");
            }
        };
        
        field.addKeyListener(l);
    }

}
