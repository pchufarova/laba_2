package pokemons;

import moves.Blizzard;
import moves.MudShot;
import moves.Scald;
import ru.ifmo.se.pokemon.Type;

public class Poliwhirl extends Poliwag {

    public Poliwhirl(String name, int level) {

        super(name, level);
        super.setType(Type.WATER);
        super.setStats(65, 65, 65, 50, 50, 90);
        MudShot mudShot = new MudShot();
        super.addMove(mudShot);

    }
}
