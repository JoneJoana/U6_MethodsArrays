import java.util.Arrays;
import java.util.Scanner;

public class U6_EJ12App {

	public static void main(String[] args) {
		/**
		 * crear array tamaño segun user, nums aleatorios entre
		 * 1 y 300, mostrando aquellos que terminen por digito
		 * indicado por user(controlar num valido) y guardarse 
		 * en un nuevo array 
		 */
		
		Scanner sc = new Scanner(System.in);	
		
		int size;
		int min = 1, max = 300;
		
		System.out.println("Indica tamaño del array a generar");
		size = sc.nextInt();
		sc.nextLine();
		
		int arrayRandom[] = new int[size]; //creacion array segun tamaño indicado
		int saveRandoms[] = new int[size];  //lo suyo seria trabajar en todo caso con ArrayList o otras opciones mas adaptables
		
		for(int i=0;i<arrayRandom.length;i++) { //lo rellenamos con valores random dentro rango
			arrayRandom[i] = (int)(Math.random()*(max-min));
		}
		
		int finalDigit = -1;
		do { //bucle para controlar dato correcto
			System.out.println("Indica en que digito quieres que acaben los valores que te mostraremos del array creado (0-9)");
			finalDigit = sc.nextInt();
			sc.nextLine();
		}while(finalDigit>9 || finalDigit<0);
		
		sc.close();
		
		for(int i=0;i<arrayRandom.length;i++) {
			String finalValue = String.valueOf(arrayRandom[i]); 
			finalValue = finalValue.substring(finalValue.length()-1);	//finalValue vale ahora el ultimo valor de la posicion que estemos mirando		
																		
			if(Integer.parseInt(finalValue)==finalDigit) {   //convertimos final value en formato int para poderlo comparar
				System.out.println(arrayRandom[i]);          
				saveRandoms[i] = arrayRandom[i];	//guardamos valores en el 2o array
			}			
		}
		
		System.out.println(Arrays.toString(saveRandoms)); 
		/**
		 * idea inicial era añadir contador al if donde imprimo los valores de arrayRandom, para extraer tamaño del 2o array
		 * donde guardariamos los valores que coincidan con el finalDigit. Dado que para extraer esos datos tendria que volver a recorrer
		 * el arrayRandom haciendo todo el proceso de valueOf/Substring/if == finalDigit.. no tiene mucho sentido. Aunque ahora el array
		 * saveRandoms tiene posiciones vacias (0) lo cual tampoco es muy optimo. 
		 */
		
		
		
		
		
		

	}

}
