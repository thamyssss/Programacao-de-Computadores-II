
package locadoradigital;

import java.util.ArrayList;

public class Sobrevivencia extends Categoria{
    
    private ArrayList<Jogo> survivor;
  
    public Sobrevivencia(){
        
        this.survivor = new ArrayList<>();
        
        //Instanciando os objetos do arraylist
        Jogo game = new Jogo("Ark: Survival Evolved",16,93.99);
        Jogo game1 = new Jogo("Astroneer",17,55.99);
        Jogo game2 = new Jogo("Day-z",18,78.99);
        Jogo game3 = new Jogo("Dead By Daylight",19,37.99);
        Jogo game4 = new Jogo("Don't Starve Together",20,27.99);
        
        //adicionando os jogos ao arraylist
        survivor.add(game);
        survivor.add(game1);
        survivor.add(game2);
        survivor.add(game3);
        survivor.add(game4);
    }
    
    @Override
    public void MostraJogos(){
    
        //esse for percorre todo o arraylist de jogos
        for(Jogo j : survivor) {
            
            System.out.printf("\n  %d                 R$%.2f             %s",j.getCodigo(),j.getPrecoSemanal(),j.getJogo());
        } 
    }
    
    @Override
    public void VerificaCodigo(ArrayList jogos){
        
        //percorre o arraylist de jogos
        for(Jogo j : survivor) {
            
            for(int i = 0; i < jogos.size(); i++){ //dentro do arraylist jogos, percorremos o arraylist de jogos do usuário
                if(jogos.get(i).equals(j.getCodigo())){ //compara o código digitado com o código do arraylist
                    System.out.println(j.getJogo()); //mostra o jogo relativo ao código 
                    
                    soma += j.getPrecoSemanal();
                }
            }           
        }
    }
       
    public ArrayList<Jogo> getSurvivor() {
        return survivor;
    }

    public void setSurvivor(ArrayList<Jogo> survivor) {
        this.survivor = survivor;
    }
}
