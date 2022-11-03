
package locadoradigital;

//Classe onde ficarão guardados os dados do cliente
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private String email;
    private String celular;
    
    public Pessoa() {
        
        this.nome = "";
        this.sobrenome = "";
        this.email = "";
        this.celular = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
