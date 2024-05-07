import br.com.bielf.PessoaFisica;
import br.com.bielf.PessoaJuridica;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Fernando", 35, "123.456.789-10");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa Top", 5, "12.345.678/0001-99");

        System.out.println("Nome da Pessoa Física: " + pessoaFisica.getNome());
        System.out.println("CPF da Pessoa Física: " + pessoaFisica.getCpf());

        System.out.println("Nome da Pessoa Jurídica: " + pessoaJuridica.getNome());
        System.out.println("CNPJ da Pessoa Jurídica: " + pessoaJuridica.getCnpj());
    }
}