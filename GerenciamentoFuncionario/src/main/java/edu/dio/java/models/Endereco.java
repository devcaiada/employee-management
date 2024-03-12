package edu.dio.java.models;

import lombok.Getter;


@Getter
public class Endereco {
    private String rua;
    private String complemento;
    private String bairro;

    public Endereco(String rua, String complemento, String bairro) {
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
    }
}
