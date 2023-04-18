import java.util.ArrayList;

public class Mapa {
    private String nome;
    private int altura;
    private int largura;
    private ArrayList<Inimigo> inimigos = new ArrayList<>();
    private ArrayList<Heroi>herois = new ArrayList<>();

    public Mapa(){}

    public Mapa(String nome, int altura, int largura, ArrayList<Inimigo>inimigos, ArrayList herois){
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
        this.<Inimigo>inimigos = inimigos;
        this.<Heroi>herois = herois;
    }
    public String getNome() {
        return this.nome;
    }
    public int getAltura() {
        return this.altura;
    }
    public int getLargura() {
        return this.largura;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }

}
// erros na linha 16,17
//