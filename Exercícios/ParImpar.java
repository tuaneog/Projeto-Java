package exercicios;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número: ");
		numero = teclado.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número digitado é par");
		} else {
			System.out.println("O número digitado é impar");
		}
		
	}
	
	
}
