package aula6;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioLista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection Stack (Pilha) de Objetos da Classe String, para organizar a retirada de livros em uma pilha. 
		//O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3
		//Stack
		Stack<String> pilhaLivros = new Stack<String>();
		
		//Scanner
		Scanner leia = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n~~~~~~~~~~~~ Sistema de Atendimento ~~~~~~~~~~~~");
			System.out.println("~~~~~~~~ Escolha uma das opções abaixo ~~~~~~~~");
			System.out.println("Opção UM (1) - Adicionar um novo livro a pilha");
			System.out.println("Opção DOIS (2) - Listar livros da pilha");
			System.out.println("Opção TRÊS (3) - Retirar livro da pilha");
			System.out.println("Opção QUATRO (4) - Sair");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			int opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o título do livro: ");
				leia.nextLine();
				String livro = leia.nextLine();
				pilhaLivros.push(livro); //Adiciona um livro a pilha
				System.out.println(livro + " foi adicionado!");
				break;
				
			case 2:
				System.out.println("Lista de livros na pilha: ");
				Iterator<String> iLivros = pilhaLivros.iterator(); //Usando o interator para que os nomes sejam listados verticalmente
				while(iLivros.hasNext()) {
					System.out.println(iLivros.next());
				}
				System.out.println("A pilha está vazia!");
				break;
			
			case 3:
				if(!pilhaLivros.isEmpty()) {
					String livroRetirado = pilhaLivros.pop(); //Retira o último livro da pilha
					System.out.println(livroRetirado + " foi retirado da pilha!");
				} else {
					System.out.println("A pilha está vazia!");
				}
				break;
				
			case 4:
				System.out.println("Programa finalizado!");
				leia.close();
				System.exit(0);
				break;
				
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
		
	}

}
