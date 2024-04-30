package br.com.bielf;

public class ConversaoCasting {
    public static void main(String[] args) {
        // Valor inteiro definido diretamente
        int valorInteiro = 42;

        // Converte o valor inteiro para o tipo wrapper Integer
        Integer valorWrapper = Integer.valueOf(valorInteiro);

        // Imprime os valores
        System.out.println("Valor inteiro: " + valorInteiro);
        System.out.println("Valor wrapper: " + valorWrapper);
    }
}
