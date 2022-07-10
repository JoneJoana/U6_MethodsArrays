import java.util.Scanner;

public class U6_EJ8App {

	public static void main(String[] args) {
		/**
		 * Crear array de 10 posiciones numericas con valores pedidos 
		 * por teclado. Mostrar por consola el indice y valor. 
		 * 2 metodos uno para rellenar valores y otro para mostrar. 
		 */
		
		int nums[] = rellenaNums(); //inicializamos array  con los datos que nos devolvera el propio metodo
		muestraNums(nums);	
		
	}
	
	private static int[] rellenaNums() {
		Scanner sc = new Scanner(System.in);  
		int nums[] = new int[10];	//declaramos e inicializamos aqui el array de 10 posiciones
		
		System.out.println("Introduce 10 numeros");
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();		
		
		return nums; //devolvemos el array para pasarlo por parametro al otro metodo
	}
	
	private static void muestraNums(int[] arrayNums) {
		for(int i=0;i<arrayNums.length;i++) {
			System.out.println("nums["+i+"] = "+arrayNums[i]);
		}
	}

}
