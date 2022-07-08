import java.util.Scanner;

public class U6_EJ1App {

	public static void main(String[] args) {
		/**
		 * calculo area circulo cuadrado o triangulo 
		 * pedir figura -- > pedir valores
		 * metodo por figura para calculo del area (return double) 		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		// declaracion variables
		String figura;
		int radio;
		int base, altura;
		int lado;
		double area = -1;

		//pedimos figura para poder diferenciar datos a pedir
		System.out.println("De que figura quieres calcular el area?\nOpciones:\n circulo\n triangulo\n cuadrado");
		figura = sc.nextLine();

		switch (figura) { //pedimos datos segun figura y llamamos a funciones de calculo segun pertoque
		case "circulo":
			System.out.println("Introduce el radio del circulo");
			radio = sc.nextInt();
			sc.nextLine();//limpiamos buffer			
			area = calculoAreaCirculo(radio); //guardamos valor del calculo			
			break;
			
		case "triangulo":
			System.out.println("Introduce la base y altura del triangulo");
			base = sc.nextInt();
			altura = sc.nextInt();
			sc.nextLine();
			area = calculoAreaTriangulo(base, altura);
			break;
			
		case "cuadrado":
			System.out.println("Introduce el lado del cuadrado");
			lado = sc.nextInt();
			sc.nextLine();
			area = calculoAreaCuadrado(lado);
			break;
			
		default:
			System.out.println("Introduce opcion correcta");
		}

		mostrarAreaCalc(area);

	}

	private static double calculoAreaCirculo(int radio) {
		double area = (Math.pow(radio, 2)) * Math.PI;
		return area;
	}

	private static double calculoAreaTriangulo(int base, int altura) {
		double area = (base * altura) / 2;
		return area;
	}

	private static double calculoAreaCuadrado(int lado) {
		double area = lado * lado;
		return area;
	}

	private static void mostrarAreaCalc(double area) {
		if(area!=-1) {
			System.out.println("El area calculada es: " + area);
		}
	}

}
