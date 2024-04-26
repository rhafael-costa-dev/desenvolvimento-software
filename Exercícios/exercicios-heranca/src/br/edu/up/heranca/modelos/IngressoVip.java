package br.edu.up.heranca.modelos;

public class IngressoVip extends Ingresso {
    private Double valorAdicional;
    public IngressoVip(Double valor, Double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }
    public Double getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        var novoValor =  getValor() + this.valorAdicional;
        return "IngressoVip{" +
                "valor=" + novoValor +
                '}';
    }
}
