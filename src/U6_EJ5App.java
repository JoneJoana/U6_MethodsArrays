import java.util.Scanner;

public class U6_EJ5App {

	public static void main(String[] args) {
		/**
		 * convertir un num en base decimal a binario
		 * metodo con el num por parametro, return String con el
		 * numero convertido a binario. 
		 * 
		 * para convertir-->dividir entre 2 el num, el result se vuelve´
		 * a dividir entre 2 hasta que ya no se pueda mas. 
		 * el resto que se obtenga de cada division formara el num binario
		 * de abajo a arriba
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un numero para convertirlo a binario");
		num = sc.nextInt();
		sc.nextLine();
		
		System.out.println(conversBin(num));
		
	}
	
	private static String conversBin(int num){
		/**se necesita este formato para poder usar el metodo 
        reverse ya que para obtener el binario se ha de cambiar el orden**/
		StringBuilder bin = new StringBuilder(); 	
		
		while(num>0) {  //mientras haya num para poder operar
			int result = num%2; //obtenemos el resto de la division
			bin.append(result); //lo vamos añadiendo a la var de tipo stringBuilder
			num/=2;  //dividimos entre dos cada vez para llegar a romper la condicion
		}		
		
		return bin.reverse().toString(); //metodos necesarios para obtener el num binario 
		
		/** forma fácil,limpia y clara: 
		 * 
		 * String bin = Integer.toBinaryString(num);
		 * return bin;
		 */
		
	}

}
