package return_method_quiz;

public class Mart {

	public static void main(String[] args) {
		
		VendingMachine drinkMachine = new VendingMachine();
		
		Customer musk = new Customer(200_000);
		
		drinkMachine.insertMoney(musk);
		drinkMachine.pressButton(musk);
		drinkMachine.insertMoney(musk);
		drinkMachine.pressButton(musk);
		
		System.out.println("자판기의 잔액: " + drinkMachine.money);
		System.out.println("자판기의 상품 수량" + drinkMachine.product.quantity);
		System.out.println("자판기의 상품 이름: " + drinkMachine.product.name);
		System.out.println("고객의 지갑 잔액: " + musk.wallet);
		System.out.println("고객의 상품 수량: " + musk.product.quantity);
		
	}
}
