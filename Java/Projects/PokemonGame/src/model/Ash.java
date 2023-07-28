package model;

import java.util.ArrayList;

public class Ash extends Character{
    public Ash(String name, SpecialPower specialPower, ArrayList<Pokemon> pokemonList) {
        super(name, specialPower, pokemonList);
    }
    public Ash(String name, SpecialPower specialPower) {
        super(name, specialPower);
    }
}
