package br.com.sawcunha.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Pessoa {

    private String nome;

}
