package exercicios;


public class BalancoTrimestral {
	public static void main(String[] args) {		
		int gastosjan = 15000;
		int gastosfev = 23000;
		int gastosmar = 17000;
		int gastostri = gastosjan + gastosfev + gastosmar;
		float media = (gastosjan + gastosfev + gastosmar) / 3;
		
		//imprimindo a soma do gasto trimestral
		System.out.println("O gasto total no primeiro trimestre foi de " + gastostri);
		
		//imprimindo a média dos meses
		System.out.println("A média de gastos no trimestre foi de " + media);
	}
			

}
