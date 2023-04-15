import java.util.ArrayList;

public class Arma {
    private String nomeTipoAtaque;
     private String nomeTipoDefesa;
    private int forcaAtaque;
    private int forcaDefesa;

    public Arma(String nomeTipoAtaque, int forcaAtaque, String nomeTipoDefesa, int forcaDefesa){
        this.nomeTipoAtaque = nomeTipoAtaque;
        this.forcaAtaque = forcaAtaque;
        this.nomeTipoDefesa = nomeTipoDefesa;
        this.forcaDefesa = forcaDefesa;
    }

}
