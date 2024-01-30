package vending_machine;

public class Customer {
	/**
	 * 고객이 가진 돈.
	 */
	private int wallet;
	
	private Product[] productArray;
	
	/**
	 * Customer 생성자 
	 * @param wallet 고객이 가진 돈 
	 */
	public Customer(int wallet) {
		this.wallet = wallet;
		this.productArray = new Product[3];
	}
	
	
	/**
	 * 지출하는 돈 계산 
	 * @param price 상품의 가격 
	 */
	public void pay(int price) {
		// 상품 가격보다 돈이 부족하면 즉시 종료하는 if문 선언.
		if(this.wallet < price) {
			return;
		}
		
		this.wallet -= price;
	}
	
	
	/**
	 * 환불 받는다.
	 * @param money 환불 받은 금액
	 */
	public void addMoney(int money) {
		this.wallet += money;
	}
	
	
	/**
	 * 상품추가 메소드 선언 
	 * @param name 상품의 이름 
	 * @param price 상품의 가격 
	 */
	public void addStock(String name, int price) {
		
		// 메소드 체이닝 
		// 비슷한 메소드이기 때문에 파라미터를 넣어서 새로 호출
		this.addStock(name, price, VendingMachine.PRODUCT_COUNT);
	}
	
	
	// addStock 메소드 오버로딩
	public void addStock(String name, int price, int productCount) {
		
		// 고객이 방금 구매한 제품이 고객의 제품목록(this.productArray)에 있는지 확인한다.
		// 있다면, productCount만큼 수량만 증가시킨다.
		// 없다면, 비어있는 인덱스를 찾아서 새롭게 할당해 준다.
		
		Product product = this.getProductByName(name);
		
		if(product != null) { // 있다면 productCount만큼 수량만 증가 
			int quantity = product.getQuantity();
			quantity += productCount;
			product.setQuantity(quantity);
		}
		
		else { // 없다면 비어있는 인덱스를 찾아서 새롭게 할당
			int nullIndex = this.getNullIndex();
			
			if(nullIndex >= 0) {
				this.productArray[nullIndex] = new Product();
				this.productArray[nullIndex].setName(name);
				this.productArray[nullIndex].setPrice(price);
				this.productArray[nullIndex].setQuantity(productCount);
			}
			
		}
		
		
	}
	
	
	// 외부에서 호출 불가능
	private Product getProductByName(String name) {
		
		// 같은 이름의 제품이 있다면 반환
		for( Product product : this.productArray) {
			if(product != null && product.getName().equals(name)) {
				return product;
			}
		}
		
		return null;
	}
	
	
	// 외부에서 호출 불가능
	private int getNullIndex() {
		
		// null index를 알고싶다.
		for(int i=0; i<this.productArray.length; i++) {
			if(this.productArray[i] == null) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public void printProducts() {
		System.out.println("고객 잔액: " + this.wallet);
		
		for(Product product : this.productArray) {
			if(product != null) {
				// 고객의 상품 수량과 상품 이름을 출력
				System.out.println("고객의 상품 수량: " + product.getQuantity());
				System.out.println("고객의 상품 이름: " + product.getName());
			}
		}
	}
	
	
	
	
	
	// wallet의 getter
	public int getWallet() {
		return this.wallet;
	}
	
	// product의 getter
	public Product[] getProductArray() {
		return this.productArray;
	}
}
