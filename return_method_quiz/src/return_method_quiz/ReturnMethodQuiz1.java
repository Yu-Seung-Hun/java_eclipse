package return_method_quiz;

public class ReturnMethodQuiz1 {
	
	public static int getMinutes(int processTime) {
		int result = processTime / 60;
		return result;
	}
	
	public static int getSeconds(int processTime) {
		int result = processTime % 60;
		return result;
	}
	
	public static void main(String[] args) {
		
		int processTime = 145;
		int minutes = getMinutes(processTime);
		int seconds = getSeconds(processTime);
		
		System.out.println(minutes);
		System.out.println(seconds);
	}

}
