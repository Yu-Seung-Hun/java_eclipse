package return_method_quiz;

public class ReturnMethodQuiz4 {
	
	public static int Sum(int kor, int eng, int math, int prog) {
		int result = kor + eng + math + prog;
		return result;
	}
	
	public static int Average(int sum, int num) {
		int result = sum / num;
		return result;
	}
	
	public static String Rate(int avg) {
		String result;
		
		if(avg >= 95) {
			result = "A+";
		}
		else if(avg >= 90) {
			result = "A";
		}
		else if(avg >= 85) {
			result = "B+";
		}
		else if(avg >= 80) {
			result = "B";
		}
		else if(avg >= 70) {
			result = "C";
		}
		else {
			result = "F";
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		int korScore = 90;
		int engScore = 88;
		int mathScore = 70;
		int progScore = 80;
		
		// 과목별 합계
		int sum = 0;
		// 평균 점수
		int avarage = 0;
		
		String rate;
		
		sum = Sum(korScore, engScore, mathScore, progScore);
		avarage = Average(sum, 4);
		rate = Rate(avarage);
		
		System.out.println(sum);
		System.out.println(avarage);
		System.out.println(rate);
		
		
	}
}
