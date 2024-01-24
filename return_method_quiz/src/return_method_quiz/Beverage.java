package return_method_quiz;

public class Beverage {
	Product product1;
	Product product2;
	Product product3;
	Product product4;
	
	
	public Beverage() {
		System.out.println("자판기 인스턴스를 생성하였습니다.");
		
		this.product1 = new Product("박카스", 900, 15);
		this.product2 = new Product("몬스터", 1500, 20);
		this.product3 = new Product("핫식스", 1300, 10);
		this.product4 = new Product("밀키스", 1400, 5);
	}
	
	// 주문하기
	public Product order(String name, int quantity) {
		
		Product orderProduct = null;
		
		if(this.product1.name.equals(name)) {
			
			if(this.product1.quantity < quantity) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			
			this.product1.quantity -= quantity;
			orderProduct = product1;
		}
		
		else if(this.product2.name.equals(name)) {
			
			if(this.product2.quantity < quantity) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			
			this.product2.quantity -= quantity;
			orderProduct = product2;
		}
		
		else if(this.product3.name.equals(name)) {
					
			if(this.product3.quantity < quantity) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			
			this.product3.quantity -= quantity;
			orderProduct = product3;
		}
				
		else if(this.product4.name.equals(name)) {
			
			if(this.product4.quantity < quantity) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			
			this.product4.quantity -= quantity;
			orderProduct = product4;
		}
		
		return orderProduct;
	}
	
	// 입고하기
	public void Store(String name, int quantity) {
		if(this.product1.name.equals(name)) {
			this.product1.quantity += quantity;
		}
		
		else if(this.product2.name.equals(name)) {
			this.product2.quantity += quantity;
		}
		
		else if(this.product3.name.equals(name)) {
			this.product3.quantity += quantity;
		}
		
		else if(this.product4.name.equals(name)) {
			this.product4.quantity += quantity;
		}
	}
	
	// 재고 출력하기
	public void Print() {
		System.out.println("====================");
		System.out.println("자판기 재고 상황 출력");
		System.out.println("====================");
		
		System.out.println("상품명: " + this.product1.name +
							", 가격: " + this.product1.price + 
							", 재고: " + this.product1.quantity);
		
		System.out.println("상품명: " + this.product2.name +
							", 가격: " + this.product2.price + 
							", 재고: " + this.product2.quantity);
					
		System.out.println("상품명: " + this.product3.name +
							", 가격: " + this.product3.price + 
							", 재고: " + this.product3.quantity);
					
		System.out.println("상품명: " + this.product4.name +
							", 가격: " + this.product4.price + 
							", 재고: " + this.product4.quantity);
		
		System.out.println();
	}
	
	
	
}
