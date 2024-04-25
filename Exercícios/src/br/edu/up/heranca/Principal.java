package br.edu.up.heranca;

import br.edu.up.heranca.modelos.Caminhonete;
import br.edu.up.heranca.modelos.Carro;
import br.edu.up.heranca.modelos.Moto;
import br.edu.up.heranca.modelos.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Dogde", "RAM", 2021, 2);
        Veiculo veiculo =  new Carro("Fiat", "Argo", 2022, 4);
        Moto minhaMoto = new Moto("Honda", "CG 150", 2020, 5);
        Veiculo meuVeiculo = new Moto("Yamaha", "YBR", 2020, 5);

        Veiculo caminhonete3 = new Caminhonete("GM", "S10", 2024, 2, 100 );
        Carro caminhonete2 = new Caminhonete("Toyota", "Hilux", 2024, 2, 100 );
        Caminhonete caminhonete1 = new Caminhonete("Ford", "Ranger", 2024, 2, 100 );

//        System.out.println(meuCarro);
//        System.out.println(veiculo);
//        System.out.println(minhaMoto);
//        System.out.println(meuVeiculo);

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(meuVeiculo);
        veiculos.add(meuCarro);
        veiculos.add(minhaMoto);
        veiculos.add(veiculo);

        veiculos.add(caminhonete1);
        veiculos.add(caminhonete2);
        veiculos.add(caminhonete3);

        for (Veiculo v: veiculos) {
            if (v instanceof Moto) {
                System.out.println("Minha " + v.getClass().getSimpleName() +" é: " + v.getModelo());
                continue;
            }
            System.out.println(v);
        }


    }
}
