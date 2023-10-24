package moves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {

    public Confide() {

        super();

    }

    @Override
    protected void applyOppEffects(Pokemon p) {

        super.applyOppEffects(p);

        Effect lowerspAtt = new Effect().stat(Stat.SPECIAL_ATTACK, -1);

    }

    @Override
    protected String describe() {

        return "использует секретную атаку";

    }
}
