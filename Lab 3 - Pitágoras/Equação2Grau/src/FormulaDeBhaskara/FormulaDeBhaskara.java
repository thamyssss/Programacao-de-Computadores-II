/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormulaDeBhaskara;

import java.util.Scanner;

/**
 *
 * @author tatah
 */
public class FormulaDeBhaskara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
       
        EQUACAO objeto = new EQUACAO();
        
        double delta;
        double raiz1, raiz2;
        
        System.out.println("Para calcular as raízes da sua função ax^2 + bx + c, digite seu termo 'a':");
        
        objeto.setA(entrada.nextDouble());
        
        System.out.println("Agora digite seu termo 'b':");
        
        objeto.setB(entrada.nextDouble());
        
        System.out.println("Agora digite seu termo 'c':");
        
        objeto.setC(entrada.nextDouble());
        
        delta = objeto.delta();
        
        if(delta<0){
            
            System.out.println("Essa equação não possui raízes reais.");
        }
        
        else if(delta==0){
            
            raiz1 = objeto.PrimeiraRaiz();
            System.out.println("Essa equação possui apenas uma raiz: "+raiz1);
        }
        
        else {
     
            raiz1 = objeto.PrimeiraRaiz();
            System.out.println("Sua primeira raiz é: "+raiz1);
            
            raiz2 = objeto.SegundaRaiz();
            System.out.println("Sua segunda raiz é: "+raiz2);
        }
    }
    
}
