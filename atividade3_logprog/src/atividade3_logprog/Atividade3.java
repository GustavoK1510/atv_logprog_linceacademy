package atividade3_logprog;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Pede dois números ao usuário
		System.out.println("Digite dois números inteiros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		// faz a subtração
		int sub = n1-n2;
		// Mostra os resultados
		if (sub<0)
		{
			int sub2 = sub*-1;
			System.out.println(sub2);
		}
		
		else
		{
			System.out.println(sub);
		}
		
		sc.close();
	}

}
