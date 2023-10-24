package pokemons;

import moves.Blizzard;
import moves.IceBeam;
import moves.MudShot;
import moves.Scald;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Politoed extends Poliwhirl {

    public Politoed(String name, int level) {

        super(name, level);
        super.setType(Type.WATER);
        super.setStats(90, 75, 75, 90, 100, 70);
        IceBeam iceBeam = new IceBeam();
        super.addMove(iceBeam);

    }
}
