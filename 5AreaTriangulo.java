package desafiosmodulo1;

import java.util.Scanner;

public class AreaTriangulo {
// Calcule a Área de um triângulo
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	    
		System.out.println("Digite a base: ");	
		double base = entrada.nextDouble();
		
		System.out.println("Digite a Altura: ");
		double altura = entrada.nextDouble();
		
		double área = (base * altura) / 2;
		
		System.out.println("A Área do Triângulo é: " + área);
		
		entrada.close();
	}
}
