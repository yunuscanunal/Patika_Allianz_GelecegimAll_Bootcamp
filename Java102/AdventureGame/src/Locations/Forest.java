package Locations;
import Players.*;
import Obstacles.*;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "Wood", 3, 4);
    }
}
