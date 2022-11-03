
package controle.de.hospedagem;

public class Quarto {
    
    protected String tipoDeQuarto; //foi necessário colocar esse atributo pois ao exibir o arraylist mostrava apenas o local de memória     
    protected double diaria;
    protected int ar;
    protected int banheira;
            
    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public int getBanheira() {
        return banheira;
    }

    public void setBanheira(int banheira) {
        this.banheira = banheira;
    }

    public String getTipoDeQuarto() {
        return tipoDeQuarto;
    }

    public void setTipoDeQuarto(String tipoDeQuarto) {
        this.tipoDeQuarto = tipoDeQuarto;
    }
           
    //método para retornar o tipo de quarto
    @Override
    public String toString() {
        return tipoDeQuarto;
    }
}
