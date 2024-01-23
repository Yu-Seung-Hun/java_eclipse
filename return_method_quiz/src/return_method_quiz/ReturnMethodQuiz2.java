package return_method_quiz;

public class ReturnMethodQuiz2 {
	int wallet;
	
	ReturnMethodQuiz4 product;
	
	public ReturnMethodQuiz2(int wallet) {
		this.wallet = wallet;
		this.product = new ReturnMethodQuiz4();
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
