//Trabalho Prático 1 - Thamiris Souza, Marcelo Vieira, Marcos Antônio

package controle.de.hospedagem;

import java.util.Scanner;

public class ControleDeHospedagem {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        Quarto quarto = new Quarto(); //superclasse
        Cliente cliente = new Cliente();
        Residencia res = new Residencia();
        Data data = new Data();
        
        QuartoIndividual indiv = new QuartoIndividual();
        QuartoIndividualPlus iplus = new QuartoIndividualPlus();
        QuartoCasal casal = new QuartoCasal();
        QuartoCasalPlus cplus = new QuartoCasalPlus();       
        
        double total; //valor total a pagar
        
        System.out.println("Bem vindo(a) ao Hotel Cortez! Para fazer o cadastro digite os seguintes dados:\n");
        
        System.out.printf("Nome: ");
        cliente.setNome(ent.nextLine());
        
        System.out.printf("E-mail: ");
        cliente.setEmail(ent.nextLine());
           
        System.out.printf("Endereço: ");
        cliente.setEndereço(ent.nextLine());
        
        System.out.printf("Cpf: ");
        cliente.setCpf(ent.nextLong());
        
        System.out.printf("Celular: ");
        cliente.setCelular(ent.nextLong());
        
        System.out.printf("Telefone: ");
        cliente.setTelefone(ent.nextLong());
       
        //chama o método para adicionar quartos ao arraylist
        res.AdQuarto();

        System.out.println("\nTemos os seguintes quartos disponíveis para aluguel:");
        System.out.println(res.getQuartos());
        
        System.out.println("\nSelecione o tipo de quarto desejado (individual = 1 / casal = 2):");
        data.setEscolha1(ent.nextInt());
        int escolha1 = data.getEscolha1();
        
        System.out.println("Deseja banheira de hidromassagem e ar condicionado? (NÃO - 0 / SIM - 1)");
        data.setEscolha2(ent.nextInt());
        int escolha2 = data.getEscolha2();
        
         if(escolha1 == 1){
            if(escolha2 == 0){                
                System.out.println("Você está alugando um quarto individual simples. O valor da diária é R$119,90.\n");
            }
           
            else {            
                System.out.println("Você está alugando um quarto individual plus. O valor da diária é R$159,90.\n");
            }
        }  
        
        else {
           if(escolha2 == 0){              
                System.out.println("Você está alugando um quarto de casal simples. O valor da diária é R$179,90.\n");
            }
            
           else {              
                System.out.println("Você está alugando um quarto de casal plus. O valor da diária é R$239,90.\n");
            }
        }

        System.out.println("Data de entrada no hotel:");
        System.out.printf("Dia: ");
        data.setDiaEnt(ent.nextInt());
        
        System.out.printf("Mês: ");
        data.setMesEnt(ent.nextInt());
        
        System.out.printf("Ano: ");
        data.setAnoEnt(ent.nextInt());
        
        System.out.println("Horário de entrada:");
        System.out.printf("Horas: ");
        data.setHoraEnt(ent.nextInt());
        
        System.out.printf("Minutos:");
        data.setMinutosEnt(ent.nextInt());
        
        System.out.println("\nData de saída do hotel:");
        System.out.printf("Dia: ");
        data.setDiaOut(ent.nextInt());
        
        System.out.printf("Mês: ");
        data.setMesOut(ent.nextInt());
        
        System.out.printf("Ano: ");
        data.setAnoOut(ent.nextInt());
        
        System.out.println("Horário pretendido de saída:");
        System.out.printf("Horas: ");
        data.setHoraOut(ent.nextInt());
        
        System.out.printf("Minutos: ");
        data.setMinutosOut(ent.nextInt());
        
        data.ComparaData(); //chama o método para calcular a quantidade de diárias e o valor a pagar
                
    }   
}
