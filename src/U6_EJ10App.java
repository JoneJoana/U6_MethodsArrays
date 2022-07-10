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
		
		//pedimos valores para crear array
		System.out.println("Indica tamaño del array de numeros primos a generar");
		size = sc.nextInt();
		sc.nextLine();
		
		int arrayNum[] = new int[size]; //inicializamos array con el tamaño indicado
		
		System.out.println("Entre que rango de valores quieres que sean los valores primos? Indica minimo y maximo");
		min = sc.nextInt();
		max = sc.nextInt();
		sc.nextLine();
		
		sc.close();
		
		fillArrayRandom(arrayNum,min,max);
		showArray(arrayNum);
		
	}
	
	private static void showArray(int[] arrayNum) {
		int maxNum = 0;
		
		for(int i=0;i<arrayNum.length;i++) {
			System.out.println("arrayNum["+i+"] = "+arrayNum[i]);
			if(arrayNum[i]>maxNum) { //actualizaremos valor de maxNum con el numero mayor del array
				maxNum = arrayNum[i];
			}
		}
		
		System.out.println("El valor mayor de todos es: "+maxNum);
	}
	
	private static int[] fillArrayRandom(int[] arrayNum,int min, int max) {		
		
		for(int i=0;i<arrayNum.length;i++) {
			arrayNum[i] = randomEsPrimo(min,max); //relleno array con valores primos verificados
		}	
		
		return arrayNum;
		
	}
	
	private static int randomEsPrimo(int min, int max) {
		int random;
		do {
			random = (int)(Math.random()*(max - min));
		}while(!esPrimo(random)); //en el momento que sea random sale del bucle y return valor
		
		return random;
		
	}
	
	private static boolean esPrimo(int num) {
		
		if(num==1 || num == 0) {  
			return false;
		}
		
		for(int i=2;i<num;i++) { 
			if(num%i==0) {  //si el resto de la division con algun valor es igual a 0,implica que es divisible por tanto no es primo (false)
				return false;
			}
		}
		
		return true; 
	}

}
