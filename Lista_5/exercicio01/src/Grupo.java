import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi> herois;
    private int totalMoedasDeOuro;

    public Grupo() {
        this.herois = new ArrayList<>();
    }
    public void adicionarHeroi(Heroi heroi){
        for (int i = 0; i <herois.size(); i++){
            if(herois.get(i).getId() == heroi.getId()){
                System.out.println("O herói já está no grupo");
                return;
            }
        }
        this.herois.add(heroi);
        this.totalMoedasDeOuro = this.totalMoedasDeOuro + heroi.getQuantidadeDeMoedasDeOuro();
        System.out.println("O heroi " + heroi.getNome() + " Foi adicionado ao grupo!");
    }

    public void removerHeroi(int idHeroi){
        for (int i = 0; i < herois.size(); i++) {
            if(herois.get(i).getId() == idHeroi){
                this.totalMoedasDeOuro = this.totalMoedasDeOuro - herois.get(i).getQuantidadeDeMoedasDeOuro();
                System.out.println("O heroi " + herois.get(i).getNome() + " foi removido do grupo!");
                herois.remove(i);
                return;
            }
        }
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
