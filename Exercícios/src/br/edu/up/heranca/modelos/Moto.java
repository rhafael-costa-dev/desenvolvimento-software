package br.edu.up.heranca.modelos;

public class Moto extends Veiculo {
    private Integer bauCarga;
    public Moto(String marca, String modelo, Integer anoFabricacao, Integer bauCarga) {
        super(marca, modelo, anoFabricacao);
        this.bauCarga = bauCarga;
    }
    public Integer getBauCarga() {
        return bauCarga;
    }
    public void setBauCarga(Integer bauCarga) {
        this.bauCarga = bauCarga;
    }
    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", anoFabricacao=" + super.getAnoFabricacao() +
                ", bauCarga=" + this.bauCarga +
                '}';
    }
}
