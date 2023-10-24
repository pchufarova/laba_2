package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.*;

public class Masquerain extends Surskit {

    public Masquerain(String name, int level) {

        super(name, level);
        super.setType(Type.BUG, Type.FLYING);
        super.setStats(70,60, 62, 100, 82, 80);
        Rest rest = new Rest(70, 60, 62, 100, 82, 80);
        AerialAce aerialAce = new AerialAce();

        super.addMove(rest);
        super.addMove(aerialAce);

    }

}
