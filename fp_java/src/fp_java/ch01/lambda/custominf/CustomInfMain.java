package fp_java.ch01.lambda.custominf;

public class CustomInfMain {
	
	public static void main(String[] args) {
		
		Airline air = (personCount) -> personCount * Airline.ADULT_FEE;
		int fee = air.getFee(3);
		System.out.println(fee);
		
		Calculatable calc = (num1, num2) -> System.out.println(num1 + num2);
		calc.printAddResult(10, 20);
		
	}
	
}
