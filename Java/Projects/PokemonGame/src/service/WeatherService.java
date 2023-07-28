package service;

import model.Pokemon;
import model.TypeEnum;
import model.WeatherConditionEnum;

import java.util.Random;

public class WeatherService {
    public WeatherConditionEnum randomWeather() {
        Random random = new Random();
        int intRandom = random.nextInt(6);
        return switch (intRandom) {
            case 0 -> WeatherConditionEnum.SUNNY;
            case 1 -> WeatherConditionEnum.HOT;
            case 2 -> WeatherConditionEnum.CLOUDY;
            case 3 -> WeatherConditionEnum.RAINY;
            case 4 -> WeatherConditionEnum.THUNDER;
            case 5 -> WeatherConditionEnum.SNOWY;
            default -> null;
        };
    }

    public int weatherEffectToTheDamageOfPokemon(Pokemon pokemon, WeatherConditionEnum weatherCondition) {
        if (pokemon.getType() == TypeEnum.FIRE && weatherCondition.equals(WeatherConditionEnum.HOT)) {
            System.out.println(pokemon.getName() + " 10 hasar arttı.");
            pokemon.setDamage(pokemon.getDamage() + 10);
        } else if (pokemon.getType() == TypeEnum.WATER && weatherCondition.equals(WeatherConditionEnum.RAINY)) {
            System.out.println(pokemon.getName() + " 10 hasar arttı.");
            pokemon.setDamage(pokemon.getDamage() + 10);
        } else if (pokemon.getType() == TypeEnum.GRASS && weatherCondition.equals(WeatherConditionEnum.SUNNY)) {
            System.out.println(pokemon.getName() + " 10 hasar arttı.");
            pokemon.setDamage(pokemon.getDamage() + 10);
        } else if (pokemon.getType() == TypeEnum.ELECTRICITY && weatherCondition.equals(WeatherConditionEnum.CLOUDY)) {
            System.out.println(pokemon.getName() + " 10 hasar arttı.");
            pokemon.setDamage(pokemon.getDamage() + 10);
        } else if (pokemon.getType() == TypeEnum.WING && weatherCondition.equals(WeatherConditionEnum.THUNDER)) {
            System.out.println(pokemon.getName() + " 10 hasar arttı.");
            pokemon.setDamage(pokemon.getDamage() + 10);
        } else if (pokemon.getType() == TypeEnum.EARTH && weatherCondition.equals(WeatherConditionEnum.SNOWY)) {
            System.out.println(pokemon.getName() + " 10 hasar arttı.");
            pokemon.setDamage(pokemon.getDamage() + 10);
        } else {
            System.out.println(pokemon.getName() + " 10 hasar azaldı.");
            pokemon.setDamage(pokemon.getDamage() - 10);
        }
        return 0;
    }
}