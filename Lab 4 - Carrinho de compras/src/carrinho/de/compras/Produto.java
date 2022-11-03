
package carrinho.de.compras;

public class Produto {
    
    private String nome;
    private String preço;
    private String código;
    
    public Produto(String nome, String preço, String código) {
        
        this.nome = nome;
        this.preço = preço;
        this.código = código;
    }
    
    @Override
    public String toString() {
        return nome + "\n Preço e código: R$" + preço + código;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreço() {
        return preço;
    }

    public void setPreço(String preço) {
        this.preço = preço;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

}
