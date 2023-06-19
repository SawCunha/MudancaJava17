package br.com.sawcunha.var;

public class VarMain {

    public static void main(String[] args) {

        var base = "Vou repetir";

        System.out.println("\n\nFunção com String: " + repeteString(base, 2));
        System.out.println("\n\nFunção com String: " + repeteStringEIdenta(base, 3));
    }

    private static String repeteString(String base, int vezes) {
        return base.repeat(vezes);
    }

    private static String repeteStringEIdenta(String base, int vezes) {
        var baseRepeat =  base.repeat(vezes);

        return baseRepeat.indent(vezes);
    }

}
