//Ler um número inteiro N e calcular todos os seus divisores.
package calculoDeDivisores;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("escreva um numero para ser mostrado os divisores");
		int numero = scanner.nextInt();
		for(int i=1;i<numero;i++) {
			if(numero % i == 0) {
				System.out.printf("%d ", i);
			}
		}

	}

}
