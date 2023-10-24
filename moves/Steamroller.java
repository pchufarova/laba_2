package moves;

import ru.ifmo.se.pokemon.*;

public class Steamroller extends PhysicalMove {

    public Steamroller() {

        super(Type.BUG, 65, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {

        super.applyOppEffects(p);

        if (0.3 > Math.random()) {

            Effect.flinch(p);

        }

    }

    @Override
    protected String describe() {

        return "использует паровой каток";

    }
}
