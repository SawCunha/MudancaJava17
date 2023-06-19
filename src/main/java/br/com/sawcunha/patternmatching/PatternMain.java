package br.com.sawcunha.patternmatching;

import br.com.sawcunha.entity.Pessoa;
import br.com.sawcunha.entity.PessoaFisica;
import br.com.sawcunha.entity.PessoaJuridica;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PatternMain {

    public static void main(String[] args) {
        Pessoa pessoa1 = PessoaJuridica.builder()
                .cnpj("CNPJ")
                .dataCriacao(LocalDate.now())
                .nomeFantasia("Nome Fantasia")
                .nome("Pessoa Juridica")
                .build();

        Pessoa pessoa2 = PessoaFisica.builder()
                .cpf("CPF")
                .dataNascimento(LocalDate.now())
                .idade(88)
                .nome("Pessoa Juridica")
                .build();

        System.out.println("Primeira forma de obter: " + getTaxIdentifierByMethodOld(pessoa1));
        System.out.println("Segunda forma de obter: " + getTaxIdentifierByIf(pessoa2));
        System.out.println("Terceira forma de obter: " + getTaxIdentifierBySwitch(pessoa1));
        System.out.println("Terceira forma de obter: " + getTaxIdentifierBySwitch(pessoa2));

        System.out.printf("""
                        
                Hoje e um fim de semana: %s
                        
                """, isFreeDay());
    }

    private static String getTaxIdentifierByMethodOld(Pessoa pessoa) {
        if(pessoa instanceof PessoaFisica) {
            return ((PessoaFisica) pessoa).getCpf();
        }
        return ((PessoaJuridica) pessoa).getCnpj();
    }

    private static String getTaxIdentifierByIf(Pessoa pessoa) {
        if(pessoa instanceof PessoaFisica pessoaFisica) {
            return pessoaFisica.getCpf();
        }
        return ((PessoaJuridica) pessoa).getCnpj();
    }

    private static String getTaxIdentifierBySwitch(Pessoa pessoa) {
        return switch (pessoa) {
            case PessoaFisica pessoaFisica -> pessoaFisica.getCpf();
            case PessoaJuridica pessoaJuridica -> pessoaJuridica.getCnpj();
            default -> "";
        };
    }

    private static String isFreeDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        boolean freeDay = switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
            case SATURDAY, SUNDAY -> true;
        };

        return freeDay ? "SIM" : "NAO";
    }

}
