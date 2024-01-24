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
	}
	
}
