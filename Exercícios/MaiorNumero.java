package exercicios;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Digite um número: ");
		n1 = teclado.nextInt();
		System.out.println("Digite outro número: ");
		n2 = teclado.nextInt();
		
		if (n1 > n2) {
			System.out.printf("%d é maior que d%\n", n1, n2);
		} else if (n2 > n1) {
			System.out.printf("%d é maior que %d\n", n2, n1);
		} else {
			System.out.println("Os números são iguais");
		}
	}

}
