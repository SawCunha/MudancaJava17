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
) {
    public PessoaRecordDTO(String nome) {
        this(nome, null, null, null, null, null, null);
    }

    public PessoaRecordDTO(String nome, String cpf, Integer idade, LocalDate dataNascimento) {
        this(nome, cpf, idade, dataNascimento, null, null, null);
    }

    public PessoaRecordDTO(String nome, String cnpj, String nomeFantasia, LocalDate dataCriacao) {
        this(nome, null, null, null, cnpj, nomeFantasia, dataCriacao);
    }
}