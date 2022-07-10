import java.util.Arrays;
import java.util.Scanner;

public class U6_EJ11App {

	public static void main(String[] args) {
		/**
		 * crear dos arrays con tamaño indicado por user
		 * uno de ellos rellenado con nums random y el otro apunta al
		 * primer array
		 * reasignando los valores del 2o array con randoms
		 * 
		 * crear metodo cn parametros (los dos arrays) y que devuelva
		 * uno nuevo con la mult del la [0] del array1 con el del array2
		 * y succesivamente con las demas posiciones
		 * 
		 * muestra contenido de cada array
		 */
		Scanner sc = new Scanner(System.in);	
		
		int size;
		
		System.out.println("Indica tamaño de los arrays a generar");
		size = sc.nextInt();
		sc.nextLine();
		
		int arrayNum1[] = new int[size]; //creacion primer array
		
		for(int i=0;i<arrayNum1.length;i++) { //lo rellenamos con valores random
			arrayNum1[i] = (int)(Math.random()*(100-1));
		}
		
		int arrayNum2[] = arrayNum1; //creacion 2o array apuntando al 1o (por tanto son el mismo,ocupan mismo espacio en la memoria)
		
		for(int i=0;i<arrayNum2.length;i++) { //lo rellenamos con nuevos valores random,por tanto estamos tambien sobreescribiendo el array1
			arrayNum2[i] = (int)(Math.random()*(100-1)); //math.random devuelve nums entre 0 y 0.9 asi que le damos rango
		}
		
		int arrayNum3[] = createArray(arrayNum1,arrayNum2,size);
		
		showArray(arrayNum1,arrayNum2,arrayNum3);
	}
	
	private static int[] createArray(int[] array1, int[] array2, int size) {
		
		int array3[] = new int[size];
		
		for(int i=0;i<array1.length;i++) {
			array3[i] = array1[i]*array2[i];
		}
		
		return array3;
	}
	
	private static void showArray(int[] array1, int[]array2, int[] array3) {
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));		
		
	}

}
