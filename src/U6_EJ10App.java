import java.util.Scanner;

public class U6_EJ10App {

	public static void main(String[] args) {
		/**
		 * crear array de tamaño indicado por user
		 * array de nums aleatorios primos entre los numeros min i max 
		 * deseados
		 * indicara tamb cual es el mayor de todos
		 * 
		 * crear un metodo para comprobar que el num aleatorio es primo 
		 * crear todos los metodos necesarios		 
		 */
		Scanner sc = new Scanner(System.in);	
		
		int size;
		int min,max;
		
		System.out.println("Indica tamaño del array de numeros primos a generar");
		size = sc.nextInt();
		sc.nextLine();
		
		int arrayNum[] = new int[size]; //inicializamos array con el tamaño indicado
		
		System.out.println("Entre que rango de valores quieres que sean los valores primos? Indica minimo y maximo");
		min = sc.nextInt();
		max = sc.nextInt();
		sc.nextLine();
		
		sc.close();
		
	}
	
	private static int[] fillArrayRandom(int[] arrayNum,int min, int max) {		
		
		for(int i=0;i<arrayNum.length;i++) {
			arrayNum[i] = randomEsPrimo(min,max);
		}	
		
		return arrayNum;
		
	}
	
	private static int randomEsPrimo(int min, int max) {
		int random;
		do {
			random = (int)(Math.random()*(max - min));
		}while(!esPrimo(random));
		
		return random;
		
	}
	
	private static boolean esPrimo(int num) {
		
		if(num==1 || num == 0) {  // 0 y 1 sabemos que no son numeros primos 
			return false;
		}
		
		for(int i=2;i<num;i++) { 
			if(num%i==0) { 
				return false;
			}
		}
		
		return true; //si no ha sido divisble entre ninguno, es primo.
	}

}
