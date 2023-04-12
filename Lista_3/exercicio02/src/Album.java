import java.util.ArrayList;

public class Album {
    String nome;
    String nomeArtista;

    ArrayList<Musica> musicas = new ArrayList<>();

    public Musica getMusicaMaiorPopularidade() {
        int maiorPopularidade = 0;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).popularidade > maiorPopularidade) {
                maiorPopularidade = musicas.get(i).popularidade;
                index = 1;
            }
        }
        return musicas.get(index);
    }

    public Musica getMusicaMenorDuracao() {
        int menorDuracao = 0;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).duracaoEmSegundos > menorDuracao) {
                menorDuracao = musicas.get(i).duracaoEmSegundos;
                index = 1;
            }
        }
        return musicas.get(index);
    }
}
