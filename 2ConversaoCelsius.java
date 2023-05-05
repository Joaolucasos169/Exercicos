package desafiosmodulo1;

import java.util.Scanner;

public class ConversaoCelsius {

	public static void main(String[] args) {
/* 1. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius*/

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatua em Celsius: ");
		double celsius = entrada.nextDouble();

		double conversao = (celsius * 1.8) + 32;

		System.out.println("Valor em Fahrenheit " + conversao);
		entrada.close();
	}

}
