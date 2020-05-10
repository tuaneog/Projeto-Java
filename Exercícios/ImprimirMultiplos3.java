package exercicios;

public class ImprimirMultiplos3 {
	public static void main(String[] args) {
		//imprimir multiplos de 3, entre 1 e 100
		
		/*//usando o for
		 for (int i = 3; i <= 100; i += 3) {
			System.out.println(i); 
		} */
		
		 //usando o while
	
		 int i = 1;
		 while (i <= 100) {
			 i++;
			 if (i % 3 != 0) {
				 continue;
			 }
			 
			 System.out.print(i);
		 }
		
		
	}

}
