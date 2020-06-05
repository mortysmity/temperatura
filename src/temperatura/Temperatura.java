/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

import javax.swing.JOptionPane;

/**
 *Alguns países medem temperaturas em graus Celsius,
 * e outros em graus Fahrenheit. Faça um algoritmo para ler uma
 * temperatura Celsius e imprimi-Ia em Fahrenheit
 * @author chrishack
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Double C;
        Double F;
 
        System.out.println("Informe a temperatura em graus Centigrados");
        C
                = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em graus Centigrados: "));
 
 
       F= ((C* 1.8)+32);
        System.out.println("A temperatura em graus Fahrenheit é" + F );
    } 
    
}
