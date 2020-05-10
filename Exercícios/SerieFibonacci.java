package exercicios;

import java.util.Scanner;

public class SerieFibonacci {
	public static void main(String[] args) {
		
		//serie de Fibonacci
		
		Scanner teclado = new Scanner(System.in);
		int ant = 1;
		int antAnt = 0;
		int n;
		String expressao = "";
		System.out.print("Digite um número: ");
		n = teclado.nextInt();
		
		for(int i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print(antAnt);
			} else if (i == 1) {
				System.out.print(" - " +ant);
				
			} else {
				System.out.print(" - " + (ant + antAnt));
				ant = (ant + antAnt);
				antAnt = (ant - antAnt);

			}
			
			
		}
		
		
		
	}

}
