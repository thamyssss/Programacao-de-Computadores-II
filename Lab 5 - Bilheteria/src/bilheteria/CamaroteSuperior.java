
package bilheteria;

public class CamaroteSuperior extends Vip {
    
    double taxaAdicional;

    public CamaroteSuperior(double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    public CamaroteSuperior(double taxaAdicional, double valorAdicional, double valor) {
        super(valorAdicional, valor);
        this.taxaAdicional = taxaAdicional;
    }

    public double getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public double getValorAdicional() {
        return valorAdicional;
    }

    @Override
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void valorDoIngresso(){
        double total = this.taxaAdicional+this.valorAdicional+this.valor;
        System.out.print("O valor do ingresso camarote superior é R$"+ total +"\n");
    }   
}
