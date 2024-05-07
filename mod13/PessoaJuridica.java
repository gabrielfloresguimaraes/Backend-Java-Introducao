package br.com.bielf;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, int idade, String cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    }

    // Getter e setter para CNPJ
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}