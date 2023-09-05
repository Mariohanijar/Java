//nome,preço,quantidade no estoque
//conseguir adicionar e retirar do estoque


package mercado2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the storage program of the company");
		
		Product product = new Product();
		System.out.println("What product do you want to stock? ");
		product.name = scanner.next();
		System.out.println("How much it cost? ");
		product.price = scanner.nextDouble();
		System.out.println("How many products do you have in stock? ");
		product.quantity = scanner.nextInt();
		
		System.out.printf("you have %d of %s that coasts %.4f", product.quantity, product.name, product.price);
		System.out.println("How many products do you want to increase? ");
		product.toString()
	}

}
