//Trabalho final - Thamiris Souza, Marcelo Vieira, Marcos Antônio, Hugo Barbosa e Gabriel de Lima
package locadoradigital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LocadoraDigital {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        //Inicia o cadastro do cliente
        Pessoa pessoa = new Pessoa();
        
        System.out.printf("Nome: ");
        pessoa.setNome(ent.nextLine());
        
        System.out.printf("Sobrenome: ");
        pessoa.setSobrenome(ent.nextLine());
        
        System.out.printf("Email: ");
        pessoa.setEmail(ent.nextLine());
        
        System.out.printf("Celular: ");
        pessoa.setCelular(ent.nextLine());
        
        //Inicia a escolha da categoria e do jogo
        Categoria cat = new Categoria();
        Terror terror = new Terror();
        Aventura ave = new Aventura();
        Tiro tiro = new Tiro();
        Sobrevivencia sobre = new Sobrevivencia();
        
        System.out.println("\nCategorias de jogos disponíveis:\n");
        
        System.out.println("CÓDIGO  |  CATEGORIA ");
        cat.MostraCategorias();
        
        System.out.println("");
    
        //cria um loop para a pessoa ver quantas vezes quiser as categorias e os jogos
        for(int x = 0; x < 1; x--) {
            
        System.out.println("\nDigite o código da categoria desejada para visualizar os jogos:");
        int codigo = ent.nextInt();
        
        //com base no código de categoria digitado mostra os jogos
        switch (codigo) {
            case 1:
                System.out.println("\nOs jogos dessa categoria são:");
                System.out.println("\nCÓDIGO  |      PREÇO POR SEMANA     |   JOGOS");
                terror.MostraJogos();
                break;
            case 2:
                System.out.println("\nOs jogos dessa categoria são:");
                System.out.println("\nCÓDIGO  |      PREÇO POR SEMANA     |   JOGOS");
                ave.MostraJogos();
                break;
            case 3:
                System.out.println("\nOs jogos dessa categoria são:");
                System.out.println("\nCÓDIGO  |      PREÇO POR SEMANA     |   JOGOS");
                tiro.MostraJogos();
                break;
            case 4:
                System.out.println("\nOs jogos dessa categoria são:");
                System.out.println("\nCÓDIGO  |      PREÇO POR SEMANA     |   JOGOS");
                sobre.MostraJogos();
                break;    
            default:
                System.out.println("\nCÓDIGO INVÁLIDO");
                break;
        } 
        
        System.out.println("");
        
        System.out.printf("\nPara ver outra categoria digite 1, caso já queira seguir com a sua compra digite 2: ");
        int opcao = ent.nextInt(); //variável "opção" guarda a informação se o cliente quer seguir com a compra ou não
        
        //se o cliente quiser seguir com a compra sai do loop, se não, ele pode escolher continuar vendo as categorias e jogos
        if(opcao==2){          
                break;          
            }     
        }  
    
        //variável que vai guardar o código do jogo escolhido pelo cliente
        int jogo = 0;
        
        ArrayList<Integer> jogos = new ArrayList<>(); //arraylist com os códigos dos jogos escolhidos pelo cliente

        System.out.println("\nDigite o(s) código(s) do(s) jogo(s) que você deseja alugar (para finalizar digite 5252):");
        
        //cria um loop para o cliente adicionar todos os jogos desejados, finaliza com 5252
        for(int i = 0; i < 1; i--){
                
            jogo = ent.nextInt();
                
            if(jogo==5252){
                break;
            }
            
            else {      
                jogos.add(jogo);
            }       
        }           
        
        //método que coloca o arraylist em ordem crescente
        Collections.sort(jogos);

        System.out.println("\nOs jogos escolhidos foram:");
        
        //chama os métodos para procurar qual jogo foi escolhido pelo código digitado pelo cliente
        terror.VerificaCodigo(jogos);
        ave.VerificaCodigo(jogos);
        tiro.VerificaCodigo(jogos);
        sobre.VerificaCodigo(jogos);
        
        //varivável que guarda por quantas semanas o cliente quer alugar o(s) jogo(s)
        int semanas;
        
        System.out.println("\nFazemos o aluguel de de jogos e cobramos por semana. O tempo mínimo para alugar jogos na nossa biblioteca é 1 semana.");
        System.out.println("Quantas semanas você quer alugar o jogo?");
        semanas = ent.nextInt();
        
        double total;
        total =(terror.getSoma() + ave.getSoma() + tiro.getSoma() + sobre.getSoma()) * semanas;
        
        System.out.println("\n**************RECIBO*************");
        
        System.out.printf("O total a pagar é R$%.2f\n",total);
        System.out.println("Assim que o pagamento for efetuado o jogo já vai estar disponível na sua conta pelo tempo determinado.");
        System.out.println("MUITO OBRIGADO PELA PREFERÊNCIA!");
    }
}
