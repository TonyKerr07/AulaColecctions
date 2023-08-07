package JavaTech;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollections4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício Collections 4
		
		int numero;
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
	
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\nDigite um número inteiro: ");
		numero = leia.nextInt();
		
		if (numeros.contains(numero)) {
			System.out.println("\nO número " + numero + " foi encontrado!!!");
			
		} else {
			System.out.println("\nO numero " + numero + " não foi encontrado!!!");
			
		}
		
		
	}

}
