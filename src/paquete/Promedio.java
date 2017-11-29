/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
package paquete;

import javax.swing.JOptionPane;

public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   double nota1 =Double.parseDouble(JOptionPane.showInputDialog("Primera nota: "));
   double nota2 =Double.parseDouble(JOptionPane.showInputDialog("Segunda nota: "));
   double nota3 =Double.parseDouble(JOptionPane.showInputDialog("Tercera nota: "));
   double nota4 =Double.parseDouble(JOptionPane.showInputDialog("Cuarta nota: ")); 
   double Promedio=(nota1+nota2+nota3+nota4)/4;
   
    if(Promedio%(int)Promedio==0){
        JOptionPane.showMessageDialog(null,"El promedio es: "+ (int)Promedio);
    }else{
      JOptionPane.showMessageDialog(null,"El promedio es: "+ Promedio);  
     }
    }
    
}
