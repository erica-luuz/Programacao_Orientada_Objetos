import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi> herois;
    private int totalMoedasDeOuro;


    public Grupo(){
        this.herois = new ArrayList<>();
    }

    public void adicionarHeroi(Heroi heroi){
        for (int i = 0; i < herois.size(); i++){
            if (herois.get(i).getNome() == Heroi.getNome()){
                System.out.println("Heroi ja cadastrado");
            } else {
                this.herois.add(heroi);
                this.totalMoedasDeOuro = this.totalMoedasDeOuro + heroi.getQuantidadeDeMoedasDeOuro();
                System.out.println("O herói " + heroi.getNome() + ", foi adicionaso ao grupo!");
            }
        }
    }

    public void removerHeroi( int idHeroi, Heroi heroi){ //terminar esse metodo
        for (int i = 0; i < herois.size(); i++){
            if (herois.get(i).getIdHeroi() == idHeroi){
                this.totalMoedasDeOuro = this.totalMoedasDeOuro - herois.get(i).getQuantidadeDeMoedasDeOuro();
                System.out.println("O herói " + heroi.getNome() + "foi removido do grupo");
            }
        }
    }

    public ArrayList<Heroi> getHerois() {
        return this.herois;
    }
    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }

    public int getTotalMoedasDeOuro() {
        return this.totalMoedasDeOuro;
    }

    public void setTotalMoedasDeOuro(int totalMoedasDeOuro) {
        this.totalMoedasDeOuro = totalMoedasDeOuro;
    }
}
