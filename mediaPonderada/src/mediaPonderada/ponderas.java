//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.

package mediaPonderada;
import java.util.Scanner;

public class ponderas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("calculo de media ponderada");
		System.out.println("numere quantas vezes deseja repetir");
		float mediaPonderada, medida, medida2, medida3;
		int escolha = scanner.nextInt();
		
		for(int i = 0; i<escolha;i++) {
		System.out.println("digite a primeira medida");
		medida = scanner.nextFloat();
		System.out.println("digite a primeira medida2");
		medida2 = scanner.nextFloat();
		System.out.println("digite a primeira medida3");
		medida3 = scanner.nextFloat();
		
		mediaPonderada = (medida*2+medida2*3+medida3*5)/(2+3+5);
		System.out.printf("%f", mediaPonderada);
		}
	}

}
