package atividade4_logprog;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	// pede os números decimais para o usuário
        System.out.print("Digite o primeiro número decimal: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número decimal: ");
        double n2 = scanner.nextDouble();

        // Determinar o fator para transformar os números em inteiros
        int fator = calcularFator(n1, n2);
        
        // Transformar os números para inteiros
        int intNum1 = (int) (n1 * fator);
        int intNum2 = (int) (n2 * fator);

        // Calcular o MMC dos números inteiros
        int mmcInteiro = calcularMMC(intNum1, intNum2);

        // Converter de volta para decimal
        double mmcDecimal = (double) mmcInteiro / fator;

        // Exibir resultado
        System.out.println("O menor múltiplo comum (MMC) é: " + mmcDecimal);

        scanner.close();
    }

    // Método para calcular o maior fator de casas decimais
    public static int calcularFator(double a, double b) {
        int fatorA = contarCasasDecimais(a);
        int fatorB = contarCasasDecimais(b);
        return (int) Math.pow(10, Math.max(fatorA, fatorB));
    }

    // Método para contar quantas casas decimais um número tem
    public static int contarCasasDecimais(double num) {
        String numStr = Double.toString(num);
        int index = numStr.indexOf(".");
        return (index < 0) ? 0 : numStr.length() - index - 1;
    }

    // Método para calcular o MMC usando o MDC 
    public static int calcularMMC(int a, int b) {
        return (a * b) / calcularMDC(a, b);
    }

    // Método para calcular o MDC 
    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

}


