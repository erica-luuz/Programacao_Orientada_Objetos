import java.util.ArrayList;

public class Mapa {
    private String nome;
    private int altura;
    private int largura;
    private ArrayList<Inimigo> inimigos = new ArrayList<>();
    private ArrayList<Heroi> herois = new ArrayList<>();

    public Mapa(){}

    public Mapa(String nome, int altura, int largura, ArrayList<Inimigo> inimigos, ArrayList<Heroi> herois){
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
        this.inimigos = inimigos;
        this.herois = herois;
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

    public ArrayList<Inimigo> getInimigos() {
        return inimigos;
    }

    public void setInimigos(ArrayList<Inimigo> inimigos) {
        this.inimigos = inimigos;
    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }
}

//public ArrayList<String> getHerois() {
//        return herois;
//    }
//
//    public void setAcessorios(ArrayList<String> acessorios) {
//        this.acessorios = acessorios;
//    }