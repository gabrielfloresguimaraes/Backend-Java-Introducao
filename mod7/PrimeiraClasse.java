package br.com.bielf;

// Classe Principal para teste
public class PrimeiraClasse {
    public static void main(String[] args) {
        // Criando um lápis
        Lapis meuLapis = new Lapis("azul", 15, BorrachaNaPonta.COM_BORRACHA);

        // Utilizando o lápis
        System.out.println("Cor do lápis: " + meuLapis.getCor());
        System.out.println("Tamanho do lápis: " + meuLapis.getTamanho() + " cm");
        System.out.println("Tem borracha na ponta? " + (meuLapis.getBorrachaNaPonta() == BorrachaNaPonta.COM_BORRACHA ? "Sim" : "Não"));
        meuLapis.afiar();
        meuLapis.desenhar();
    }
}