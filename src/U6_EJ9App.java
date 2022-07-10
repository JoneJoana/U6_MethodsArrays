import java.util.Scanner;

public class U6_EJ9App {
		
	public static void main(String[] args) {
		/**
		 * crear array numerico, pedir tamaño, lo rellenamos con nums random
		 * entre 0 y 9. mostrar valor de cada posicion y la suma de 
		 * todos los valores
		 * 
		 * metodo para rellenar array con parametros num min i max
		 * otro metodo para mostrar contenido y suma
		 */
		
		final int MIN = 0;
		final int MAX = 9;	
		
		int arrayNum[] = fillArray(MIN,MAX); //incializamos array con el propio metodo (ya que devuelve array)
												// asi podemos pasarselo como parametro al metodo show
		showArray(arrayNum);
		
	}	
	
	private static int[] fillArray(int min, int max) {		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica tamaño del array a generar");
		int sizeArray = sc.nextInt();
		sc.nextLine();
		
		int arrayNum[] = new int[sizeArray];
		
		for(int i=0;i<arrayNum.length;i++) {
			arrayNum[i] = (int)(Math.random()*(max - min));
		}
		sc.close();
		
		return arrayNum;
		
	}
	
	private static void showArray(int[] arrayNum) {
		int resultAdd = 0;
		
		for(int i=0;i<arrayNum.length;i++) {
			System.out.println("arrayNum["+i+"] = "+arrayNum[i]);
			resultAdd += arrayNum[i];			
		}
		
		System.out.println("La suma total de los valores del array es: "+resultAdd);
	}

}
