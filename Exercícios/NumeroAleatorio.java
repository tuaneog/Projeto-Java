package exercicios;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class NumeroAleatorio {
	public static void main(String[] args) throws InterruptedException {
		
		//número aleatório
		int numeroaleatorio = (int) (1 + Math.random() * (11 - 1));
		System.out.println("Vou pensar em um número... Tente adivinhar");
		
		//tempo de espera até o próximo comando
		TimeUnit.SECONDS.sleep(1);
		
		//perguntando ao usuário qual o número o computador gerou
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("De 1 a 10 qual foi o número que eu pensei? ");
		numero = teclado.nextInt();
		
		//condição para a resposta
		if (numero == numeroaleatorio) {
			System.out.println("Parabéns! Você acertou.");
		} else {
			System.out.println("Você errou! Eu pensei no número " + numeroaleatorio);
		}
	}

}
