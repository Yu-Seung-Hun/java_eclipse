package return_method_quiz;

public class ReturnMethodQuiz2 {
	
	public static int getSeconds(int minutes, int seconds) {
		int result = minutes * 60 + seconds;
		return result;
	}
	
	public static void main(String[] args) {
		
		int minutes = 5;
		int seconds = 50;
		int time = 0;
		
		time = getSeconds(minutes, seconds);
		System.out.println(time);
	}
}
