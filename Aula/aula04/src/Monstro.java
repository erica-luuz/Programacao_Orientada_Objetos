public class Monstro {
    private int forca;
    private int pontosDeVida;
    private String arma;

    public Monstro(int forca, int pontosDeVida, String arma){
        this.forca = forca;
        this.pontosDeVida = pontosDeVida;
        this.arma = arma;
    }

    public Monstro(int forca){
        this.forca = forca;
    }
    public int getForca() {
        return this.forca;
    }
    public int getPontosDeVida(){
        return this.pontosDeVida;
    }
    public String getArma(){
        return this.arma;
    }
}

