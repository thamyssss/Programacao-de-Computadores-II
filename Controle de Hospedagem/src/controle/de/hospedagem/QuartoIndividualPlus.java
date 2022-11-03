
package controle.de.hospedagem;

public class QuartoIndividualPlus extends Quarto {
    
    public QuartoIndividualPlus() {
                
        this.tipoDeQuarto = "Quarto individual plus"; 
        this.diaria = 159.90; //valor da diária em reais
        
        //indicadores de ar condicionado e banheira - 1-possui / 0-não possui
        this.ar = 1; 
        this.banheira = 1; 
    }
}
