public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        pokedex.adicionarPokemon(new Pokemon("1","Venusaur","Pig"));
        pokedex.adicionarPokemon(new Pokemon("2", "squirtle", "Grow"));
        pokedex.adicionarPokemon(new Pokemon("3","Venon", "Black"));
    }
}