package return_method_quiz;

public class ReturnMethodQuiz5 {
	
	ReturnMethodQuiz4 product;
	
	int money;
	
	
	public ReturnMethodQuiz5() {
		System.out.println("자판기 인스턴스를 만들었습니다!");
		
		this.product = new ReturnMethodQuiz4();
		this.product.name = "제로콜라";
		this.product.price = 1600;
		this.product.quantity = 50;
		
		this.money = 100_000;
		
		
	}
	
	
	public void insertMoney(ReturnMethodQuiz2 customer) {
		this.money += this.product.price;
		customer.pay(this.product.price);
	}
	
	
	public void pressButton(ReturnMethodQuiz2 customer) {
		if(this.product.quantity <= 0) {
			return;
		}
		
		this.product.quantity--;
		customer.addStock(this.product.name, this.product.price);
	}
	
}
