
package controle.de.hospedagem;

public class QuartoCasalPlus extends Quarto {
    
    public QuartoCasalPlus(){
        
        this.tipoDeQuarto = "Quarto de casal plus"; 
        this.diaria = 239.90; //valor da diária em reais
        
        //indicadores de ar condicionado e banheira - 1-possui / 0-não possui
        this.ar = 1; 
        this.banheira = 1; 
    }
}
