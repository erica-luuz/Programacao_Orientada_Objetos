public class Moto extends Veiculo{
    public Moto() {}

    public Moto(int id, int velocidadeMaxima, int precisaoEmCurvas) {
        super(id, velocidadeMaxima, precisaoEmCurvas);
    }

    @Override
    public void utilizarHabilidadeEspecial() {
        System.out.println("Moto ultrapassou o adversário a frente");
    }




}
