
package locadoradigital;

import java.util.ArrayList;

public class Categoria {
    
    private ArrayList<String> categorias;
    protected double soma; //variável que soma o preço total do aluguel de jogos de cada categoria
      
    public Categoria(){

        this.categorias = new ArrayList<>();
        this.soma = 0;
        
        //adiciona as categorias ao arraylist
        categorias.add("Terror");       
        categorias.add("Aventura");
        categorias.add("Tiro");
        categorias.add("Sobrevivência");
        
    }
 
    //Método que exibe as categorias de jogos 
    public void MostraCategorias(){
        
        for (int i = 0; i < categorias.size(); i++) {
            System.out.printf("\n   %d        %s",i+1,categorias.get(i));
        }
    }
    
    //Método que mostra os jogos presentes em cada categoria
    public void MostraJogos(){}
    
    //Método que procura o jogo relativo ao código digitado
    public void VerificaCodigo(ArrayList jogos){}
    
    //ATENÇÃO!! MÉTODOS MOSTRAJOGOS() E VERIFICACODIGO() UTILIZAM POLIMORFISMO

    public ArrayList<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }  

    public double getSoma() {
        return this.soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }
}
