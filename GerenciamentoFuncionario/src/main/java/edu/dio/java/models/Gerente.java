package edu.dio.java.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gerente extends FuncionarioPJ implements CalculaBonificacao {

    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagem) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagem/100)) + 100d;

    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", valorRemuneracao=" + valorRemuneracao +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }


}
