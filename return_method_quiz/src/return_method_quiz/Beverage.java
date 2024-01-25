package return_method_quiz;

public class Beverage {
	Product[] product = new Product[4];
	
	
	public Beverage() {
		System.out.println("자판기 인스턴스를 생성하였습니다.");
		
		this.product[0] = new Product("박카스", 900, 15);
		this.product[1] = new Product("몬스터", 1500, 20);
		this.product[2] = new Product("핫식스", 1300, 10);
		this.product[3] = new Product("밀키스", 1400, 5);
	}
	
	// 주문하기
	public Product order(String name, int quantity) {
		
		Product orderProduct = null;
		
		for(int i=0; i<product.length; i++) {
			if(this.product[i].name.equals(name)) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			
			this.product[i].quantity -= quantity;
			orderProduct = product[i];
		}
		
		
		return orderProduct;
	}
	
	// 입고하기
	public void Store(String name, int quantity) {
		
		for(int i=0; i<product.length; i++) {
			if(this.product[i].name.equals(name)) {
				this.product[i].quantity += quantity;
			}
		}
	}
	
	// 재고 출력하기
	public void Print() {
		System.out.println("====================");
		System.out.println("자판기 재고 상황 출력");
		System.out.println("====================");
		
		
		for(int i=0; i<product.length; i++) {
			System.out.println("상품명: " + this.product[i].name +
								", 가격: " + this.product[i].price + 
								", 재고: " + this.product[i].quantity);
		}
		
		System.out.println();
	}
	
	
	
}
