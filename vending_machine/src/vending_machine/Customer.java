package vending_machine;

public class Customer {
	/**
	 * 고객이 가진 돈
	 */
	private int wallet;
	
	private Product product;
	
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
		if(this.product.getName() == null) {
			this.product.setName(name);
			this.product.setPrice(price);
			this.product.setQuantity(1);
		}
		
		else {
//			this.product.quantity++;
			int quantity = this.product.getQuantity();
			quantity++;
			this.product.setQuantity(quantity);
		}
	}
	
	// wallet의 getter
	public int getWallet() {
		return this.wallet;
	}
	
	// product의 getter
	public Product getProduct() {
		return this.product;
	}
}
