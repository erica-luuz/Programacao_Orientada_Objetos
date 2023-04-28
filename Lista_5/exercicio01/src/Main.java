
public class Main {
    public static void main(String[] args) {

        Grupo grupo = new Grupo();

        grupo.adicionarHeroi(new Heroi(02, "Cyborg", 10));
        grupo.adicionarHeroi(new Heroi(05, "Homem-aranha", 10));
        grupo.adicionarHeroi(new Heroi(06, "Superman", 10)); 
        grupo.adicionarHeroi(new Heroi(02, "Félix",15));
        grupo.removerHeroi(06);

        System.out.println("O total de moedas do Grupo é R$ " + grupo.getTotalMoedasDeOuro());

    }
}
