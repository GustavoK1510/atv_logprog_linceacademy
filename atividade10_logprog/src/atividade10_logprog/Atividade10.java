package atividade10_logprog;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada da quantidade de números
        System.out.print("Quantos números deseja inserir? ");
        int tamanho = sc.nextInt();

        // Criar um array para armazenar os números
        int[] numeros = new int[tamanho];

        // Entrada dos números
        System.out.println("Digite os números:");
        for (int i=0;i<tamanho;i++) {
            numeros[i] = sc.nextInt();
        }

        // Ordenação dos números
        ordenarCrescente(numeros);

        // Exibir resultados
        System.out.print("Números em ordem crescente: ");
        imprimirArray(numeros);

        System.out.print("Números em ordem decrescente: ");
        imprimirArrayInvertido(numeros);

        System.out.println("Maior número: " + numeros[tamanho-1]);
        System.out.println("Menor número: " + numeros[0]);

        int soma=calcularSoma(numeros);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + (double) soma / tamanho);

        int somaPares=calcularSomaPares(numeros);
        int somaImpares=calcularSomaImpares(numeros);

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        sc.close();
    }

    // Método para ordenar os números em ordem crescente
    public static void ordenarCrescente(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca os elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Método para imprimir um array em ordem crescente
    public static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para imprimir um array em ordem decrescente
    public static void imprimirArrayInvertido(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Método para calcular a soma dos números
    public static int calcularSoma(int[] arr) {
        int soma = 0;
        for (int num : arr) {
            soma += num;
        }
        return soma;
    }

    // Método para calcular a soma dos números pares
    public static int calcularSomaPares(int[] arr) {
        int soma = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                soma += num;
            }
        }
        return soma;
    }

    // Método para calcular a soma dos números ímpares
    public static int calcularSomaImpares(int[] arr) {
        int soma = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                soma+=num;
            }
        }
        return soma;
    }
}

