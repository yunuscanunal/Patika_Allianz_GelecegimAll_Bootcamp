package service;

import model.Player;
import model.Pokemon;
import model.WeatherConditionEnum;

import java.util.ArrayList;

public class GameService {

    LoadService loadService = new LoadService();
    ArrayList<Pokemon> pokemonList = loadService.loadPokemons();
    WeatherService weatherService = new WeatherService();

    public void attack(Player attacker, Player defender, boolean isPokeSpecialAttack, boolean isCharSpecialAttack) {
        Pokemon attackingPokemon = attacker.getCharacter().getPokemonList().get(0);
        Pokemon defendingPokemon = defender.getCharacter().getPokemonList().get(0);

        boolean specialAttack = false;
        if (isPokeSpecialAttack && isCharSpecialAttack) {
            specialAttack = attackingPokemon.getSpecialPower().getRemainingRights() > 0
                    && attacker.getCharacter().getSpecialPower().getRemainingRights() > 0;
        } else if (isPokeSpecialAttack) {
            specialAttack = attackingPokemon.getSpecialPower().getRemainingRights() > 0;
        } else if (isCharSpecialAttack) {
            specialAttack = attacker.getCharacter().getSpecialPower().getRemainingRights() > 0;
        }

        int charRemainingRights = attacker.getCharacter().getSpecialPower().getRemainingRights();
        WeatherConditionEnum randomWeatherCondition = weatherService.randomWeather();
        int damage = weatherService.weatherEffectToTheDamageOfPokemon(attackingPokemon, randomWeatherCondition);

        if (specialAttack) {
            if (isPokeSpecialAttack && isCharSpecialAttack) {
                damage += attackingPokemon.specialAttack();
                damage += attacker.getCharacter().getSpecialPower().getExtraDamage();
                attacker.getCharacter().getSpecialPower().setRemainingRights(charRemainingRights - 1);
            } else if (isPokeSpecialAttack) {
                damage += attackingPokemon.specialAttack();
            } else {
                damage += attackingPokemon.getDamage();
                damage += attacker.getCharacter().getSpecialPower().getExtraDamage();
                attacker.getCharacter().getSpecialPower().setRemainingRights(charRemainingRights - 1);
            }
        } else {
            if (isPokeSpecialAttack || isCharSpecialAttack) {
                System.out.println(attacker.getName() + "'s " + attackingPokemon.getName() + " hit " + 0);
            } else {
                damage += attackingPokemon.getDamage();
                System.out.println(attacker.getName() + "'s " + attackingPokemon.getName() + " hit " + damage);
            }
        }
        defendingPokemon.setHealth(defendingPokemon.getHealth() - damage);
        System.out.println(defender.getName() + "'s " +
                defendingPokemon.getName() +
                " health is " +
                defendingPokemon.getHealth());
    }

    public boolean healthCheck(Player player) {

        if (player.getCharacter().getPokemonList().get(0).getHealth() > 0) {
            System.out.println(player.toString());
            System.out.println("Oyun devam ediyor.");

            return true;

        } else {
            System.out.println(player.toString());
            System.out.println(player.getName() +
                    "'s " +
                    player.getCharacter().getPokemonList().get(0).getName() +
                    " oyunu kaybetti.");
            return false;
        }
    }

    public void winnerPlayerFinder(Player player1, Player player2) {
        if (player1.getCharacter().getPokemonList().get(0).getHealth() <= 0){

            player2.getCharacter().getPokemonList().add(player1.getCharacter().getPokemonList().get(0));
            player2.getCharacter().getPokemonList().get(1).setHealth(100);

            player1.getCharacter().getPokemonList().remove(0);
        }else {
            player1.getCharacter().getPokemonList().add(player2.getCharacter().getPokemonList().get(0));
            player1.getCharacter().getPokemonList().get(1).setHealth(100);

            player2.getCharacter().getPokemonList().remove(0);
        }
    }
}