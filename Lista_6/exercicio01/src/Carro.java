public class Carro extends Veiculo{
    public Carro() {}

    public Carro(int id, int velocidadeMaxima, int precisaoEmCurvas) {
        super(id, velocidadeMaxima, precisaoEmCurvas);
    }

    @Override
    public void utilizarHabilidadeEspecial() {
        System.out.println("Carro fechou o adversário de trás");
    }
}
