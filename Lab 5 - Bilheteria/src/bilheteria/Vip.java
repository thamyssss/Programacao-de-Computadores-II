
package bilheteria;

public class Vip extends Ingresso {
    
    double valorAdicional;
    
    public Vip() {
    }

    public Vip(double valorAdicional, double valor) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

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
    
    public double valorIngressoVIP(){
        double total = this.valor + this.valorAdicional;
        return total;
    }    
    
}
