package edu.dio.java.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class FuncionarioPJ {
    protected String nome;
    protected String documento;
    protected Double valorSalario;
    protected Endereco endereco;
    protected Integer horasTrabalhadas;
    protected Double valorHora;
    protected Double valorRemuneracao;

    public void calculaRemuneracao() {
        this.valorRemuneracao = this.valorHora * this.horasTrabalhadas;
    }
}
