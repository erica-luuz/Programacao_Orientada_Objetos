public class Main {
    public static void main(String[] args) {
        //OperadorDeCorte corte = new OperadorDeCorte(1,"Manuel");
        //corte.trabalhar();
        //System.out.println(corte.getNome());

        Fabrica fabrica = new Fabrica();
        fabrica.adicionarOperador(new OperadorDeCorte(1,"Manuel"));
        fabrica.adicionarOperador(new OperadorDeDobra(2,"Joao"));
        fabrica.adicionarOperador(new OperadorDePrensa(3, "Fagundes"));

        fabrica.iniciarExpediente();
    }
}