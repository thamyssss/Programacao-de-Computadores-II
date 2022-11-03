
package locadoradigital;

import java.util.ArrayList;

public class Terror extends Categoria{
    
    private  ArrayList<Jogo> terror;
    
    public Terror(){
        
        this.terror = new ArrayList<>();
        
        //Instanciando os objetos do arraylist
        Jogo game = new Jogo("Amnesia",1,37.99);
        Jogo game1 = new Jogo("Amnesia 2",2,57.99);
        Jogo game2 = new Jogo("Bruxa de Blair",3,56.99);
        Jogo game3 = new Jogo("Outlast",4,37.99);
        Jogo game4 = new Jogo("Outlast 2",5,57.99);
        
        //adicionando os jogos ao arraylist
        terror.add(game);
        terror.add(game1);
        terror.add(game2);
        terror.add(game3);
        terror.add(game4);  
    }
       
    @Override
    public void MostraJogos(){   
        
        for(Jogo j : terror) {
            
            System.out.printf("\n  %d                 R$%.2f             %s",j.getCodigo(),j.getPrecoSemanal(),j.getJogo());
        } 
    }
    
    @Override
    public void VerificaCodigo(ArrayList jogos){ 
            
        for(Jogo j : terror) {
            
            for(int i = 0; i < jogos.size(); i++){
                if(jogos.get(i).equals(j.getCodigo())){
                    System.out.println(j.getJogo());
                    
                    soma += j.getPrecoSemanal();
                }
            }           
        } 
    }

    public ArrayList<Jogo> getTerror() {
        return terror;
    }

    public void setTerror(ArrayList<Jogo> terror) {
        this.terror = terror;
    }
}
