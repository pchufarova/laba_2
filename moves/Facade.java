package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    private Pokemon self_pokemon;

    public Facade(Pokemon s) {

        super(Type.NORMAL, 70, 100);
        self_pokemon = s;

    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {

        if (self_pokemon.getCondition() == Status.BURN || self_pokemon.getCondition() == Status.POISON || self_pokemon.getCondition() == Status.PARALYZE) {

            super.power = 140;

        }

        super.applyOppDamage(def, damage);
        super.power = 70;

    }

    @Override
    protected String describe() {

        return "мужественно атакует";

    }
}
