/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin26;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class prueba implements ActionListener{
       JFrame marco;
    JPanel panel1;
    JLabel lEtiqueta;
    JButton bSaudo,bDespedida;
    
    public void ventana(){
         ImageIcon i = new ImageIcon("/datos/local/ylagorebollar/NetBeansProjects/Boletin26Clonado/Boletin26Clonado/src/Imagenes/1.jpg");
     marco = new JFrame("Exercicio 3");
        marco.setSize(500,500);
     panel1 = new JPanel();
     lEtiqueta = new JLabel();
     bSaudo = new JButton("",i);
     bDespedida= new JButton("Despedida");
        bSaudo.addActionListener(this);
        bDespedida.addActionListener(this);
        
     panel1.add(lEtiqueta);
     panel1.add(bSaudo);
     panel1.add(bDespedida);
     
     marco.add(panel1);
     marco.setLocationRelativeTo(null);
     marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     marco.setVisible(true);
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         
        if(e.getActionCommand().equals(""))
            lEtiqueta.setText("Un saudo a DAM");
        else
            lEtiqueta.setText("Fin do programa");
    }
    
}
