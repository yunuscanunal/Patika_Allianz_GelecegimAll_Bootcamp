import model.*;
import model.Character;
import service.GameService;
import service.LoadService;
import service.PlayerService;
import service.WeatherService;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LoadService loadService = new LoadService();
        PlayerService playerService = new PlayerService();
        GameService gameService = new GameService();
        WeatherService weatherService = new WeatherService();
        ArrayList<Character> characterList = loadService.loadCharacters();
        ArrayList<Pokemon> pokemonList = loadService.loadPokemons();


        System.out.println("Welcome to Pokemon Game");
        System.out.println("Select character for Player 1");
        int charCounter = 1;
        for (Character character:characterList
        ) {
            System.out.println(charCounter +"-"+ character.getName());
            charCounter++;
        };
        int player1Choice = input.nextInt();
        System.out.println("Select character for Player 2");
        int charCounter2 = 1;
        for (Character character:characterList
        ) {
            System.out.println(charCounter2 +"-"+ character.getName());
            charCounter2++;
        };
        int player2Choice = input.nextInt();
        WeatherConditionEnum weatherConditionEnum = weatherService.randomWeather();
        System.out.println("Weather is " + weatherConditionEnum + "!\n");
        System.out.println("Select Pokemon for Player 1");
        int pokemonCount = 1;
        for (Pokemon pokemon:pokemonList
        ) {
            System.out.println(pokemonCount+"-"+pokemon.getName());
            pokemonCount++;
        }
        int pokemon1Choice = input.nextInt();

        System.out.println("Select Pokemon for Player 2");
        int pokemonCount2 = 1;
        for (Pokemon pokemon:pokemonList
        ) {
            System.out.println(pokemonCount2+"-"+pokemon.getName());
            pokemonCount2++;
        }
        int pokemon2Choice = input.nextInt();

        characterList.get(player1Choice-1).getPokemonList().add(pokemonList.get(pokemon1Choice-1));
        characterList.get(player2Choice-1).getPokemonList().add(pokemonList.get(pokemon2Choice-1));
        input.nextLine();


        Player player1 = playerService.createPlayer("player1",characterList.get(player1Choice-1));

        Player player2 = playerService.createPlayer("player2",characterList.get(player2Choice-1));


        Random rand = new Random();
        int randomStarter = rand.nextInt(3);
        if (randomStarter == 0){
            System.out.println(player1.getName()+" will start the game.");
        }else {
            System.out.println(player2.getName()+" will start the game.");
        }


        int round = 0;
        for (int i=0;i<2;i++){
            round++;

            System.out.println("========================");
            System.out.println("Round "+round+" beginning!");
            System.out.println("========================");
            while((player1.getCharacter().getPokemonList().size() > 1 ||
                    player2.getCharacter().getPokemonList().size() > 1 ||
                    (player1.getCharacter().getPokemonList().get(0).getHealth()>0
                            && player2.getCharacter().getPokemonList().get(0).getHealth()>0))) {

                if (randomStarter == 0 || randomStarter > 2) {

                    if (player1.getCharacter().getPokemonList().get(0).getHealth() > 0 ||
                            player1.getCharacter().getPokemonList().size() > 1) {

                        if (player1.getCharacter().getPokemonList().get(0).getHealth() <= 0 &&
                                player1.getCharacter().getPokemonList().size() > 1) {
                            player1.getCharacter().getPokemonList().remove(0);
                        }

                        System.out.println(player1.getName() + " choose your attack.");
                        System.out.println("""
                                1- Normal attack
                                2- Pokemon special attack
                                3- Character Special Attack
                                4- Pokemon & Character Special Attack""");
                        int player1AttackChoice = input.nextInt();

                        switch (player1AttackChoice) {
                            case 1 -> {
                                gameService.attack(player1, player2, false, false);
                                gameService.healthCheck(player2);
                            }
                            case 2 -> {
                                gameService.attack(player1, player2, true, false);
                                gameService.healthCheck(player2);
                            }
                            case 3 -> {
                                gameService.attack(player1, player2, false, true);
                                gameService.healthCheck(player2);
                            }
                            case 4 -> {
                                gameService.attack(player1, player2, true, true);
                                gameService.healthCheck(player2);
                            }
                        }
                    }
                    randomStarter = 3;
                }
                if (randomStarter == 1 || randomStarter > 2) {

                    if (player2.getCharacter().getPokemonList().get(0).getHealth() > 0 ||
                            player2.getCharacter().getPokemonList().size() > 1) {

                        if (player2.getCharacter().getPokemonList().get(0).getHealth() <= 0 &&
                                player2.getCharacter().getPokemonList().size() > 1) {
                            player2.getCharacter().getPokemonList().remove(0);
                        }

                        System.out.println(player2.getName() + " choose your attack.");
                        System.out.println("1- Normal attack\n2- Pokemon special attack\n3- Character Special Attack\n" +
                                "4- Pokemon & Character Special Attack");
                        int player2AttackChoice = input.nextInt();


                        switch (player2AttackChoice) {
                            case 1 -> {
                                gameService.attack(player2, player1, false, false);
                                gameService.healthCheck(player1);
                            }
                            case 2 -> {
                                gameService.attack(player2, player1, true, false);
                                gameService.healthCheck(player1);
                            }
                            case 3 -> {
                                gameService.attack(player2, player1, false, true);
                                gameService.healthCheck(player1);
                            }
                            case 4 -> {
                                gameService.attack(player2, player1, true, true);
                                gameService.healthCheck(player1);
                            }
                        }
                    }
                    randomStarter = 3;
                }
            }
            gameService.winnerPlayerFinder(player1,player2);
        }
        System.out.println("Game Over!");
    }
}