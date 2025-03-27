package atividade1_logprog;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números decimais: ");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		
		if (n1>n2) 
		{
			System.out.println(n1/n2);			
		}
		else 
		{
			System.out.println(n2/n1);
		}
		sc.close();
	}

}
