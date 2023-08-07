package JavaTech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioCollections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio Collections 2
		
		List<Integer> minhaLista = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		int procura, i;
		
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(4);
		minhaLista.add(9);
		minhaLista.add(7);
		minhaLista.add(8);
		minhaLista.add(10);
		minhaLista.add(6);
		
		System.out.println("\nDigite um número inteiro: ");
		procura = leia.nextInt();
		
		if (minhaLista.contains(procura)) {
			System.out.println("\nO número " + procura + " está na posição: " + (minhaLista.indexOf(procura)+1));
			
		} else {
			System.out.println("\nO numero " + procura + " não foi encontrado!!!");
			
		}
		
		
		
		
		
	}

}
