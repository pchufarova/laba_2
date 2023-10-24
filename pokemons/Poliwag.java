package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwag extends Pokemon {

    public Poliwag(String name, int level) {

        super(name, level);
        super.setType(Type.WATER);
        super.setStats(40, 50, 40, 40, 40, 90);

        Blizzard blizzard = new Blizzard();
        Scald scald = new Scald();
        super.setMove(blizzard, scald);

    }

}
