package edu.dio.java;

import edu.dio.java.models.Endereco;
import edu.dio.java.models.Gerente;
import edu.dio.java.models.OperadorCaixa;
import edu.dio.java.models.Vendedor;


public class Main {
    public static void main(String[] args) {

        Endereco endereco =
                new Endereco("Rua Osíris",
                        "Comercial",
                        "Monte Olimpo");


        // Object Vendedor
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Caio Arruda");
        vendedor.setDocumento("123.456.789-10");
        vendedor.setEndereco(endereco);
        vendedor.setValorSalario(1360d);

        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("------");

        // Object OperadorCaixa
        OperadorCaixa operadorCaixa =new OperadorCaixa();
        operadorCaixa.setNome("Kazuo");
        operadorCaixa.setDocumento("789.456.123-00");
        operadorCaixa.setEndereco(endereco);
        operadorCaixa.setValorSalario(1665d);
        System.out.println(operadorCaixa);
        System.out.println("------");

        // Object Gerente
        Gerente gerente = new Gerente();
        gerente.setNome("Sylvestre");
        gerente.setDocumento("159.753.456.00");
        gerente.setEndereco(endereco);
        gerente.setValorSalario(1320d);
        gerente.setValorHora(18.5);
        gerente.setHorasTrabalhadas(176);
        gerente.setValorBonificacao(650d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

        System.out.println(gerente);
        System.out.println("------");

    }
}