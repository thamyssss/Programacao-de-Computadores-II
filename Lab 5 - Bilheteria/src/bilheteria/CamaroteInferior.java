
package bilheteria;

public class CamaroteInferior extends Vip {
    
    public CamaroteInferior() {
    }

    public CamaroteInferior(double valorAdicional, double valor) {
        super(valorAdicional, valor);
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
        double total = this.valorAdicional + this.valor;
        System.out.print("O valor do ingresso camarote inferior é R$"+total+"\n");
    }
}
