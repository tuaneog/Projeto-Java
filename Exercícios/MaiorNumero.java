package exercicios;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Digite um n�mero: ");
		n1 = teclado.nextInt();
		System.out.println("Digite outro n�mero: ");
		n2 = teclado.nextInt();
		
		if (n1 > n2) {
			System.out.printf("%d � maior que d%\n", n1, n2);
		} else if (n2 > n1) {
			System.out.printf("%d � maior que %d\n", n2, n1);
		} else {
			System.out.println("Os n�meros s�o iguais");
		}
	}

}
