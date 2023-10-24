package moves;

import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {

    public Flamethrower() {

        super(Type.FIRE, 90, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {

        super.applyOppEffects(p);
        if (0.1 > Math.random()) {

            Effect.burn(p);

        }

    }

    @Override
    protected String describe() {

        return "мечет огнём";

    }
}
