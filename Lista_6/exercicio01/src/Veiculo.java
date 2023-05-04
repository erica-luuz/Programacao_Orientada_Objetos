public abstract class Veiculo {
    //Atributos
    private int id;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private int precisaoEmCurvas;
    private Boolean estaComfarolLigado;
    //Metodos Construtores

    public Veiculo() {}

    public Veiculo(int id, int velocidadeMaxima, int precisaoEmCurvas) {
        this.id = id;
        this.velocidadeMaxima = velocidadeMaxima;
        this.precisaoEmCurvas = precisaoEmCurvas;
    }
    //Metodos Comuns
    public void acelerar(){

    }
    public void desacelerar(){

    }
    public void ligarFarol(){

    }
    //Metodos abstratos
    //abstract void utilizarHabilidadeEspecial();
    public abstract void utilizarHabilidadeEspecial();
}
