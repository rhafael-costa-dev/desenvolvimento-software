package br.edu.up.heranca.modelos;

public class Lion extends Cat {
    public Lion(boolean health) {
        super(health);
    }
    @Override
    public void run() {
        System.out.println("Lion is running!!!");
    }
}
