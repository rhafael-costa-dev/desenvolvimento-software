package br.edu.up.heranca;

import br.edu.up.heranca.modelos.Equipamento;
import br.edu.up.heranca.modelos.EquipamentoSonoro;

public class Principal {
    public static void main(String[] args) {
        Equipamento e =  new Equipamento();
        e.ligar();
        System.out.println(e);
        e.desligar();
        System.out.println(e);

        EquipamentoSonoro equipamentoSonoro =  new EquipamentoSonoro();
        equipamentoSonoro.ligar();
        equipamentoSonoro.estereo();
        System.out.println(equipamentoSonoro);
        equipamentoSonoro.mono();
        System.out.println(equipamentoSonoro);
        equipamentoSonoro.desligar();
        System.out.println(equipamentoSonoro);
    }
}
