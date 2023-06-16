package br.com.sawcunha.records;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record PessoaRecordDTO(
        String nome,
        String cpf,
        Integer idade,
        LocalDate dataNascimento,
        String cnpj,
        String nomeFantasia,
        LocalDate dataCriacao
) { }