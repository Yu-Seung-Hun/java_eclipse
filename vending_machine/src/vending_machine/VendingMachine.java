package vending_machine;

public class VendingMachine {
	
	Product product;
	
	int money;
	
	
	public VendingMachine() {
		System.out.println("자판기 인스턴스를 만들었습니다!");
		
		this.product = new Product();
		this.product.setName("제로콜라");
		this.product.setPrice(1600);
		this.product.setQuantity(50);
		
		this.money = 100_000;
		
		
	}
	
	
	public void insertMoney(Customer customer) {
		this.money += this.product.getPrice();
		customer.pay(this.product.getPrice());
	}
	
	
	public void pressButton(Customer customer) {
		if(this.product.getQuantity() <= 0) {
			return;
		}
		
//		this.product.quantity--;
		int quantity = this.product.getQuantity();
		quantity--;
		this.product.setQuantity(quantity);
		
		customer.addStock(this.product.getName(), this.product.getPrice());
	}
	
}
