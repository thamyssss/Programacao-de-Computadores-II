
package carrinho.de.compras;

public class Fatura {

   private double total = 0;
    
   public Fatura() {
        
        this.total = 0;
    }
    
    public void calculaTotal(){
        
        Item item[] = new Item[3];
        
        for(int i=0; i<3; i++) {
            
            item[i] = new Item();
        }   
        
        for(int x = 0; x < 3; x++) {
            
            total += item[x].CalculaValor();
            
            System.out.println(+total);
        }
        
        System.out.println("O valor total a pagar é de R$"+getTotal());
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
