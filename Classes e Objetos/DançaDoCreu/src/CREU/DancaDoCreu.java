/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CREU;

import java.util.Scanner;

/**
 *
 * @author tatah
 */
public class DancaDoCreu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Dancarino objeto = new Dancarino();
        
        int velocidade;
        String nome;
        
        System.out.println("Você é realmente um bom dançarino do créu? Descubra!");
        System.out.println("Primeiramente, qual o seu nome dançarino(a)?");
        
        objeto.setNome(entrada.nextLine());
        
        nome = objeto.getNome();
        
        System.out.println("De 0 a 5, o quanto você gosta de agitar na pista de dança?");        
        objeto.setDisposicao(entrada.nextInt());
        
        System.out.println("Nada de ter corpo duro, tem que se soltar!");
        System.out.println("De 0 a 5, o quanto você leva jeito pra coisa?");
        objeto.setMalemolencia(entrada.nextInt());
        
        System.out.println("De 0 a 5, o quanto você realmente SABE dançar?");
        objeto.setHabilidade(entrada.nextInt());
        
        velocidade = objeto.Velocidade();
        
        switch (velocidade) {
            case 0:
                System.out.println("Sem chances! Você definitivamente NÃO é um bom dançarino do créu, "+nome);
                break;
            case 1:
                System.out.println("Iiih, muito fraquinho...Você consegue dançar créu na velocidade 1, "+nome);
                break;
            case 2:
                System.out.println("Iniciante! Você consegue dançar o créu na velocidade 2, "+nome);
                break;
            case 3:
                System.out.println("Aí sim! Você consegue dançar o créu na velocidade 3. Se esforçar mais você consegue o modo hard, "+nome);
                break;
            case 4:
                System.out.println("Brabo demaaais! Você consegue dançar o créu na velocidade 4, "+nome);
                break;
            default:
                System.out.println("HARDCORE DEMAIS!!! TU É MUITO BRABO! Tem que ser muito profissional. Você consegue dançar o créu na velocidade 5, "+nome);
                break;
        }
    }   
}
