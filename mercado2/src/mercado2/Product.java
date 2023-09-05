package mercado2;

public class Product {
	String name;
	double price;
	int quantity;
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts() {
		this.quantity -= quantity;
	}
	public double allProducts() {
		return price * quantity;
	}
}
