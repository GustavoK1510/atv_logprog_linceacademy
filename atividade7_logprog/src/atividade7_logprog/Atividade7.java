package atividade7_logprog;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Entrada do número decimal
        System.out.print("Digite um número decimal: ");
        double n = sc.nextDouble();

        // Verifica se o número é menor que 0
        if (n<0) {
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            // Calcula o fatorial do número inteiro anterior
            long fatorialInt=calcFatorial((int)n);

            // Aproximação para fatoriais de decimais
            double fatorialAproximado = fatorialInt * aproxFatorial(n);

            // Exibe o resultado
            System.out.println("O fatorial aproximado de " + n + " é: " + fatorialAproximado);
        }

        sc.close();
    }

    // Método para calcular o fatorial de um número inteiro
    public static long calcFatorial(int num) {
        long resultado=1;
        for (int i=2;i<=num;i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Aproximação para valores decimais usando interpolação linear
    public static double aproxFatorial(double num) {
        double parteDecimal=num-(int)num;
        return 1+parteDecimal*0.5; // Ajuste aproximado baseado na interpolação
    }

	}
