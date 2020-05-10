package exercicios;

import java.util.Scanner;

public class ExerciciosTiposPrimitivos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2, n3;
		int soma;
		System.out.println("Digite um número: ");
		n1 = teclado.nextInt();
		System.out.println("Digite outro número: ");
		n2 = teclado.nextInt();
		System.out.println("Digite mais um número: ");
		n3 = teclado.nextInt();
		soma = n1 + n2 + n3;
			System.out.println("A soma dos números digitados foi " + soma);
	}


}
