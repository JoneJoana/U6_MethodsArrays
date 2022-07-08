import java.util.Scanner;

public class U6_EJ6App {

	public static void main(String[] args) {
		/**
		 * contar num de cifras de un num int>0 (verificar) 
		 * crear metodo con parametro, return num de cifras
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Introduce un numero entero y mayor que 0");
		
		if(sc.hasNextInt()){ 
			num = sc.nextInt();
			sc.nextLine();				
		}
		
		if(num>0) {
			System.out.println("El numero tiene "+numCifras(num)+" cifras.");
		}else{
			System.out.println("No es un valor valido");
		}
		
	}
	
	private static int numCifras(int num){
		int numCifras = Integer.toString(num).length(); //convertimos a String para poder usar metodo length		
		return numCifras;
	}

}
