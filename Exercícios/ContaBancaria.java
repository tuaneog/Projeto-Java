package exercicios;

import java.util.Scanner;

public class ContaBancaria {
	
	//metodo de entrada
	Scanner teclado = new Scanner(System.in);
	
	//declarando os atributos
	int numeroDaConta;
	String titular;
	double saldo;
	
	//criar um construtor para conta
	public ContaBancaria(int _numeroDaConta, String _titular, double _saldo) {
		numeroDaConta = _numeroDaConta;
		titular = _titular;
		saldo = _saldo;
		
	}
	
	//criando os m�todos
	
	public void saldo() {
		System.out.printf("Seu saldo atual � de:R$ %.2f\n", saldo);
	
	}
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("Saldo dispon�vel para saque.");
			System.out.printf("Seu novo saldo � de:R$ %.2f\n", saldo);
		} else {
			System.out.println("Saldo indispon�vel para saque.");
		} 
		
	}
	public void depositar(double valor) {
		System.out.printf("Deposito no valor de:R$ %.2f\n", valor);
		if (valor != 0) {
			saldo = saldo + valor;
			System.out.printf("Seu novo saldo � de:R$ %.2f", saldo);
		}

	}
	
	
}
