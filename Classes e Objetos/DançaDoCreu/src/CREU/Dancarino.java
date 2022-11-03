/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CREU;

/**
 *
 * @author tatah
 */
public class Dancarino {
    //atributos    
    private String nome;
    private int disposicao;
    private int habilidade;
    private int malemolencia;
    private int velocidade;
    
    //construtor
    public Dancarino(){                                                                                                  
        
        this.nome = "";
        this.disposicao = 0;       
        this.habilidade = 0;
        this.malemolencia = 0;
        this.velocidade = 0;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the disposicao
     */
    public int getDisposicao() {
        return this.disposicao;
    }

    /**
     * @param disposicao the disposicao to set
     */
    public void setDisposicao(int disposicao) {
        this.disposicao = disposicao;
    }

    /**
     * @return the habilidade
     */
    public int getHabilidade() {
        return this.habilidade;
    }

    /**
     * @param habilidade the habilidade to set
     */
    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }

    /**
     * @return the malemolencia
     */
    public int getMalemolencia() {
        return this.malemolencia;
    }

    /**
     * @param malemolencia the malemolencia to set
     */
    public void setMalemolencia(int malemolencia) {
        this.malemolencia = malemolencia;
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return this.velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

   //Calculando sua velocidade do creu
    public int Velocidade() {        
       velocidade = (disposicao + habilidade + malemolencia)/3;
       return velocidade;
    }       
}
