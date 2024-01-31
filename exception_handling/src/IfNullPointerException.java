
public class IfNullPointerException {
	
	public static void main(String[] args) {
		
		String name = null;
		
		// NullPointerException - null.equals("이름") 
		// NullPointerException 방지방법
		if(name != null) {
			System.out.println(name.equals("이름"));
		}
		
		System.out.println("name is null");
		
	}
	
}
