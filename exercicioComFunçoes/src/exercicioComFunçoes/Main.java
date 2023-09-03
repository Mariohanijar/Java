package exercicioComFunçoes;
import java.util.Scanner;
public class Main {

	
	
	public static int somaDeNumeros(int num1, int num2) {
		
		int somaDeNumeros = num1+num2;
		return somaDeNumeros;
	}
	
	public static int numeroFatoriado (int numeroFatoriado) {
		int j=1;
		
		for(int i = 1;i<=numeroFatoriado;i++) {
			j = i*j;
		}
		
		return j;
	}
	
	public static float media(float num1, float num2, float num3) {
		float media = (num1+num2+num3)/3;
		return media;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha os metodos de funçao que voce deseja fazer, ");
		System.out.println("1. soma de numeros, 2. maior e menor numero, 3. Fatorial de um Número: , 4. media, 5.Fibonacci");
		int escolha = scanner.nextInt();
		
		if(escolha == 1) {
			System.out.println("digite dois numeros para serem somados");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int somar =somaDeNumeros(num1,num2);
			System.out.println("o valor da soma eh " + somar);
		
		}
		
		if(escolha == 2) {
			System.out.println("Digite quantos numeros deseja adicionar: ");
			int maior = 0;
			int menor = 0;
			int qteNumerosDigitados;
			int arrayValores[];
			
			qteNumerosDigitados = scanner.nextInt();
			arrayValores = new int [qteNumerosDigitados];
			
			//captação dos números
			for(int i = 0; i < qteNumerosDigitados; i++) {
				System.out.println("Informe os valores: ");
				arrayValores[i] = scanner.nextInt();
				
				maior = arrayValores[i];
				menor = arrayValores[i];
			}
			
			//verificação de fato se um número eh maior ou menor
			for(int i = 0; i < qteNumerosDigitados; i++) {
				if(arrayValores[i] > maior) {
					maior = arrayValores[i];
				} 
				else if(arrayValores[i] < menor){
					menor = arrayValores[i];
				}
			}
			
			System.out.println("Maior: " + maior);
			System.out.println("Maior: " + menor);
		}
		
		if(escolha == 3) {
			System.out.println("Digite um numero para ser fatoriado");
			int numero = scanner.nextInt();
			int fatoracao = numeroFatoriado(numero);
			
			System.out.println("o numero fatoriado e: " + fatoracao);
		
		}
		
		if(escolha == 4) {
			System.out.println("Digite tres numeros: ");
			float num1 = scanner.nextInt();
			float num2 = scanner.nextInt();
			float num3 = scanner.nextInt();
			float media = media(num1,num2,num3);
			System.out.printf("a media dos tres numeros eh: %f", media);
			
		 	}
		
		if(escolha == 5) {
			int j = 1;
			for(int i = 0; i < 10; i++) {
				j = i+1;
				System.out.println("[" + j + "]");
			}
		
		}
		
		
		

	}

}
