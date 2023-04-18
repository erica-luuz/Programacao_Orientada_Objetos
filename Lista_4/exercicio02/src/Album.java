import java.util.ArrayList;

public class Album {
    private String nome;
    private String nomeArtista;

    private ArrayList<Musica> musicas = new ArrayList<>();
    public Album(){}
    public Album(String nome, String nomeArtista, ArrayList<Musica>musicas){
        this.nome = nome;
        this.nomeArtista = nomeArtista;
        this.<Musica>musicas = Musica;
    }
    public String getNome(){
        return this.nome;
    }
    public int getNomeArtista(){
        return this.nomeArtista;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }
}
