package return_method_quiz;

import java.util.Scanner;

public class StringQuiz {
	
	/**
	 * 게임은 "자전거" 단어로 시작
	 * 자전거가 출력된 이후부터 Scanner를 이용해 마지막으로 입력된 단어의 마지막 글자로 시작하는
	 * 3글자 이상의 단어를 입력해야 합니다.(좌우 공백은 모두 제거해야 합니다.)
	 * 만약, 마지막 글자로 시작하지 않거나 3글자 미만의 글자를 입력했을 경우 게임은 종료됩니다.
	 * 게임이 종료될 때. 이어나간 단어의 수를 출력합니다.
	 * @param args
	 */
	public static void main(String[] args) {
		int insertCount = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		String startWord = "자전거";
		System.out.println("시작은 \"자전거\"입니다. 끝말잇기를 시작하세요.");
		
		
		while(true) {
			
			System.out.println("다음 단어를 입력해주세요.");
			String str = scanner.nextLine();
			str = str.trim();
			
			if(str.length() < 3) {
				break;
			}
			
			String lastLetter = startWord.substring(startWord.length()-1);
			
			if(str.startsWith(lastLetter)) {
				startWord = str;
				insertCount++;
			}
			
			else {
				break;
			}
			
		}
		
		
		System.out.println("끝말잇기 게임이 종료되었습니다.");
		System.out.println("이어간 단어의 수는 " + insertCount + "번 입니다.");
	}

}
