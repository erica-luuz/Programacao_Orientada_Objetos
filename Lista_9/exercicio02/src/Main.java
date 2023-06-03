public class Main {
    public static void main(String[] args) {
        Liquidificador<Banana>liquidificador = new Liquidificador<>();
        liquidificador.setAlimento(new Banana());
        liquidificador.bater(liquidificador.getAlimento());

    }
}