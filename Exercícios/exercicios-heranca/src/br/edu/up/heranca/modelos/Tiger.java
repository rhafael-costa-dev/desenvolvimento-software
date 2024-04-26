package br.edu.up.heranca.modelos;

public class Tiger extends Cat {
    public Tiger(boolean health) {
        super(health);
    }
    @Override
    public void run() {
        System.out.println("Tiger is running!!!");
    }
}
