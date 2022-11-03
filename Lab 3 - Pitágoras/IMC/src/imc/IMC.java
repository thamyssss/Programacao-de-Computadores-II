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

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        Pessoa pessoa[] = new Pessoa[10];
                 
        for(int i=0; i<10; i++) {
            pessoa[i] = new Pessoa();
        }

        String nomes[] = new String[10];
        String sobrenomes[] = new String[10];
        String NomesCompletos[] = new String[10];
        
        System.out.println("Esse programa calcula o seu IMC - Índice de massa corporal. Faça seu cadastro:");
        
        for(int x = 0; x<10; x++) {
            
            nomes[x] = new String();
            sobrenomes[x] = new String();
            
            System.out.printf("Cadastro %d:\n",x+1);
            
            entrada.nextLine();
            System.out.println("Nome:");        
            pessoa[x].setNome(entrada.nextLine());

            System.out.println("Sobrenome:");
            pessoa[x].setSobrenome(entrada.nextLine());
            
            NomesCompletos[x] = pessoa[x].getNome() + pessoa[x].getSobrenome();
            
            for(int y=0; y<x; y++){
                
                if(x!=y) {
                    if(NomesCompletos[y].equals(NomesCompletos[x])){
                        System.exit(0);
                    }
                }
            }

            System.out.println("Idade:");
            pessoa[x].setIdade(entrada.nextInt());

            System.out.println("Altura em metros:");
            pessoa[x].setAltura(entrada.nextDouble());

            System.out.println("Peso em kg:");
            pessoa[x].setPeso(entrada.nextDouble());
        }
       
        for(int x = 0; x<10; x++){

            System.out.printf("Cadastro %d\n",(x+1));
            System.out.printf("Nome Completo: %s %s\n", pessoa[x].getNome(), pessoa[x].getSobrenome());
            System.out.printf("Nome de referência: %s, %s\n", pessoa[x].getSobrenome(), pessoa[x].getNome().toUpperCase());
            System.out.println("Idade: "+pessoa[x].getIdade());
            System.out.printf("Peso: %f kg\n", pessoa[x].getPeso());
            System.out.printf("Altura: %f metros\n", pessoa[x].getAltura());
            System.out.println("IMC: "+pessoa[x].CalculaIMC());
            
            switch (pessoa[x].InformaIMC()) {
                case 1:
                    System.out.println("Classificação: abaixo do peso ideal.");
                    break;
                case 2:
                    System.out.println("Classificação: peso ideal.");
                    break;
                case 3:
                    System.out.println("Classificação: acima do peso ideal.");
                    break;
                case 4:
                    System.out.println("Classificação: obesidade grau 1.");
                    break;
                case 5:
                    System.out.println("Classificação: obesidade grau 2.");
                    break;
                default:
                    System.out.println("Classificação: obesidade grau 3");
                    break;
            }
        }       
    }
}
