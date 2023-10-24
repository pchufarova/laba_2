package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    private double baseHP;
    private double baseATT;
    private double baseDEF;
    private double baseSPATT;
    private double baseSPDEF;
    private double baseSPEED;

    public Rest(double hp, double att, double def, double spAtt, double spDef, double speed) {

        super();
        baseHP = hp;
        baseATT = att;
        baseDEF = def;
        baseSPATT = spAtt;
        baseSPDEF = spDef;
        baseSPEED = speed;


    }

    @Override
    protected void applySelfEffects(Pokemon p) {

        super.applySelfEffects(p);
        Effect sleep2 = new Effect().condition(Status.SLEEP).turns(2);
        p.setCondition(sleep2);
        p.setStats(baseHP, baseATT, baseDEF, baseSPATT, baseSPDEF, baseSPEED);
        System.out.println(p.toString() + " восстанавливает здоровье!");

    }

    @Override
    protected String describe() {

        return "решает отдохнуть";

    }

}
