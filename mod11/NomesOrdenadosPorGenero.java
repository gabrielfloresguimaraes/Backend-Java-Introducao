package br.com.bielf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NomesOrdenadosPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes (digite 'fim' para encerrar):");

        List<String> listaNomes = new ArrayList<>();
        String nome;

        do {
            nome = scanner.nextLine();
            if (!nome.equalsIgnoreCase("fim")) {
                listaNomes.add(nome);
            }
        } while (!nome.equalsIgnoreCase("fim"));

        // Ordenar os nomes em ordem alfabética
        listaNomes.sort(String::compareToIgnoreCase);

        // Separar por gênero
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        for (String nomeAtual : listaNomes) {
            System.out.println("Digite o gênero (M/F) para " + nomeAtual + ":");
            String genero = scanner.nextLine().toUpperCase();

            if (genero.equals("M")) {
                masculinos.add(nomeAtual);
            } else if (genero.equals("F")) {
                femininos.add(nomeAtual);
            } else {
                System.out.println("Gênero inválido. Ignorando " + nomeAtual);
            }
        }

        // Exibir os resultados
        System.out.println("\nNomes masculinos:");
        masculinos.forEach(System.out::println);

        System.out.println("\nNomes femininos:");
        femininos.forEach(System.out::println);
    }
}
