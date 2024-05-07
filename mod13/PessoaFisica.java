package br.com.bielf;

// Subclasse PessoaFisica
public class PessoaFisica extends Pessoa {
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }

    // Getter e setter para CPF
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
