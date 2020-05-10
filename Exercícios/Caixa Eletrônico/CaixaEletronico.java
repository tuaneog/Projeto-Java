package getandset;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		
		System.out.print("Digite o nome do usuário: ");
		String nome = teclado.nextLine();
		conta.setNome(nome);
		
		System.out.print("Digite o número da conta: ");
		int nConta = teclado.nextInt();
		conta.setnConta(nConta);
		
		//laço de repetição para interromper apenas quando o usuário pedir
		
		int opcao;
		do {
		
		//o que quer fazer com a conta
		System.out.println();
		System.out.println("[1] Depositar\n[2] Sacar\n[3] Saldo\n[999] Finalizar");
		System.out.print("Escolha uma das opções: ");
		opcao = teclado.nextInt();
		
		if (opcao == 1) {
		System.out.print("Informe o valor de depósito: ");
		int valor = teclado.nextInt();
		conta.depositar(valor);
		conta.mostrarMsg();
		
		} else if (opcao == 2) {
			System.out.print("Informe o valor do saque: ");
			double valor = teclado.nextDouble();
			conta.sacar(valor);
			conta.mostrarMsg();
			
			} else if (opcao == 3) {
				System.out.println("Seu saldo é:R$ " + conta.verificarSaldo());
				conta.mostrarMsg();
				
			} else {
				conta.mostrarMsg();
			}
		
		} while (opcao != 999);
			
	}
	
}
