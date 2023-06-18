public class Main {
    public static void main(String[] args) {

        Inimigo inimigo1 = new Inimigo();
        inimigo1.nome = "Tripa Seca";
        inimigo1.ataque = 9;

        Inimigo inimigo2 = new Inimigo();
        inimigo2.nome = "Poucas trancas";
        inimigo2.ataque = 8;

        Inimigo inimigo3 = new Inimigo();
        inimigo3.nome = "Quase Nada";
        inimigo3.ataque = 10;

        Mapa mapa = new Mapa();
        mapa.nome = "Mundo 1";
        //mapa.herois.add(heroi1);
        //mapa.herois.add(heroi2);
        mapa.inimigos.add(inimigo1);
        mapa.inimigos.add(inimigo2);
        mapa.inimigos.add(inimigo3);


        Inimigo inimigoDeMaiorAtaque = mapa.getInimigoMaiorAtaque();

        System.out.println(inimigoDeMaiorAtaque.nome);
    }
}