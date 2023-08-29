package Locations;
import Players.*;
import Obstacles.*;

public class River extends BattleLocation {
    public River(Player player) {
        super(player, "River", new Bear(), "Water", 2, 5);
    }
}
