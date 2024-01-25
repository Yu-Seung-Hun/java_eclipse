package return_method_quiz;

public class Order {

	public static void main(String[] args) {
		
		Beverage drink = new Beverage();
		
		drink.Print();
		
		drink.order("몬스터", 5);
		
		System.out.println();
		
		drink.Print();
		
		drink.Store("밀키스", 4);
		
		drink.Print();
		
	}

}
