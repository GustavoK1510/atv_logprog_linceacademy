package atividade1_logprog;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Pede dois números ao usuário
		System.out.println("Digite dois números decimais: ");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		// se n1 for maior que n2, faz a divisão entre eles
		if (n1>n2) 
		{
			System.out.println(n1/n2);			
		}
		else // e aqui é o outro caso
		{
			System.out.println(n2/n1);
		}
		sc.close();
	}

}
