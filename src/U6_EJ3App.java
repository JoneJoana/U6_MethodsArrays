import java.util.Scanner;

public class U6_EJ3App {

	public static void main(String[] args) {
		/**
		 * pedir num por teclado, lo pasamos por parametro a un metodo
		 * que verifique si es un num primo o no --> return boolean
		 */
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un numero para saber si es primo");
		num = sc.nextInt();
		sc.nextLine();
		
		sc.close();
		
		if(esPrimo(num)) {
			System.out.println("El numero "+num+" es primo");
		}else {
			System.out.println("El numero "+num+" no es primo");
		}
	}
	
	private static boolean esPrimo(int num) {
		
		if(num==1 || num == 0) {  // 0 y 1 sabemos que no son numeros primos 
			return false;
		}
		
		for(int i=2;i<num;i++) { // empezamos directamente en el 2
			if(num%i==0) { //comprueba si es divisible entre cualquier otro numero
				return false;
			}
		}
		
		return true; //si no ha sido divisble entre ninguno, es primo.
	}

}
