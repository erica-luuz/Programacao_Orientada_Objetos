public class Liquidificador<T extends Alimento>{
    private T alimento;
    public void bater(T alimento){
        System.out.println("O alimento foi batido");
    }

    public T getAlimento() {
        return alimento;
    }

    public void setAlimento(T alimento) {
        this.alimento = alimento;
    }
}
