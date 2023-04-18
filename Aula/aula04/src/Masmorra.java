public class Masmorra {
    private int quantidadeDeCenario;
    private String nomeDeCenario;
    private boolean armadilhas;
    private int quantidadeDeArmadilhas;


    public Masmorra(int quantidadeDeCenario, String nomeDeCenario, boolean armadilhas, int quantidadeDeArmadilhas){
        this.quantidadeDeCenario = quantidadeDeCenario;
        this.nomeDeCenario = nomeDeCenario;
        this.armadilhas = armadilhas;
        this.quantidadeDeArmadilhas = quantidadeDeArmadilhas;
    }

    public int getQuantidadeDeCenario() {
        return this.quantidadeDeCenario;
    }
    public int getQuantidadeDeArmadilhas() {
        return this.quantidadeDeArmadilhas;
    }
    public String getNomeDeCenario(){
        return this.nomeDeCenario;
    }
    public boolean getArmadilhas(){
        return this.armadilhas;
    }
}
