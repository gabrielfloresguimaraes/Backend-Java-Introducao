package br.com.bielf;

// Classe Lapis
public class Lapis {
    private String cor;
    private double tamanho;
    private BorrachaNaPonta borrachaNaPonta;

    // Construtor
    public Lapis(String cor, int tamanho, BorrachaNaPonta borrachaNaPonta) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.borrachaNaPonta = borrachaNaPonta;
    }

    // Método para afiar o lápis
    public void afiar() {
        System.out.println("O lápis está sendo afiado.");
    }

    // Método para desenhar com o lápis
    public void desenhar() {
        System.out.println("O lápis está sendo usado para desenhar.");
    }

    // Getters e setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public BorrachaNaPonta getBorrachaNaPonta() {
        return borrachaNaPonta;
    }

    public void setBorrachaNaPonta(BorrachaNaPonta borrachaNaPonta) {
        this.borrachaNaPonta = borrachaNaPonta;
    }
}
