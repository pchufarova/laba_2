package moves;

import ru.ifmo.se.pokemon.*;

public class MudShot extends SpecialMove {

    public MudShot() {

        super(Type.GROUND, 55, 95);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {

        super.applyOppEffects(p);

        Effect lowerspeed = new Effect().stat(Stat.SPEED, -1);

    }

    @Override
    protected String describe() {

        return "стреляет грязью";

    }

}
