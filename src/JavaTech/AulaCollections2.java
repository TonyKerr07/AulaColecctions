package JavaTech;

import java.util.ArrayList;
import java.util.Scanner;

public class AulaCollections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Aula Collections 2
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n----------------------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n(0) Deseja encerrar o programa?");
			System.out.println("\n----------------------------------------------------");
			System.out.println("\nDigite a sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
				}else {
					System.out.println("\nProduto não existente!!!");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					System.out.println("\nDigite o nome do produto que entrará no lugar do "+verifica+": ");
					String novo = leia.nextLine();
					estoque.add(novo);
				}else {
					System.out.println("\nProduto não existente!!!");
				}
				break;
			case 4:
				System.out.println("\nOs produtos que temos no estoque são: ");
				System.out.println(estoque);
				break;
			case 0:
				System.out.println("\nMuito obrigado em utilizar o nosso programa, VOLTE SEMPRE!!!");
				break;
				default:
					System.out.println("\nOpção inválida, por favor digite novamente sua opção!!!");
			}
		}while(op!=0);
	}

}
