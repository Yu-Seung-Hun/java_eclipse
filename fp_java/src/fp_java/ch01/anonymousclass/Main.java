package fp_java.ch01.anonymousclass;

public class Main {
	
	// nested class : 클래스 내부의 클래스
	public static class SubMain{
		
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		System.out.println(main);
		
		SubMain submain = new SubMain();
		System.out.println(submain);
		
		
		// 인터페이스를 직접 호출
		// 인터페이스를 인스턴스화 시키려고 클래스 형태로 만들었다.
		Computable computer = new Computable() {
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(computer);
		
		
		Computable computer1 = new Computable() {
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(computer1);
		
		
		Computable computer2 = new Computable() {
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(computer2);
		
	}
	
}
