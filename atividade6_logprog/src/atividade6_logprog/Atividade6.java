package atividade6_logprog;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// pede os valores ao usuário
		System.out.println("Digite o valor do primeiro cateto: ");
		double cateto1 = sc.nextDouble();
		
		System.out.println("Digite o valor do segundo cateto: ");
		double cateto2 = sc.nextDouble();
		
		double somacat = (cateto1*cateto1)+(cateto2*cateto2);
		
		 double hipotenusa = raizQuadrada(somacat);

	        // Exibe o resultado
	        System.out.println("O valor da hipotenusa é: " + hipotenusa);

	        sc.close();
	}
	        // método da raiz quadrada
		public static double raizQuadrada(double num) {
	        double x = num;
	        double y = 1.0;
	        double eps = 0.00001; // Quanto menor, mais preciso
	        
	        while (x - y > eps) {
	            x = (x + y) / 2;
	            y = num / x;
	        }
	        
	        return x;

	}

}
