package generic_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListQuiz {
	
	public static List<Integer> getLottoGame(Random random){
		List<Integer> randomNumber = new ArrayList<>();
		
		int num = 0;
		
		// 실무 코드는 반복문 밖에서 변수를 선언한다.
		while(randomNumber.size() <= 6) {
			
			// 1부터 45중 랜덤한 숫자 만들기
			num = random.nextInt(44) + 1;
			
			// ArrayList에 포함되어 있지 않다면, 랜덤숫자를 추가
			if( !randomNumber.contains(num)) {
				randomNumber.add(num);
			}
			
			
		}
		
		return randomNumber;
	}
	
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		// 이러한 형태도 가능하다.
		List<List<Integer>> lottoNumberSet = new ArrayList<>();
		
		// 로또번호 5게임 생성 후 출력
		List<Integer> lottoNumberList = null;
		
		for(int i=0; i<5; i++) {
			lottoNumberList = getLottoGame(random);
			lottoNumberSet.add(lottoNumberList);
		}
		
		for(List<Integer> lottoNumbers : lottoNumberSet) {
			System.out.println(lottoNumbers);
		}
		
		
		
		
		
		
	}
	
}
