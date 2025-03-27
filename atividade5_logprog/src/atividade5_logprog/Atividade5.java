package atividade5_logprog;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Solicita os coeficientes da equação ao usuário
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        // Calcula o delta
        double delta = b * b - 4 * a * c;

        // Verifica se delta é negativo (não há raízes reais)
        if (delta < 0) 
        {
            System.out.println("A equação não possui raízes reais.");
        } 
        else 
        {
            // Calcula a raiz quadrada de delta 
            double raizDelta = raizQuadrada(delta);

            // Calcula as raízes de Bhaskara
            double x1 = (-b + raizDelta) / (2 * a);
            double x2 = (-b - raizDelta) / (2 * a);

            System.out.println("As raízes da equação são:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        scanner.close();
    }
	// Método para calcular a raiz quadrada usando o método de Newton
    public static double raizQuadrada(double n) {
        double x = n;
        double y = 1.0;
        double eps = 0.00001; // Precisão desejada
        
        while (x - y > eps) {
            x = (x + y) / 2;
            y = n / x;
        }
        
        return x;
    }
    
}




