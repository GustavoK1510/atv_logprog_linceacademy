package atividade8_logprog;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Pede um número ao usuário
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		//Exibe a tabuada
		System.out.println("A tabuada desse número é: ");
		int i = 1;
		while(i<10)
		{
			System.out.println(n + " x " + i + " = " + n*i);
			i++;
		}
		sc.close();
	}

}
