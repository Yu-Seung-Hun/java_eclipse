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
	public void add(T score) {
		
		if(size >= scoreArray.length) {
			// arraycopy가 빈번하게 일어나면 메모리를 많이 사용하기 때문에
			// 배수의 형태로 배열의 길이를 늘려주는 것이 좋다.
			Object[] tempScoreArray = new Object[scoreArray.length + 2];
			System.arraycopy(scoreArray, 0, tempScoreArray, 0, scoreArray.length);
			scoreArray = tempScoreArray;
		}
		
		scoreArray[size] = score;
		size += 1;
	}
	
	
	/**
	 * scoreArray 배열에서 index에 할당된 값을 반환.
	 * @param index 반환시킬 배열의 인덱
	 * @return 인덱스에 들어있는 인스턴스 혹은 
	 */
	public T get(int index) {
		
		if(index >= size) {
			throw new IndexOutOfBoundsException(index);
		}
		
		return (T) scoreArray[index];
	}
	
	
	/**
	 * scoreArray 배열에 인스턴스 혹은 값이 들어있는 개수.
	 * <pre>
	 * 	int[] scoreArray = new int[100];
	 * 	scoreArray[0] = 100;
	 * 	scoreArray[1] = 100;
	 * </pre>
	 * size의 결과는 2가 반환된다.
	 * 
	 * @return scoreArray 배열에 인스턴스 혹은 값이 들어있는 개수
	 */
	public int size() {
		return this.size;
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ScoreList[ ");
		
		for(int i=0; i<this.size; i++) {
			if(i == size-1) {
				sb.append(scoreArray[i]);
				break;
			}
			
			sb.append(scoreArray[i] + ", ");
		}
		
		sb.append(" ]");
		
		
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
