package br.edu.up.heranca.modelos;

public class Cat {
    private boolean health;
    public Cat(boolean health) {
        this.health = health;
    }
    public boolean isHealth() {
        return health;
    }
    public void run() {
        System.out.println("Cat is running!!!");
    }
}
