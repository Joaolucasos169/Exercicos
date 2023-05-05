package desafiosmodulo1;

import java.util.Scanner;

public class Imc {
// Calcule o IMC.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu peso: ");
		double peso = entrada.nextDouble();

		System.out.println("Digite sua altura: ");
		double altura = entrada.nextDouble();

		double IMC = peso / (altura * altura);
		System.out.println("IMC é " + IMC);

		entrada.close();
	}
}
