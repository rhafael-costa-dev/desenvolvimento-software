package br.edu.up.heranca.modelos;

public class Carro extends Veiculo {
    private Integer porta;
    public Carro(String marca, String modelo, Integer anoFabricacao, Integer porta) {
        super(marca, modelo, anoFabricacao);
        this.porta = porta;
    }
    public Integer getPorta() {
        return this.porta;
    }
    public void setPorta(Integer porta) {
        this.porta = porta;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", anoFabricacao=" + super.getAnoFabricacao() +
                ", porta=" + this.porta +
                '}';
    }
}
