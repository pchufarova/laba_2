import pokemons.Poliwag;
import ru.ifmo.se.pokemon.Battle;
import pokemons.*;

public class Main {

    public static void main(String[] args) {

        Battle b = new Battle();
        Masquerain masquerain = new Masquerain("Сакура", 10);
        Poliwag poliwag = new Poliwag("Шикамару", 10);
        Necrozma necrozma = new Necrozma("Саске", 10);
        Politoed politoed = new Politoed("Наруто", 10);
        Poliwhirl poliwhirl = new Poliwhirl("Чоджи", 10);
        Surskit surskit = new Surskit("Ино", 10);
        b.addAlly(masquerain);
        b.addAlly(necrozma);
        b.addAlly(politoed);
        b.addFoe(poliwag);
        b.addFoe(poliwhirl);
        b.addFoe(surskit);
        b.go();

    }

}