public class Main {
    public static void main(String[] args) {
        Heroi lolo = new Heroi(01,"Lorito",10);
        System.out.println(lolo.getNome());

        Grupo neve = new Grupo();

        neve.adicionarHeroi(new Heroi(01,"Cyborg",10));
        neve.adicionarHeroi(new Heroi(02,"Superman",10));
        neve.adicionarHeroi(new Heroi(03,"Flash",10));
        neve.adicionarHeroi(new Heroi(04,"Homem-aranha",10));

    }
}
