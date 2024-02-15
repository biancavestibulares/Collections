package aula6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, 
		//para organizar a ordem de chegada dos Clientes de um Banco
		//O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3
		
		//Criando a lista
		Queue<String> filaBanco = new LinkedList<String>();
		
		//Scanner
		Scanner leia = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n~~~~~~~~~~~~ Sistema de Atendimento ~~~~~~~~~~~~");
			System.out.println("~~~~~~~~ Escolha uma das opções abaixo ~~~~~~~~");
			System.out.println("Opção UM (1) - Adicionar um novo cliente");
			System.out.println("Opção DOIS (2) - Listar clientes na fila");
			System.out.println("Opção TRÊS (3) - Chamar cliente da fila");
			System.out.println("Opção QUATRO (4) - Sair");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			int opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome do cliente: ");
				leia.nextLine();
				String cliente = leia.nextLine();
				filaBanco.offer(cliente);
				System.out.println(cliente + " foi adicionado!");
				break;
				
			case 2:
				System.out.println("Lista de clientes na fila: ");
				Iterator<String> iClientes = filaBanco.iterator(); //Usando o interator para que os nomes sejam listados verticalmente
				while(iClientes.hasNext()) {
					System.out.println(iClientes.next());
				}
				break;
			
			case 3:
				if(!filaBanco.isEmpty()) {
					String clienteChamado = filaBanco.poll();
					System.out.println(clienteChamado + " foi chamado!");
				} else {
					System.out.println("A fila está vazia!");
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
