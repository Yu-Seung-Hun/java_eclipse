package contact_manager;

import java.util.ArrayList;
import java.util.List;

public class ContactsManager implements ContactInf {
	
	
	/**
	 * 연락처
	 */
	private List<String> contactsList;
	
	
	public ContactsManager() {
		contactsList = new ArrayList<>();
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
	public void addContact(String name, String phoneNum) {
		
		
		
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
