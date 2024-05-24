package br.com.bielf;

// Classe abstrata base para todos os carros
public abstract class Carro {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos getters e setters (ou outros métodos comuns)
    // ...

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}