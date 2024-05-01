package br.com.bielf;

import java.util.Scanner;

public class CalculadoraMediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Verificação das condições
        if (media >= 7) {
            System.out.println("Aluno aprovado! Média: " + media);
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação. Média: " + media);
        } else {
            System.out.println("Aluno reprovado. Média: " + media);
        }

        scanner.close();
    }
}
