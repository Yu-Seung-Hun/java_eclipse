package return_method_quiz;

public class Customer {
	int wallet;
	
	Product product;
	
	public Customer(int wallet) {
		this.wallet = wallet;
		this.product = new Product();
	}
	
	
	public void pay(int price) {
		if(this.wallet < price) {
			return;
		}
		
		this.wallet -= price;
	}
	
	
	public void addStock(String name, int price) {
		if(this.product.name == null) {
			this.product.name = name;
			this.product.price = price;
			this.product.quantity = 1;
		}
		
		else {
			this.product.quantity++;
		}
	}
}
