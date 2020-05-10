package exercicios;

import java.util.Scanner;

public class Fatoriais {
	public static void main(String[] args) {
		
		//imprimir o fatorial de um número!
		
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println("Digite um número para calcular o fatorial: ");
		n = teclado.nextInt();
		
		long resultado = 1;
		String expressao = "";
		for(int i = n; i >= 1; i--) {
			resultado *= i;
			if (i == 1) {
				expressao += Integer.toString(i) + " = ";
				
			} else {
				expressao += Integer.toString(i) + " x ";
			}
		}
		System.out.println(n + "! = "  + expressao + resultado);
		
	}
}
