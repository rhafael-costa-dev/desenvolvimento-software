package br.edu.up.heranca.modelos;

public class Caminhonete extends Carro {
    private Integer litros;
    public Caminhonete(String marca, String modelo, Integer anoFabricacao, Integer porta, Integer litros) {
        super(marca, modelo, anoFabricacao, porta);
        this.litros = litros;
    }
    public Integer getLitros() {
        return litros;
    }
    public void setLitros(Integer litros) {
        this.litros = litros;
    }
    @Override
    public String toString() {
        return "Caminhonete{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", anoFabricacao=" + super.getAnoFabricacao() +
                ", porta=" + super.getPorta() +
                ", litros=" + this.litros +
                '}';
    }
}
