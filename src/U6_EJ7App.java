import java.util.Scanner;

public class U6_EJ7App {

	public static void main(String[] args) {
		/**
		 * convertir cantidad de € introducida a otra moneda
		 * (dolares, yenes o libras)
		 * metodo con parametros (cantidad euros,string moneda a convert)
		 * no return solo syso con el cambio 
		 * 
		 * 0.86 libras es 1€
		 * 1.28611 dolares es 1€
		 * 129.852 yenes es 1€
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int cantEuros;
		String moneda;
				
		System.out.println("Cuantos euros quieres convertir?");
		cantEuros = sc.nextInt();
		sc.nextLine();
		
		System.out.println("A que moneda? Opciones:\nlibras\ndolares\nyenes");
		moneda = sc.nextLine();			

		conversorMoneda(cantEuros,moneda);
	}
	
	private static void conversorMoneda(int euros,String moneda) {
		
		double libra = 0.86;
		double dolar = 1.28611;
		double yen = 129.852;
		
		double valor = 0;
		
		switch(moneda) {
			case "libras":
				valor = euros * libra;			
				break;
				
			case "dolares":
				valor = euros * dolar;
				break;
				
			case "yenes":
				valor = euros * yen;
				break;
				
			default:
			System.out.println("Opcion no disponible");
		}
		
		if(valor!=0) { //confirmamos que se haya actualizado el valor
			System.out.println(euros+" euros = "+valor+" "+moneda);
		}		
		
	}

}

