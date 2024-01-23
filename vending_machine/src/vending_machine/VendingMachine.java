package vending_machine;

public class VendingMachine {
	
	Product product;
	
	int money;
	
	
	public VendingMachine() {
		System.out.println("자판기 인스턴스를 만들었습니다!");
		
		this.product = new Product();
		this.product.name = "제로콜라";
		this.product.price = 1600;
		this.product.quantity = 50;
		
		this.money = 100_000;
		
		
	}
	
	
	public void insertMoney(Customer customer) {
		this.money += this.product.price;
		customer.pay(this.product.price);
	}
	
	
	public void pressButton(Customer customer) {
		if(this.product.quantity <= 0) {
			return;
		}
		
		this.product.quantity--;
		customer.addStock(this.product.name, this.product.price);
	}
	
}
