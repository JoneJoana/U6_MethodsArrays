import java.util.Scanner;

public class U6_EJ4App {

	public static void main(String[] args) {
		/**
		 * calcular factorial de un num 
		 * crear metodo con parametro
		 * factorial --> se mult los num anteriores
		 * hasta llegar a 1.
		 */

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un numero para calcular su factorial");
		num = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		System.out.println(factorial(num));
	}
	
	private static int factorial(int num) {
		int result=1; //inicializamos en 1 para que pueda multiplicarse despues
		for(int i=num;i>=1;i--) { 
			result *= i; 
		}		
		return result;
	}

}
