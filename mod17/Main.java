import br.com.bielf.Carro;
import br.com.bielf.Civic;
import br.com.bielf.Honda;
import br.com.bielf.Toyota;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Criando uma lista genérica de carros
        List<Carro> listaCarros = new ArrayList<>();

        // Adicionando carros à lista
        listaCarros.add(new Honda("Fit"));
        listaCarros.add(new Civic());
        listaCarros.add(new Toyota("Toyota", "Corolla"));

        // Iterando e exibindo os carros
        for (Carro carro : listaCarros) {
            System.out.println(carro);
        }
    }
}