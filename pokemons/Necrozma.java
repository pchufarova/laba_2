package pokemons;
import moves.Facade;
import moves.Flamethrower;
import moves.PoisonJab;
import moves.Steamroller;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Necrozma extends Pokemon {

    public Necrozma(String name, int level) {

        super(name, level);
        super.setType(Type.PSYCHIC);
        super.setStats(97, 107, 101, 127, 89, 79);

        Facade facade = new Facade(this);
        PoisonJab pj = new PoisonJab();
        Steamroller steamroller = new Steamroller();
        Flamethrower flamethrower = new Flamethrower();

        super.setMove(facade, pj, steamroller, flamethrower);

    }

}
