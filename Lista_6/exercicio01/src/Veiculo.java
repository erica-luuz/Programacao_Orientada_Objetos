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
        this.setVelocidadeAtual(getVelocidadeAtual() + 5);
        System.out.println("Você esta acelerando! " + this.getVelocidadeAtual() + " KM");
    }
    public void desacelerar(){
        this.setVelocidadeAtual(getVelocidadeAtual() - 5);
        System.out.println("Você esta desacelerando!! " + this.getVelocidadeAtual() + " Km");
    }
    public void ligarFarol(Boolean estaComfarolLigado){
        if (estaComfarolLigado){
            this.setEstaComfarolLigado(estaComfarolLigado);
            System.out.println("Farol ligado!!!");
        }else {
            System.out.println("O farol esta desligado!!!");
        }

    }
    //Metodos abstratos
    //abstract void utilizarHabilidadeEspecial();
    public abstract void utilizarHabilidadeEspecial();

    //Metodos Especiais

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getPrecisaoEmCurvas() {
        return precisaoEmCurvas;
    }

    public void setPrecisaoEmCurvas(int precisaoEmCurvas) {
        this.precisaoEmCurvas = precisaoEmCurvas;
    }

    public Boolean getEstaComfarolLigado() {
        return estaComfarolLigado;
    }

    public void setEstaComfarolLigado(Boolean estaComfarolLigado) {
        this.estaComfarolLigado = estaComfarolLigado;
    }
}
