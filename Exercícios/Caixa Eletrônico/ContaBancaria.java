package getandset;

public class ContaBancaria {
	
	private String nome;
	private int nConta;
	double saldo;
	
	public void mostrarMsg() {
		System.out.println();
		System.out.println("*** Dados da Conta ***");
		System.out.println("Titular: " + getNome());
		System.out.println("Conta: " + getnConta());
		System.out.printf("Saldo:R$ %.2f\n", verificarSaldo());
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getnConta() {
		return nConta;
	}

	public void setnConta(int nConta) {
		this.nConta = nConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double verificarSaldo() {
		return saldo;
	}
	
	public 	double depositar(double valor) {
		return saldo += valor;
	}
	
	public void sacar(double valor) {
		if (saldo < valor) {
			System.out.println("Saldo insuficiente");
			
		} else {
			saldo -= valor;
		}		
	}
	

}
