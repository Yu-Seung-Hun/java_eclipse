package return_method_quiz;

public class ReturnMethodQuiz3 {
	
	public static int cel_To_fah(int celsius) {
		int result = (celsius * 9/5) + 32;
		return result;
	}

	public static void main(String[] args) {
		int celsius = 30;
		int fahrenheit = 0;
		
		fahrenheit = cel_To_fah(celsius);
		System.out.println(fahrenheit);
	}
}
