public class Heroi {
    private String nome;
    private int ataque;
    private int defesa;
    private int pontos;

    public Heroi(){}

    public Heroi(String nome, int ataque, int defesa, int pontos){
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.pontos = pontos;
    }

    public String getNome() {
        return this.nome;
    }
    public int getAtaque() {
        return this.ataque;
    }
    public int getDefesa() {
        return this.defesa;
    }
    public int getPontos() {
        return this.pontos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}

