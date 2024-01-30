package vending_machine;

public interface Sellable {
	
	// interface에서 상수를 정의할 때
	// static final은 자동으로 적용되므로 생략한다.
	
	public int PRODUCT_COUNT = 1;
	public String MACHINE_NAME = "자판기";
	
	
	// product의 getter
	public Product[] getProductArray();
	
	// money getter
	public int getMoney();
	
	// money의 setter
	public void setMoney(int money);
	
	
	/**
	 * 돈을 넣는다.
	 * @param customer 돈을 넣은 고객 
	 * @param productName 구매할 제품의 이름 (제로펩시, 제로콜라, 제로스프라이트) 
	 */
	public void insertMoney(Customer customer, String productName);
	
	
	/**
	 * 버튼을 누른다. 
	 * @param customer 버튼을 누른 고객 
	 * @param productName 구매할 제품의 이름 (제로펩시, 제로콜라, 제로스프라이트) 
	 */
	public void pressButton(Customer customer, String productName);
	
	
	//pressButton 메소드 오버로딩 
	public void pressButton(Customer customer, String productName, int orderCount);
	
	// product 내용 출력 
	public void printProducts();
}
