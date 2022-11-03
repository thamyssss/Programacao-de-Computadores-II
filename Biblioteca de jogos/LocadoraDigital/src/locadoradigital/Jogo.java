
package locadoradigital;

//essa classe guarda o nome dos jogos e o código de cada um
public class Jogo {
    
    private String jogo;
    private int codigo;
    private double precoOriginal;
    private double precoSemanal;
    
    public Jogo(String jogo, int codigo, double precoOriginal){
        
        this.jogo = jogo;
        this.codigo = codigo;
        this.precoOriginal = precoOriginal;
        this.precoSemanal = 0.05*precoOriginal;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecoOriginal() {
        return precoOriginal;
    }

    public void setPrecoOriginal(double precoOriginal) {
        this.precoOriginal = precoOriginal;
    }

    public double getPrecoSemanal() {
        return precoSemanal;
    }

    public void setPrecoSemanal(double precoSemanal) {
        this.precoSemanal = precoSemanal;
    }
}
