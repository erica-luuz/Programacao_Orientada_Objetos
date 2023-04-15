import java.util.ArrayList;

public class Heroi {
    private int quantidadeDeHabilidade;
    private ArrayList<Arma>arma;
    private int pontoDeVida;
    private int forca;
    private String categoria;

    public Heroi(int quantidadeDeHabilidade, int pontoDeVida, int forca, String categoria){
        this.quantidadeDeHabilidade = quantidadeDeHabilidade;
        this.pontoDeVida = pontoDeVida;
        this.forca = forca;
        this.categoria = categoria;
    }
}

// posso ter varios construtores em uma classe.
