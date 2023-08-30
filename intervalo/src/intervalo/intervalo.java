//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)

package intervalo;
import java.util.Scanner;

public class intervalo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Digite quantas vezes voce deseja repetir o projeto");
		 int escolha = scanner.nextInt();
		 float num;
		 for(int i = 0;i<escolha;i++) {
			 num = scanner.nextInt();
			 if(num <= 20 && num >= 10) {
				 System.out.println("in");
				 
			 }
			 else {
				 System.out.println("out");
				 
			 }

		 }
	}
}
