package generic_collection;

public class ScoreList<T> {
	
	/**
	 * ScoreList가 관리할 배열
	 */
	private Object[] scoreArray;
	
	/**
	 * 배열 내에 들어있는 아이템들의 수<br/>
	 * 배열의 길이와는 관계가 없다.
	 */
	private int size;
	
	
	/**
	 * 생성
	 */
	public ScoreList() {
		this.scoreArray = new Object[2];
	}
	
	
	/**
	 * scoreArray 배열에 값을 추가한다. 
	 * @param socre 제네릭에 할당된 타입의 인스턴스 혹은 값
	 */
	public void add(T socre) {
		
		if(size >= scoreArray.length) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
