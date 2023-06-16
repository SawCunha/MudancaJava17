package br.com.sawcunha.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class PessoaFisica extends Pessoa {

    private String cpf;
    private Integer idade;
    private LocalDate dataNascimento;

}
