
package controle.de.hospedagem;

public class QuartoIndividual extends Quarto {
    
    public QuartoIndividual() {

        this.tipoDeQuarto = "Quarto individual simples"; 
        this.diaria = 119.90; //valor da diária em reais
        
        //indicadores de ar condicionado e banheira - 1-possui / 0-não possui
        this.ar = 0; 
        this.banheira = 0;          
    } 
}
