
public class IfNumberFormatException {
	
	public static void main(String[] args) {
		
		String numString = "123";
		
		// NumberFormatException 방지방법 - 변환 전 숫자의 형태를 체크
		if(numString.matches("^[0-9]+$")) {
			int num = Integer.parseInt(numString);
			System.out.println(num); // 123
		}
		
		numString = "ABC";
		if(numString.matches("^[0-9]+$")) {
			int num = Integer.parseInt(numString); // NumberFormatException
			System.out.println(num);
		}
		
	}
	
}
