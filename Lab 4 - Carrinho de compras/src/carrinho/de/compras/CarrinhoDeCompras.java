
package carrinho.de.compras;

import java.util.ArrayList;
import java.util.Scanner;

public class CarrinhoDeCompras {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Item item[] = new Item[3];
        
        for(int i=0; i<3; i++) {
            item[i] = new Item();
        }
        
        int código;
        double total = 0;
        
        Fatura fatura = new Fatura();
        
        ArrayList<Produto> produtos = new ArrayList<>();
        
        Produto produto = new Produto("Arroz", "11.50", "1");
        Produto produto1 = new Produto("Feijão", "5.00", "2"); 
        Produto produto2 = new Produto("Farinha", "4.50", "3");
        
        produtos.add(produto);
        produtos.add(produto1);
        produtos.add(produto2);
        
        item[0].setPreço(11.50);
        item[1].setPreço(5.00);
        item[2].setPreço(4.50);
        
        item[0].setQuantidade(0);
        item[1].setQuantidade(0);
        item[2].setQuantidade(0);
        
        System.out.println("Bem vindo(a) à loja online! Temos os seguintes produtos:");
        
        for(Produto p : produtos) {
            
            System.out.println(p.getNome());
            System.out.println("Preço: R$" +p.getPreço());
            System.out.println("Código: " +p.getCódigo());
        }
        
        System.out.println("\nSISTEMA DE COMPRAS:");
        System.out.println("(Para interromper a compra digite 5252.)");
  
        for(int x = 0; x < 1; x--) {
            
            System.out.println("\nDigite o código do produto desejado:");
            código = entrada.nextInt();
            
            switch (código) {
                case 1:
                    System.out.println("Digite a quantidade de pacotes de arroz desejada:");
                    item[0].setQuantidade(entrada.nextInt());
                    break;
                    
                case 2:
                    System.out.println("Digite a quantidade de pacotes de feijão desejada:");
                    item[1].setQuantidade(entrada.nextInt());
                    break;
                    
                case 3:
                    System.out.println("Digite a quantidade de pacotes de farinha desejada:");
                    item[2].setQuantidade(entrada.nextInt());
                    break;
                    
                case 5252:
                    System.out.println("COMPRA FINALIZADA.");
                    
                    for(int i = 0; i < 3; i++) {            
                         total += item[i].CalculaValor();
                    }
                    
                    System.out.println("O valor total a pagar é de R$"+total);
                    
                    System.exit(0);
                    
                default:
                    System.out.println("CÓDIGO INVÁLIDO. Tente novamente.");
                    break;
            }
    
        }
        

    }   
}
