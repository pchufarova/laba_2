package moves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {

    public IceBeam() {

        super(Type.ICE, 90, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {

        super.applyOppEffects(p);

        if (0.1 > Math.random()) {

            Effect.freeze(p);

        }

    }

    @Override
    protected String describe() {

        return "ударяет ледяным лучом";

    }
}
