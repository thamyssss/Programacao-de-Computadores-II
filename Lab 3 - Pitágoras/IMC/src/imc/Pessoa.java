/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author Thamiris
 */
public class Pessoa {
    //variáveis privadas, atributos da classe    
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;
    
    //construtor
    public Pessoa(){  //tudo entre () - parâmetros e argumentos do método                                                                                                  

        this.nome = "";
        this.sobrenome = "";
        this.idade = 0;
        this.altura = 0;
        this.peso = 0;
        this.imc = 0;

    }
    
    //métodos get e set
    public String getNome() {    
        return this.nome;
    }
    
    public void setNome(String nome) {    
        this.nome = nome;
    }
    public String getSobrenome() {    
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {    
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return this.imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    //método para calcular o imc
    public double CalculaIMC(){
        imc = peso/Math.pow(altura,2);
        return imc;
    }
    
    //Informa obesidade
    public int InformaIMC(){
        if(imc < 18.5){
            return 1; }
        
        else if(imc >= 18.5 && imc <= 24.5){        
            return 2; }
        
        else if(imc > 24.9 && imc <= 29.9) {
            return 3; }
        
        else if(imc > 29.9 && imc <= 34.9) {
            return 4; }
        
        else if(imc > 34.9 && imc <= 39.9) {
            return 5; }
        
        else {
            return 6; }        
    }   
}