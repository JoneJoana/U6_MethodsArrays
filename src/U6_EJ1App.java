import java.util.Scanner;

public class U6_EJ1App {

	public static void main(String[] args) {
		/**
		 * calculo area circulo cuadrado o triangulo 
		 * pedir figura -- > pedir valores
		 * metodo por figura para calculo del area (return int) 
		 * 
		 * circulo (radio^2) *PI 
		 * triangu (base * altura) /2 
		 * cuadra lado * lado
		 */

		Scanner sc = new Scanner(System.in);
		
		// declaracion variables
		String figura;
		int radio;
		int base, altura;
		int lado;
		int area = -1;

		//pedimos datos y guardamos valor obtenido al llamar a los metodos de calculo
		System.out.println("De que figura quieres calcular el area?\nOpciones:\n circulo\n triangulo\n cuadrado");
		figura = sc.nextLine();

		switch (figura) { //segun la figura pedimos datos distintos y llamamos a funciones de calculo distintas
		case "circulo":
			System.out.println("Introduce el radio del circulo");
			radio = sc.nextInt();
			sc.nextLine();
			area = calculoAreaCirculo(radio); 
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

		mostrarDatos(area);

	}

	private static int calculoAreaCirculo(int radio) {
		int area = (int) ((Math.pow(radio, 2)) * Math.PI);
		return area;
	}

	private static int calculoAreaTriangulo(int base, int altura) {
		int area = (base * altura) / 2;
		return area;
	}

	private static int calculoAreaCuadrado(int lado) {
		int area = lado * lado;
		return area;
	}

	private static void mostrarDatos(int area) {
		if(area!=-1) {
			System.out.println("El area calculada es: " + area);
		}
	}

}
