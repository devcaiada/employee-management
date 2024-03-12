package edu.dio.java.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class FuncionarioCLT {

    protected String nome;
    protected String documento;
    protected Double valorSalario;
    protected Endereco endereco;


    public FuncionarioCLT(String nome, String documento, Double valorSalario, Endereco endereco) {
    }

    public FuncionarioCLT() {}
}
