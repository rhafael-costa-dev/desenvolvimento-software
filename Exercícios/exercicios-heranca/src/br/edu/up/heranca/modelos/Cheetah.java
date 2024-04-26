package br.edu.up.heranca.modelos;

public class Cheetah extends Cat {
    public Cheetah(boolean health) {
        super(health);
    }
    @Override
    public void run() {
        System.out.println("Cheetah is running!!!");
    }
}
