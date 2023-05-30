import java.util.HashMap;
import java.util.Map;

public class Pokedex {
    private Map<String, Pokemon> pokemons = new HashMap<>();
    public void adicionarPokemon(Pokemon pokemon){
        String coddigoIdentificador = pokemon.getCodigoIdentificador();
        this.pokemons.put(coddigoIdentificador, pokemon);
        System.out.println(pokemon.getNome() + " Adicionado com sucesso!!");
    }

    public Map<String, Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Map<String, Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
