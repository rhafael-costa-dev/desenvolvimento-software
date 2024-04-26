package br.edu.up.heranca.modelos;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class DoLittle {

    private static List<Lion> leoes;

    public List<Lion> getLeoes() {
        leoes = new ArrayList<>();
        leoes.add(new Lion(true));
        leoes.add(new Lion(true));
        leoes.add(new Lion(true));
        leoes.add(new Lion(true));
        leoes.add(new Lion(true));


        return leoes;
    }
    public static void health(Cat cat) {
        if (cat.isHealth()) {
            cat.run();
            return;
        }
        System.out.println("This CAT is unHealth!");
    }

}
