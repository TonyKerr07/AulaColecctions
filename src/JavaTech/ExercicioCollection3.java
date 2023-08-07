package JavaTech;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio Collections 3
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		int numero, i;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite 10 número inteiros: ");
		
		for (i=0; i < 10; i ++) {
			System.out.println("\nNúmero " + (i+1));
			numero = leia.nextInt();
			numeros.add(numero);
			
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		System.out.println("Listar dados do Set: ");
		
		//System.out.println(numeros);
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
			
		}
		
	}

}
