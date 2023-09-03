
package exerciciosComVetores;
import java.util.Scanner;
public class Vetores {
	
	
	public static void armazenamentoDeVetores(int vetor[], Scanner scanner) {
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("digite os valores para somar no seu vetor: ");
			vetor[i] = scanner.nextInt();
			
		}
	}
		
	public static void  mostrandoOsValores(int vetor[]) {
		for(int i = 0; i<vetor.length; i++) {
				System.out.println("valores dos vetores " + vetor[i]);
		}
	}
	
	public static int somaDosVetores(int vetor[]) {
		int soma = 0;
		for(int i = 0; i<vetor.length; i++) {
		soma += vetor[i];
		}
		return soma;
	}
	
	public static void main(String[] args) {
		
		System.out.println("O que você deseja fazer?");
		System.out.println("1. soma de elemento de vetores, 2. maior e menor");
		Scanner scanner = new Scanner(System.in);
		int escolha = scanner.nextInt();
		if(escolha == 1) {
			//Soma de Elementos em um Vetor:
			int numParaSomar = 5;
			int vetor[] = new int[numParaSomar]; 
			
			armazenamentoDeVetores(vetor, scanner);
			mostrandoOsValores(vetor);
			int soma = somaDosVetores(vetor);
			System.out.println("A soma dos elementos dos vetores eh" + soma);
		
		}else if(escolha == 2) {
		//Maior e Menor Elemento em um Vetor:
		int maior = 0;
		int menor = 0;
		int quantDeNumeros;
		int vetor[];
		
		quantDeNumeros = scanner.nextInt();
		vetor = new int [quantDeNumeros];
		
			for(int i =0; i<quantDeNumeros;i++) {
				System.out.println("Digite a quantidade de numeros: ");
				vetor[i] = scanner.nextInt();
				
				maior = vetor[i];
				menor = vetor[i];
				
			}
		}
		
		
		
	}

}


