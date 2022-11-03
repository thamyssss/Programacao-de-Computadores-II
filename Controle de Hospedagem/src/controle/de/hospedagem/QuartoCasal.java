
package controle.de.hospedagem;

public class QuartoCasal extends Quarto {   
    
    public QuartoCasal() {
        
        this.tipoDeQuarto = "Quarto de casal simples";
        this.diaria = 179.90; //valor da diária em reais
        
        //indicadores de ar condicionado e banheira - 1-possui / 0-não possui
        this.ar = 0;
        this.banheira = 0;       
    }
}
