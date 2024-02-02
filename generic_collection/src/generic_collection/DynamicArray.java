package generic_collection;

public class DynamicArray {
	
	public static void main(String[] args) {
		
		int[] scoreArray = new int[10];
		
		scoreArray[0] = 100;
		scoreArray[1] = 90;
		scoreArray[2] = 80;
		scoreArray[3] = 70;
		scoreArray[4] = 60;
		scoreArray[5] = 50;
		scoreArray[6] = 40;
		scoreArray[7] = 30;
		scoreArray[8] = 20;
		scoreArray[9] = 10;
		
		
		int[] scoreArray2 = new int[scoreArray.length + 1];
		
		System.arraycopy(scoreArray, 0, scoreArray2, 0, scoreArray.length);
		
		
		for( int score : scoreArray2 ) {
			System.out.println(score);
		}
		
		
		System.out.println(scoreArray2.length);
		System.out.println(scoreArray[0]);
		System.out.println(scoreArray2[0]);
		
		scoreArray2[0] = 99;
		System.out.println(scoreArray[0]);
		System.out.println(scoreArray2[0]);
		
	}
	
}
