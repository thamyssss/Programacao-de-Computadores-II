
package controle.de.hospedagem;

public class Cliente {
    
    private String nome;
    private String endereço;
    private long cpf;
    private long celular;
    private long telefone;
    private String email;
    
    //construtor
    public Cliente() {
        
        this.nome = "";
        this.endereço = "";
        this.cpf = 0;
        this.celular = 0;
        this.telefone = 0;
        this.email = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
