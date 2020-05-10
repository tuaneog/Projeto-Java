package getandset;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		
		System.out.print("Digite o nome do usu�rio: ");
		String nome = teclado.nextLine();
		conta.setNome(nome);
		
		System.out.print("Digite o n�mero da conta: ");
		int nConta = teclado.nextInt();
		conta.setnConta(nConta);
		
		//la�o de repeti��o para interromper apenas quando o usu�rio pedir
		
		int opcao;
		do {
		
		//o que quer fazer com a conta
		System.out.println();
		System.out.println("[1] Depositar\n[2] Sacar\n[3] Saldo\n[999] Finalizar");
		System.out.print("Escolha uma das op��es: ");
		opcao = teclado.nextInt();
		
		if (opcao == 1) {
		System.out.print("Informe o valor de dep�sito: ");
		int valor = teclado.nextInt();
		conta.depositar(valor);
		conta.mostrarMsg();
		
		} else if (opcao == 2) {
			System.out.print("Informe o valor do saque: ");
			double valor = teclado.nextDouble();
			conta.sacar(valor);
			conta.mostrarMsg();
			
			} else if (opcao == 3) {
				System.out.println("Seu saldo �:R$ " + conta.verificarSaldo());
				conta.mostrarMsg();
				
			} else {
				conta.mostrarMsg();
			}
		
		} while (opcao != 999);
			
	}
	
}
