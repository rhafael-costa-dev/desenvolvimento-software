package br.edu.up.heranca;

import br.edu.up.heranca.modelos.Ingresso;
import br.edu.up.heranca.modelos.IngressoVip;

public class PrincipalIngresso {
    public static void main(String[] args) {
        Ingresso ingresso =  new Ingresso(200.00);
        Ingresso ingressoVip = new IngressoVip(200.00, 80.00);
        IngressoVip vip = new IngressoVip(200.00, 100.00);

        System.out.println(ingresso);
        System.out.println(ingressoVip);
        System.out.println(vip);
    }
}
