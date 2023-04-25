import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi> herois;
    private int totalMoedasDeOuro;

    public Grupo() {
        this.herois = new ArrayList<>();
    }
    public void adicionarHeroi(Heroi heroi){
        this.herois.add(heroi);
        this.totalMoedasDeOuro = this.totalMoedasDeOuro + heroi.getQuantidadeDeMoedasDeOuro();
        System.out.println("O heroi " + heroi.getNome() + " Foi adicionado ao grupo!");
        System.out.println("O total de moedas do Grupo é R$ " + getTotalMoedasDeOuro());
    }
    public void removerHeroi(int idHeroi){

    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }

    public int getTotalMoedasDeOuro() {
        return totalMoedasDeOuro;
    }

    public void setTotalMoedasDeOuro(int totalMoedasDeOuro) {
        this.totalMoedasDeOuro = totalMoedasDeOuro;
    }
}
