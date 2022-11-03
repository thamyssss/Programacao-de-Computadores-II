/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoremadepit;

import java.util.Scanner;

/**
 *
 * @author tatah
 */
public class TeoremaDePit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Triângulo objeto = new Triângulo();
        
        double hipotenusa;
        
        System.out.println("Esse programa calcula o teorema de Pitágoras.");
        System.out.println("Digite o valor do seu cateto 1:");
        
        objeto.setCateto1(entrada.nextDouble());
        
        System.out.println("Digite o valor do seu cateto 2:");
        objeto.setCateto2(entrada.nextDouble());     
        
        hipotenusa = objeto.CalculaHip();
        
        System.out.println("O valor da sua hipotenusa é "+hipotenusa);
    }  
}