package br.com.sawcunha.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public sealed class Pessoa permits PessoaFisica, PessoaJuridica {

    private String nome;

}
