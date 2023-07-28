import model.*;
import model.Character;
import service.GameService;
import service.LoadService;
import service.PlayerService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        LoadService loadService = new LoadService();
        PlayerService playerService = new PlayerService();
        GameService gameService = new GameService();

        // Load characters
        ArrayList<model.Character> characterList = loadService.loadCharacters();
        System.out.println("------Characters------");
        for (Character character : characterList) {
            System.out.println(character.toString());
        }

        // Load Pokemon
        ArrayList<Pokemon> pokemonList = loadService.loadPokemons();
        System.out.println("\n------Pokemon--------");
        for (Pokemon pokemon : pokemonList) {
            System.out.println(pokemon.toString());
        }

        characterList.get(0).getPokemonList().add(pokemonList.get(0));
        characterList.get(1).getPokemonList().add(pokemonList.get(1));

        Player player1 = playerService.createPlayer("Tuğçe", characterList.get(0));
        Player player2 = playerService.createPlayer("Hasan", characterList.get(1));

        gameService.attack(player1, player2, true, true);

        gameService.healthCheck(player2);



    };
}