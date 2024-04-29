package br.com.bielf;
/**
 * Crie um programa que faça a leitura de 4 notas.
 * Divida por 4 e obtenha a média de cada uma.
 */
public class Media {
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    // Construtor
    public Media(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    // Método para calcular a média das notas
    public double calcularMedia() {
        double soma = nota1 + nota2 + nota3 + nota4;
        return soma / 4;
    }

    public static void main(String[] args) {
        double nota1 = 6.5;
        double nota2 = 7;
        double nota3 = 8;
        double nota4 = 9.75;

        Media media = new Media(nota1, nota2, nota3, nota4);
        double mediaFinal = media.calcularMedia();

        System.out.println("Média das notas: " + mediaFinal);
    }
}
