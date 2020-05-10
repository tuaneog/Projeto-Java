package exercicios;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class NumeroAleatorio {
	public static void main(String[] args) throws InterruptedException {
		
		//n�mero aleat�rio
		int numeroaleatorio = (int) (1 + Math.random() * (11 - 1));
		System.out.println("Vou pensar em um n�mero... Tente adivinhar");
		
		//tempo de espera at� o pr�ximo comando
		TimeUnit.SECONDS.sleep(1);
		
		//perguntando ao usu�rio qual o n�mero o computador gerou
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("De 1 a 10 qual foi o n�mero que eu pensei? ");
		numero = teclado.nextInt();
		
		//condi��o para a resposta
		if (numero == numeroaleatorio) {
			System.out.println("Parab�ns! Voc� acertou.");
		} else {
			System.out.println("Voc� errou! Eu pensei no n�mero " + numeroaleatorio);
		}
	}

}
