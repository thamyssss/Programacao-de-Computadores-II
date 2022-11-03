
package bilheteria;

public class Normal extends Ingresso {
    
    public Normal() {
    }

    public Normal(double valor) {
        super(valor);
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double ingressoNormal(){
        return this.valor;
    }
}
