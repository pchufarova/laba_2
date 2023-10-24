package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.*;

public class Surskit extends Pokemon {

    public Surskit(String name, int level) {

        super(name, level);
        super.setType(Type.BUG, Type.WATER);
        super.setStats(40, 30, 32, 50, 52, 65);
        Rest rest = new Rest(40, 30, 32, 50, 52, 65);
        IceBeam ib = new IceBeam();
        Confide confide = new Confide();
        super.setMove(ib, rest, confide);

    }

}
