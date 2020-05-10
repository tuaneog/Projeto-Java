package exercicios;

import java.util.Scanner;

public class MudandoValorX {
	public static void main(String[] args) {
		
		//mudando o valor de x, caso x seja par ou impar
		
		//definindo um valor para x
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um valor para x: ");
		int x = teclado.nextInt();
		
		//criando o lado de repetição enquanto x != 1
		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
				
			} else if (x % 2 != 0) {
				x = 3 * x + 1;

			} else if (x == 1) {
				break;
			}
		
			System.out.print(x);
			if (x != 1) {
				System.out.print(" - ");
			}
		}
		
	}
}
	
