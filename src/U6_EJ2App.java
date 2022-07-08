import java.util.Scanner;

public class U6_EJ2App {

	public static void main(String[] args) {
		/**generar una cantidad de nums int aleatorios, cantidad indicada por parámetro
		 * 
		 * metodo dnde pasamos por parametro el rango de los nums que queremos que genere
		 * 
		 * devolvera 1 num int aleatorio, se lanzara tantas veces como cantidad haya indicado
		 * 
		 * cuantos numeros quieres  --> entre que rango  --> calculo y mostrar
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int cantidadNums;
		int min, max;
		
		System.out.println("Cuantos numeros aleatorios quieres generar?");
		cantidadNums = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Entre que rango de valores? Indica minimo y maximo");
		min = sc.nextInt();
		max = sc.nextInt();
		sc.nextLine();
	
		for(int i=0;i<cantidadNums;i++) { //imprimimos valores generados segun cantidad indicada
			System.out.println(generaNumAleatorio(min,max)); 
		}
	
	}
	
	//metodo que devuelva un num aleatorio dentro del rango indicado
	private static int generaNumAleatorio(int min, int max) {
		int numAleatorio = (int)(Math.random()*(max - min));		
		return numAleatorio;
	}

}
