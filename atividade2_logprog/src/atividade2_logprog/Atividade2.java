package atividade2_logprog;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 5 números inteiros: ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		
		if (n1%2!=0) 
		{
			System.out.println(n1);			
		}
		
		if (n2%2!=0) 
		{
			System.out.println(n2);			
		}
		
		if (n3%2!=0) 
		{
			System.out.println(n3);			
		}
		
		if (n4%2!=0) 
		{
			System.out.println(n4);			
		}
		
		if (n5%2!=0) 
		{
			System.out.println(n5);			
		}
		
		sc.close();
	}

}
