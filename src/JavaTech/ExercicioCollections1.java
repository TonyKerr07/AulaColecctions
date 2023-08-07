package JavaTech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioCollections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio Collections 1
		
		ArrayList<String> Cores = new ArrayList();
		Scanner leia = new Scanner(System.in);
		String Cor;
		
		System.out.println("\nDigite 5 cores: ");
		
		for (int i=0; i < 5; i ++) {
			System.out.println("\nCor " + (i+1));
			Cor = leia.nextLine();
			Cores.add(Cor);
			
		}
		
		System.out.println("\nLista de cores: ");
		System.out.println(Cores);
		
		Collections.sort(Cores);
		System.out.println("\nLista de cores ordenada: ");
		System.out.println(Cores);
		
	}

}
