package moves;
import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {

    public Blizzard() {

        super(Type.ICE, 110, 70);

    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {

        super.applySelfDamage(att, damage);

        att.setMod(Stat.HP, (int) Math.round(damage));

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

        return "вызывает метель";
        
    }

}
