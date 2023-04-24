public class Heroi {
    private int idHeroi;
    private String nome;
    private int quantidadeDeMoedasDeOuro;
    private Grupo herois, totalMoedasDeOuro;

    public Heroi(){};
    public Heroi(int idHeroi, String nome, int quantidadeDeMoedasDeOuro){
        this.idHeroi = idHeroi;
        this.nome = nome;
        this.quantidadeDeMoedasDeOuro = quantidadeDeMoedasDeOuro;
    }
    public int getIdHeroi() {
        return this.idHeroi;
    }
    public void setIdHeroi(int id) {
        this.idHeroi = idHeroi;
    }

    public  static String getNome() {  //adicionei static para ver se melhora
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeMoedasDeOuro() {
        return this.quantidadeDeMoedasDeOuro;
    }
    public void setQuantidadeDeMoedasDeOuro(int quantidadeDeMoedasDeOuro) {
        this.quantidadeDeMoedasDeOuro = quantidadeDeMoedasDeOuro;
    }
}
