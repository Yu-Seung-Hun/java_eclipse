package contact_manager;

public interface ContactInf {
	
	// 연락처 목록 출력
	public void printContactList();
	
	// 간단한 정보 출력
	public void printSimpleInfo(int index);
	
	// 차단 목록 출력
	public void printBlockList();
	
	// 연락처 추가
//	public void addContact(String name, String phoneNum);
	public void addContact();
	
	// 연락처 삭제
	public void deleteContact(int index);
	
	// 연락처 편집
	public void editContact(int index);
	
	// 연락처 검색 (검색 후 출력)
	public void searchContact(String phoneNum);
	
	// 생일까지 남은일수 출력
	public void daysUntilBirthday(int index);
	
	// 차단 설정
	public void blockSetting(int index);
	
	// 생일자 조회
	public void searchBirthdayPerson();
	
}
