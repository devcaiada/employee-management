package edu.dio.java.models;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagem) {
        this.valorBonificacao = this.valorSalario * (porcentagem/100d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                ", valorBonificacao =" + valorBonificacao +
                '}';
    }


}
