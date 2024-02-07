package contact_manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactsManager implements ContactInf {
	
	
	/**
	 * 한 사람에 대한 연락처를 여러개 저장할때 쓰이는 변수 
	 */
	private List<String> phoneNumList;
	
	
	public ContactsManager() {
		phoneNumList = new ArrayList<>();
		System.out.println("배열생성 완료.");
	}
	
	@Override
	public void printContactList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printSimpleInfo(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printBlockList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addContact() {
		
		Scanner sc = new Scanner(System.in);
		
		String name; // 이름 
		String phoneNum; // 휴대폰 번호
		
		System.out.println("이름을 입력하세요.");
		name = sc.nextLine();
		
		System.out.println("휴대폰 번호를 입력하세요.");
		phoneNum = sc.nextLine();
		
		
		
	}

	@Override
	public void deleteContact(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editContact(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchContact(String phoneNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void daysUntilBirthday(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void blockSetting(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchBirthdayPerson() {
		// TODO Auto-generated method stub
		
	}
	
	
}
