package desafiosmodulo1;

import java.util.Scanner;

public class Conversaofahrenheit {
	public static void main(String[] args) {
// Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatua em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();

		double conversao = (fahrenheit - 32) / 1.8;

		System.out.println("Valor em Celsius " + conversao);
		entrada.close();
	}

}
