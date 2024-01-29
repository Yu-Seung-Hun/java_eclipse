package vending_machine;

public class Product {
	private String name;
	private int price;
	private int quantity;
	
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	@Override // Annotation 
	public String toString() {
		String superToStringResult = super.toString();
		System.out.println(superToStringResult);
		
		StringBuffer sb = new StringBuffer();
		sb.append("제품명: " + this.name);
		sb.append(", 가격: " + this.price);
		sb.append(", 재고: " + this.quantity);
		
		return sb.toString();
	}
	
	
	/*
	 * Priduvt p = new Product();
	 * if(p.equals("박카스")) {...}
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof String) {
			return this.name.equals( (String)obj );
		}
		
		return super.equals(obj);
	}
}
