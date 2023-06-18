public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.nome = "Imensurável";
        musica1.duracaoEmSegundos = 373;
        musica1.popularidade = 10;
        musica1.genero = "Gospel";

        Musica musica2 = new Musica();
        musica2.nome = "Depois da Cruz";
        musica2.duracaoEmSegundos = 293;
        musica2.popularidade = 5;
        musica2.genero = "Gospel";

        Musica musica3 = new Musica();
        musica3.nome = "Autor da Vida";
        musica3.duracaoEmSegundos = 296;
        musica3.popularidade = 1;
        musica3.genero = "Gospel";

        Album album = new Album();
        album.nome = "Imensurável";
        album.nomeArtista = "Aline Barros";
        album.musicas.add(musica1);
        album.musicas.add(musica2);
        album.musicas.add(musica3);

        Musica musicaMaiorPopularidade = album.getMusicaMaiorPopularidade();
        Musica musicaMenorDuracao = album.getMusicaMenorDuracao();

        System.out.println("A música com a maior popularidade é: " + musicaMaiorPopularidade.nome);
        System.out.println("A música com a menor duração em segundos é: " + musicaMenorDuracao.nome);
    }
}
