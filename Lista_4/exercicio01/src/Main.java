public class Main {
    public static void main(String[] args) {
        Inimigo monstro = new Inimigo("Tripa seca", 10, 8, 10);
        System.out.println("Nome do inimigo: " + monstro.getNome() + ". Pontos de ataque: " + monstro.getAtaque());

        Heroi heroi = new Heroi("Principe",9, 10, 10);
        System.out.println("Nome do Heroi: " + heroi.getNome() + ". Pontos de ataque: " + heroi.getAtaque());

    }
}