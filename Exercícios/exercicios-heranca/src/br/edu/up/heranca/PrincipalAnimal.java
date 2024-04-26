package br.edu.up.heranca;

import br.edu.up.heranca.modelos.Animal;
import br.edu.up.heranca.modelos.Cachorro;
import br.edu.up.heranca.modelos.Gato;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Animal animal =  new Animal();
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        animal.emitirSom();
        gato.emitirSom();
        cachorro.emitirSom();
    }
}
