
package locadoradigital;

import java.util.ArrayList;

public class Tiro extends Categoria{
    
    private ArrayList<Jogo> tiros;
    
    public Tiro(){
        
        this.tiros = new ArrayList<>();

        Jogo game = new Jogo("Battlefield",11,199.99);
        Jogo game1 = new Jogo("Call Of Duty: Black Ops II",12,199.90);
        Jogo game2 = new Jogo("Call Of Duty: Modern Warfare",15,229.90);
        Jogo game3 = new Jogo("Doom",13,99.90);
        Jogo game4 = new Jogo("Far Cry",14,179.99);

        
        tiros.add(game);
        tiros.add(game1);
        tiros.add(game2);
        tiros.add(game3);
        tiros.add(game4);
    } 
    
    @Override
    public void MostraJogos(){
        
        for(Jogo j : tiros) {
            
            System.out.printf("\n  %d                 R$%.2f             %s",j.getCodigo(),j.getPrecoSemanal(),j.getJogo());
        }
    } 
    
    @Override
    public void VerificaCodigo(ArrayList jogos){
        
        //percorre o arraylist de jogos
        for(Jogo j : tiros) {
            
            for(int i = 0; i < jogos.size(); i++){ //dentro do arraylist jogos, percorremos o arraylist de jogos do usuário
                if(jogos.get(i).equals(j.getCodigo())){ //compara o código digitado com o código do arraylist
                    System.out.println(j.getJogo()); //mostra o jogo relativo ao código 
                    
                    soma += j.getPrecoSemanal();
                }
            }           
        }
    }

    public ArrayList<Jogo> getTiros() {
        return tiros;
    }

    public void setTiros(ArrayList<Jogo> tiros) {
        this.tiros = tiros;
    }

}
