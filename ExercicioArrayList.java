package aula6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ExercicioArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criar uma Collection ArrayList de Objetos da Classe String. 
		//O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList.
		Scanner leia = new Scanner(System.in);
		
		//Declarando variáveis
		String cor1, cor2, cor3, cor4, cor5;
		
		//Criando a ArrayList
		ArrayList<String> cores = new ArrayList<String>();
		
		//Entrada das cores
		System.out.println("Digite a primeira cor: ");
		cor1 = leia.next(); //Atribuir um valor para a variável
		
		System.out.println("Digite a segunda cor: ");
		cor2 = leia.next();
		
		System.out.println("Digite a terceira cor: ");
		cor3 = leia.next();
		
		System.out.println("Digite a quarta cor: ");
		cor4 = leia.next();
		
		System.out.println("Digite a quinta cor: ");
		cor5 = leia.next();
		
		//Adicionar ao Array
		cores.add(cor1);
		cores.add(cor2);
		cores.add(cor3);
		cores.add(cor4);
		cores.add(cor5);
		
		//Listando todas as cores usando o iterator
		System.out.println("\nListar todas as cores: ");
		Iterator<String> iCores = cores.iterator();
		while(iCores.hasNext()) {
			System.out.println(iCores.next());
		}
		
		//Listando as cores em ordem alfabética
		//Pesquisando, achei o método collections.sort() que é feito exatamente para listar os elementos em ordem alfabética
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores: ");
		Iterator<String> iCoresOrdenadas = cores.iterator();
		while(iCoresOrdenadas.hasNext()) {
			System.out.println(iCoresOrdenadas.next());
		}

	}

}
