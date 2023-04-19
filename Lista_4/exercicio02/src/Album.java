import java.util.ArrayList;

public class Album {
    private String nome;
    private String nomeArtista;

    private ArrayList<Musica> musicas = new ArrayList<>();
    public Album(){}
    public Album(String nome, String nomeArtista, ArrayList musicas){
        this.nome = nome;
        this.nomeArtista = nomeArtista;
        this.musicas = musicas;
    }
    public String getNome(){
        return this.nome;
    }
    public String getNomeArtista(){
        return this.nomeArtista;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public ArrayList<Musica> getMusicas() {
        return this.musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }
}
