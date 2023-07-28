package service;

import model.Character;
import model.Player;

import java.util.Random;

public class PlayerService {


    public Player createPlayer(String name, Character character) {
        return new Player(name, character);
    }
}
