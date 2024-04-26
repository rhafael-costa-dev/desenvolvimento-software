package br.edu.up.heranca.modelos;

public class EquipamentoSonoro extends Equipamento {
    private Integer volume;
    private Boolean estereo;
    public EquipamentoSonoro() {
        super();
        this.volume = 0;
        this.estereo = false;
    }
    public Integer getVolume() {
        return volume;
    }
    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    public Boolean getEstereo() {
        return estereo;
    }
    public void setEstereo(Boolean estereo) {
        this.estereo = estereo;
    }
    public void mono() {
        this.estereo = false;
    }
    public void estereo() {
        this.estereo = true;
    }
    public void ligar() {
        super.ligar();
        this.volume = 5;
    }

    @Override
    public String toString() {
        return "EquipamentoSonoro{" +
                "ligado=" + getLigado() +
                ", volume=" + volume +
                ", estereo=" + estereo +
                '}';
    }
}
