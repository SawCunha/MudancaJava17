package br.com.sawcunha.records;

import br.com.sawcunha.entity.Pessoa;
import br.com.sawcunha.entity.PessoaJuridica;

import java.time.LocalDate;

public class RecordMain {

    public static void main(String[] args) {

        PessoaJuridica pessoaJuridica = PessoaJuridica.builder()
                .cnpj("CNPJ")
                .dataCriacao(LocalDate.now())
                .nomeFantasia("Nome Fantasia")
                .nome("Pessoa Juridica")
                .build();

        PessoaRecordDTO pessoaRecordDTONoBuilder = createPessoaRecordDTONoBuilder(pessoaJuridica);
        PessoaRecordDTO pessoaRecordDTO = createPessoaRecordDTO(pessoaJuridica);

        System.out.println("pessoaRecordDTONoBuilder: " + pessoaRecordDTONoBuilder);
        System.out.println("pessoaRecordDTO: " + pessoaRecordDTO);
    }



    private static PessoaRecordDTO createPessoaRecordDTONoBuilder(PessoaJuridica pessoaJuridica) {
        return new PessoaRecordDTO(
                pessoaJuridica.getNome(),
                null,
                null,
                null,
                pessoaJuridica.getCnpj(),
                pessoaJuridica.getNomeFantasia(),
                pessoaJuridica.getDataCriacao()
        );
    }

    private static PessoaRecordDTO createPessoaRecordDTO(PessoaJuridica pessoaJuridica) {
        return PessoaRecordDTO.builder()
                .cnpj(pessoaJuridica.getCnpj())
                .dataCriacao(pessoaJuridica.getDataCriacao())
                .nomeFantasia(pessoaJuridica.getNomeFantasia())
                .nome(pessoaJuridica.getNome())
                .build();
    }
}
