package aula6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos e adicione-os individualmente na Collection Set.
		//Scanner
		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		
		//Criando o Set
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~ De preferência, não repita os valores inseridos ~~");
		System.out.println("\n");
		
		//Entrada dos números
		System.out.println("Digite o 1° número inteiro: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o 2° número inteiro: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite o 3° número inteiro: ");
		num3 = leia.nextInt();
		
		System.out.println("Digite o 4° número inteiro: ");
		num4 = leia.nextInt();
		
		System.out.println("Digite o 5° número inteiro: ");
		num5 = leia.nextInt();
		
		System.out.println("Digite o 6° número inteiro: ");
		num6 = leia.nextInt();
		
		System.out.println("Digite o 7° número inteiro: ");
		num7 = leia.nextInt();
		
		System.out.println("Digite o 8° número inteiro: ");
		num8 = leia.nextInt();
		
		System.out.println("Digite o 9° número inteiro: ");
		num9 = leia.nextInt();
		
		System.out.println("Digite o 10° número inteiro: ");
		num10 = leia.nextInt();
		
		//Adicionar ao Set
		setNumeros.add(num1);
		setNumeros.add(num2);
		setNumeros.add(num3);
		setNumeros.add(num4);
		setNumeros.add(num5);
		setNumeros.add(num6);
		setNumeros.add(num7);
		setNumeros.add(num8);
		setNumeros.add(num9);
		setNumeros.add(num10);
		
		//Imprimindo os números com o interator
		System.out.println("\nListar dados do Set: ");
		Iterator<Integer> iNumeros = setNumeros.iterator();
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		
	}

}
