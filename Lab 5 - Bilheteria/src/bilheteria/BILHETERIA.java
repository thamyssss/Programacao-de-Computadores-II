
package bilheteria;

import java.util.Scanner;

public class BILHETERIA {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Normal normal = new Normal(20);
        Vip vip = new Vip(10, normal.valor);
        CamaroteInferior inferior = new CamaroteInferior(vip.valorAdicional, vip.valor);
        CamaroteSuperior superior = new CamaroteSuperior(30, vip.valorAdicional, vip.valor);
        int opcao = 0;
        int opcao_camarote = 0;
        
        System.out.print("************* Bilheteria*************\n");
        System.out.print("Digite 1 para ingresso normal ou 2 para VIP: \n");
        opcao = entrada.nextInt();
              
        switch(opcao){
            case 1: System.out.print("Voce selecionou ingresso normal\n");
                    System.out.print("O valor do ingresso normal é R$"+normal.ingressoNormal()+"\n");break;
            case 2: System.out.print("Voce selecionou ingresso VIP (valor adicional de R$10,00)\n");
                    System.out.print("Digite 1 para Camarote Superior ou 2 para Camarote Inferior\n");
                    opcao_camarote = entrada.nextInt();
                    
                    switch(opcao_camarote){
                        case 1: System.out.print("Voce selecionou Camarote Superior (valor adicional de R$30,00)\n");
                                superior.valorDoIngresso(); break;
                        case 2: System.out.print("Voce selecionou Camarote Inferior\n");
                                inferior.valorDoIngresso(); break;                    
                        default: System.out.print("Opção impossível\n"); break;
                    } break;
                    
            default: System.out.print("Opção impossível\n"); break;
        }    
    }     
}
    

