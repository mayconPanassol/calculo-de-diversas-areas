package calculoDeDiversasAreas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double valorA, valorB, valorC;

		System.out.println("Entre com três valores (0.0): ");
		valorA = sc.nextDouble();
		valorB = sc.nextDouble();
		valorC = sc.nextDouble();

		System.out.println("");
		
		System.out.printf("TRIANGULO: %.3f%n", (valorA * valorC) / 2);
		System.out.printf("CIRCULO: %.3f%n", Math.PI * Math.pow(valorC, 2));
		System.out.printf("TRAPEZIO: %.3f%n", ((valorA + valorB) * valorC) / 2);
		System.out.printf("QUADRADO: %.3f%n", Math.pow(valorB, 2));
		System.out.printf("RETANGULO: %.3f%n", valorA * valorB);

		sc.close();

	}

}
