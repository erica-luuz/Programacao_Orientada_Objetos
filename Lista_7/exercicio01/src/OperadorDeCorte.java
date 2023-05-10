public class OperadorDeCorte implements Operario {
   private int id;
    private String nome;

    public OperadorDeCorte() {}

    public OperadorDeCorte(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void trabalhar() {
        System.out.println("corta, corta, corta...");

    }
}
