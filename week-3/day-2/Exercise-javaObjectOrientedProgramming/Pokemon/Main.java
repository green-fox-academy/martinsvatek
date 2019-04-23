package Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pokemon> pokemonOfAsh = initializePokemons();

        Pokemon wildPokemon = new Pokemon("Oddish", "electric", "water");

        // Which pokemon should Ash use?

        if (choosePokemon(wildPokemon, pokemonOfAsh).name == null){
            System.out.println("You don't have any pokemon effective against " + wildPokemon.type);
        } else {
            System.out.print("I choose you, " + choosePokemon(wildPokemon, pokemonOfAsh).name + "! ATTACK!!!! ");
        }
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }

    public static Pokemon choosePokemon(Pokemon enemy, List<Pokemon> Pokemons) {
        for (Pokemon pokemon: Pokemons) {
            if(pokemon.effectiveAgainst == enemy.type){
                return pokemon;
            }
        }
        Pokemon zero = new Pokemon(null, null, null);
        return zero;
    }
}