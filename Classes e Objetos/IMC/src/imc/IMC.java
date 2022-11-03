/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.util.Scanner;

/**
 *
 * @author tatah
 */
public class IMC {

    //Declaração de método
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        Pessoa objeto = new Pessoa();
        
        double InformaObesidade;
   
        System.out.println("Esse programa calcula o seu IMC - Índice de massa corporal.");
        System.out.println("Qual o seu nome?");
        
        objeto.setNome(entrada.next());
        
        System.out.println("Qual o seu sobrenome?");
        objeto.setSobrenome(entrada.next());
        
        System.out.println("Qual a sua idade?");
        objeto.setIdade(entrada.nextInt());
        
        System.out.println("Qual a sua altura em metros?");
        objeto.setAltura(entrada.nextDouble());
        
        System.out.println("Qual o seu peso em kg?");
        objeto.setPeso(entrada.nextDouble());
        
        //chamando o método
        objeto.CalculaIMC();
        
        //método InformaIMC retorna
        InformaObesidade = objeto.InformaIMC();
        
        if(InformaObesidade == 1){
            System.out.println("Você está abaixo do peso ideal.");
        }
        
        else if(InformaObesidade == 2){
            System.out.println("Você está no peso ideal.");
        }
        
        else if(InformaObesidade == 3){
            System.out.println("Você está acima do peso ideal.");
        }
        
        else if(InformaObesidade == 4){
            System.out.println("Você está com obesidade grau 1.");
        }
        
        else if(InformaObesidade == 5){
            System.out.println("Você está com obesidade grau 2.");
        }
        
        else {
            System.out.println("Você está com obesidade grau 3.");
        }           
    }
    
}
