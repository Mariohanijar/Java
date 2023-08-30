package num_impar;
import java.util.Scanner;
public class num_impar {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("coloque um numero para saber os impares antes");
		  int escolha = scanner.nextInt();
		  int i = escolha;
		  do {
			  if(i % 2 != 0) {
				  System.out.printf("%d", i);
				  
			  }
			  i--;   
		  }while(i>0 && i<1000);
		
		

	}

}
