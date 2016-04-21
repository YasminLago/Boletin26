package boletin26;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class ap6 extends javax.swing.JFrame {
    public ap6() {
        initComponents();
        
    }
    ArrayList <JButton> numeros = new ArrayList<>();
    JFrame marco = new JFrame("Bonoloto");
    JPanel panel = new JPanel();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void creaListaBotones(){
        JButton boton1 = new JButton();
        JButton boton2 = new JButton();
        JButton boton3 = new JButton();
        JButton boton4 = new JButton();
        JButton boton5 = new JButton();
        JButton boton6 = new JButton();
        JButton boton7 = new JButton();
        JButton boton8 = new JButton();
        JButton boton9 = new JButton();
        numeros.add(boton1);
        numeros.add(boton2);
        numeros.add(boton3);
        numeros.add(boton4);
        numeros.add(boton5);
        numeros.add(boton6);
        numeros.add(boton7);
        numeros.add(boton8);
        numeros.add(boton9);
        marco.setVisible(true);
    }
    public void creaBotones(){
        
       
      
    
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
