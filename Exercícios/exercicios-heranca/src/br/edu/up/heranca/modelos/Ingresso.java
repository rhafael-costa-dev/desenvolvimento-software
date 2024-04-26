package br.edu.up.heranca.modelos;

public class Ingresso {
    private Double valor;
    public Ingresso(Double valor) {
        this.valor = valor;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Ingresso{" +
                "valor=" + valor +
                '}';
    }
}
