
package locadoradigital;

import java.util.ArrayList;

public class Aventura extends Categoria {
    
    private ArrayList<Jogo> ave;
    
    public Aventura(){
        
        this.ave = new ArrayList<>();
        
        //Instanciando os objetos do arraylist
        Jogo game = new Jogo("Death Stranding",6,239);
        Jogo game1 = new Jogo("Life Is Strange",7,124.99);
        Jogo game2 = new Jogo("Red Dead Redemption",8,27.99);
        Jogo game3 = new Jogo("Red Dead Redemption 2",9,239.99);
        Jogo game4 = new Jogo("Tomb Raider",10,85);
        
        //adicionando os jogos ao arraylist
        ave.add(game);
        ave.add(game1);
        ave.add(game2);
        ave.add(game3);
        ave.add(game4);  
    }
    
    @Override
    public void MostraJogos(){
        
        for(Jogo j : ave) {
            
            System.out.printf("\n  %d                 R$%.2f             %s",j.getCodigo(),j.getPrecoSemanal(),j.getJogo());
        }
    } 
      
    @Override
    public void VerificaCodigo(ArrayList jogos){
        
        for(Jogo j : ave) {
            
            for(int i = 0; i < jogos.size(); i++){
                if(jogos.get(i).equals(j.getCodigo())){
                    System.out.println(j.getJogo());
                    
                    soma += j.getPrecoSemanal();
                }
            }           
        }  
    }

    public ArrayList<Jogo> getAve() {
        return ave;
    }

    public void setAve(ArrayList<Jogo> ave) {
        this.ave = ave;
    }
       
}
