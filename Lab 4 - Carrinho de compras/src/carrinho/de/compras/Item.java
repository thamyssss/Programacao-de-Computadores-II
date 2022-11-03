/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrinho.de.compras;

public class Item {
    
    public int quantidade;
    public double preço;
    public double total;
    
    public Item() {

        this.quantidade = 0;
        this.preço = 0;
        this.total = 0;
}
    
    public double CalculaValor(){
        total = quantidade*preço;
        return total;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    
}
