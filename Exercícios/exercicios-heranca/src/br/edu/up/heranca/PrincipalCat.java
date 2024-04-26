package br.edu.up.heranca;

import br.edu.up.heranca.modelos.*;

public class PrincipalCat {
    public static void main(String[] args) {
        Cat lion = new Lion(true);
        Cat tiger = new Tiger(true);
        Cat cheetah = new Cheetah(false);

        DoLittle.health(lion);
        DoLittle.health(tiger);
        DoLittle.health(cheetah);
    }
}
