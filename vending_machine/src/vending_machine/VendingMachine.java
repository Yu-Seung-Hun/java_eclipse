package vending_machine;

public class VendingMachine implements Sellable {
	
	Product[] productArray;
	
	int money;
	
	
	public VendingMachine() {
		this(100_000);
	}
	
	public VendingMachine(int money) {
		this.money = money;
		
		this.productArray = new Product[3];
		
		this.productArray[0] = new Product();
		this.productArray[0].setName("제로펩시");
		this.productArray[0].setPrice(1600);
		this.productArray[0].setQuantity(50);
		
		this.productArray[1] = new Product();
		this.productArray[1].setName("제로콜라");
		this.productArray[1].setPrice(1500);
		this.productArray[1].setQuantity(30);
		
		this.productArray[2] = new Product();
		this.productArray[2].setName("제로스프라이트");
		this.productArray[2].setPrice(1400);
		this.productArray[2].setQuantity(20);
		
	}
	
	
	@Override
	public Product[] getProductArray() {
		return this.productArray;
	}
	
	@Override
	public int getMoney() {
		return this.money;
	}
	
	@Override
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	@Override
	public void insertMoney(Customer customer, String productName) {
		
		// this.productArray를 반복하면서 Product 인스턴스의 제품명 확인.
		// Product 인스턴스의 제품명과 productName이 같으면,
		// 해당 제품의 가격으로 자판기의 돈을 증가시키고
		// 고객의 돈을 감소시킨다.
		for(Product product : this.productArray) { // for-each
			
			if(product.equals(productName)) {
				this.money += product.getPrice();
				customer.pay(product.getPrice());
				break; // 반복을 중단 
			}
		}
	}
	
	
	@Override
	public void pressButton(Customer customer, String productName) {
		
		// 메소드 체이닝
		// 비슷한 메소드이기 때문에 메소드에 파라미터를 넣어서 새로 호출
		this.pressButton(customer, productName, VendingMachine.PRODUCT_COUNT);
	}
	
	
	@Override
	public void pressButton(Customer customer, String productName, int orderCount) {
		
		// this.productArray를 반복하면서 productName과 같은지 비교한다.
		// 같으면 해당 제품의 수량을 체크하고 (0보다 작은지)
		// 작다면, 메소드를 종료시킨다.
		// 그렇지 않다면 해당 제품의 수량을 하나 감소시키고
		// 고객에게 해당 제품을 전달한다.
		for(Product product : this.productArray) {
			if(product.equals(productName)) {
				
				if(product.getQuantity() <= 0) {
					// 수량이 부족하면 환불한뒤 return
					this.refund(customer, product.getPrice());
					return;
				}
				
				int quantity = product.getQuantity();
				quantity -= orderCount;
				product.setQuantity(quantity);
				
				customer.addStock(productName, product.getPrice(), orderCount);
			}
		}
	}
	
	
	protected void refund(Customer customer, int refundMoney) {
		
	}
	
	
	@Override
	public void printProducts() {
		System.out.println("자판기의 잔액: " + this.money);
		
		for(Product product : this.productArray) {
			if(product != null) {
				// 자판기의 상품 수량과 상품 이름을 출력
				System.out.println("자판기의 상품 수량: " + product.getQuantity());
				System.out.println("자판기의 상품 이름: " + product.getName());
			}
		}
	}
	
	
	
	
	
}
