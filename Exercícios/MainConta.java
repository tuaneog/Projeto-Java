package exercicios;

import java.util.Scanner;

public class MainConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o n�mero da conta: ");
		int n = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o nome do Titular: ");
		String t = teclado.nextLine();
		ContaBancaria conta = new ContaBancaria(n, t, 1500);

		//op��es
		System.out.println("[1] Sacar\n[2] Depositar\n[3]Saldo");
		System.out.println("Escolha uma das op��es: ");
		int opcao = teclado.nextInt();
		
		//saque
		if (opcao == 1) {
			System.out.println("Quanto voc� deseja sacar? ");
			double valor = teclado.nextDouble();
			conta.sacar(valor);
			
		//deposito
		} else if (opcao == 2) {
			System.out.println("Quanto voc� deseja depositar? ");
			double valor = teclado.nextDouble();
			conta.depositar(valor);
		} else if (opcao == 3) {
			conta.saldo();
			
		}
	
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
	}

}
