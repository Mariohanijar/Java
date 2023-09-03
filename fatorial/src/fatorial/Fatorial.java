//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.
package fatorial;
import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite o numero para fazer seu fatorial");
		int numeroFatoriado = scanner.nextInt();
		int fatorial, numero, i;
		i=numeroFatoriado;
		int j=1;
		fatorial = numeroFatoriado*i;
		
		for(i = 1;i<=numeroFatoriado;i++) {
			j = i*j;
			
			System.out.println(j);
		}
		System.out.printf("%d ", j);

	}

}
