package oop_exam;

public class Hello {
	
	public static void sayHello() {
		System.out.println("안녕하세요?");
	}
	
	public static void printHello(String name) {
		System.out.println(name + "씨, 안녕하세요?");
	}
	
	
	public static void main(String[] args) {
		
		sayHello();
		
		printHello("아이언맨");
		printHello("헐크");
		printHello("그루트");
		
		
	}
	
}
