package moves;

import pokemons.Poliwag;
import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove {

    public PoisonJab() {

        super(Type.POISON, 80, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {

        super.applyOppEffects(p);
        if (0.3 > Math.random()) {

            Effect.poison(p);

        }

    }

    @Override
    protected String describe() {

        return "использует ядовитый укол";

    }

}
