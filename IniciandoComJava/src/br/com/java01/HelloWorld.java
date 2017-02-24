package br.com.java01;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
		
			String nome;
			
			System.out.println("HelloWorld");
			System.out.println("Como você se chama?");
			nome = sc.nextLine();
			System.out.println("Olá "+ nome +" Como vai você? ");
			
}
}