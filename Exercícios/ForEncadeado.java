package exercicios;

import java.util.Scanner;

public class ForEncadeado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n = teclado.nextInt();
		
		int atual;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				atual = j * i;
				System.out.print(" " + atual);	
			}
			System.out.println();
				
		}
			
	}
}


