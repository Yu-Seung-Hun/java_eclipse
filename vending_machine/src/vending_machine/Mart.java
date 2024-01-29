package vending_machine;

public class Mart {

	public static void main(String[] args) {
		
		Sellable drinkMachine = new VendingMachine();
		
		Customer musk = new Customer(200_000);
		
		drinkMachine.insertMoney(musk, "제로펩시");
		drinkMachine.pressButton(musk, "제로펩시", 50);
		drinkMachine.insertMoney(musk, "제로펩시");
		drinkMachine.pressButton(musk, "제로펩시");
		
		drinkMachine.printProducts();
		musk.printProducts();
		
		
		// VendingMachine 클래스인 snackMachine 변수를 선언하고 초기화
		// 환불 가능한 VendingMachine
		Sellable snackMachine = new RefundableVendingMachine(400);
		
		snackMachine.insertMoney(musk, "제로펩시");
		snackMachine.pressButton(musk, "제로펩시", 50);
		snackMachine.insertMoney(musk, "제로펩시");
		snackMachine.pressButton(musk, "제로펩시", 2);
		
		snackMachine.printProducts();
		musk.printProducts();
		
	}
}
