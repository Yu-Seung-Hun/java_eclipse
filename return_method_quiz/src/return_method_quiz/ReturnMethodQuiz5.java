package return_method_quiz;

public class ReturnMethodQuiz5 {
	
	public static int Fee(int age, int adultFee, int kidFee) {
		
		int result = 0;
		
		if(age > 19) {
			result = adultFee;
		}
		else {
			result = kidFee;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daugther = 11;
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		int fee = 0;
		
		fee += Fee(father, adultOneWayFlightFare, kidOneWayFlightFare);
		fee += Fee(mother, adultOneWayFlightFare, kidOneWayFlightFare);
		fee += Fee(daugther, adultOneWayFlightFare, kidOneWayFlightFare);
		
		if(fee <= money) {
			System.out.println("여행가자!");
		}
		else {
			System.out.println("다음에 가자 ㅠㅠ");
		}
	}
	
}
