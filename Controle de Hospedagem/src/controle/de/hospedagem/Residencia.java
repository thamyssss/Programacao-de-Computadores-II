
package controle.de.hospedagem;

import java.util.ArrayList;

public class Residencia {
    
    private String endereço;
    private int numero;
    private String bairro;
    private long cep;
    private long telefone;
    private String email;

    //instanciando o arraylist
    private ArrayList<Quarto> quartos;
    Quarto quarto; 
    Quarto quarto1;
    Quarto quarto2; 
    Quarto quarto3;
  
    public Residencia() {
        
        this.quarto = new QuartoIndividual();
        this.quarto1 = new QuartoCasal();
        this.quarto2 = new QuartoIndividualPlus();  
        this.quarto3 = new QuartoCasalPlus();
        this.quartos = new ArrayList<>();  
        
        //endereço do hotel
        this.endereço = "Rua Marechal";
        this.numero = 123;
        this.bairro = "Dona Penha";
        this.cep = 3256478;
        this.telefone = 36547485;
        this.email = "hcortez@gmail.com";
    }
    
    //Adiciona os quartos ao ArrayList
    public void AdQuarto() {
        
        this.quartos.add(quarto);
        this.quartos.add(quarto1);
        this.quartos.add(quarto2);
        this.quartos.add(quarto3);
    }
    
    //Exibe o ArrayList com os quartos disponíveis com base no método ToString
    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }  
}
