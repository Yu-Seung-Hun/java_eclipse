package contact_manager;

import java.util.List;

//데이터
//이름, 연락처(n개), 생일, 관계(가족, 친구, 여자친구)
//차단여부(차단 o / 차단 x), 메모(간단한 메모 ex. 대학교 친구)


//메인 기능
//1. 목록출력 (연락처에 저장된 사람들의 이름들을 모두 출력. toString 활용)
//2. 간략한 정보 출력 (이름, 연락처. toString 활용)
//3. 연락처 삭제 (저장된 연락처 정보를 모두 삭제)
//4. 연락처 추가 (이름, 연락처를 입력받아서 연락처를 추가)
//5. 연락처 편집 (이름, 연락처를 수정하거나 추가 연락처나 메모 등 추가정보들을 입력하는 기능)
//6. 연락처 검색 (이름으로 검색, 동명이인이 있을시 동명이인들의 간략한 정보를 출력해서 재선택)


//서브 기능
//1. ooo의 생일까지 며칠 남았는지 남은 Days를 출력
//2. 차단 / 해제 (한 사람을 선택하여 차단 or 해제 설정을 할 수 있음)
//3. 생일자 조회 (오늘 날짜를 기준으로 생일자가 있는지, 없으면 이달에 생일인 사람을 모두 출력)
//4. 차단 목록 출력 (차단설정한 사람들의 간략한 정보들을 모두 출력)

//데이터 담당 클래스
//기능 담당 클래스(데이터가 필요하다.)
//메인 클래스

//데이터 클래스에 대한 클래스 다이어그램, 기능 클래스에 대한 클래스 다이어그램
//기능 4가지에 대한 각각의 Flow diagram
//메인 클래스와 기능 클래스에 대한 Sequence Diagram


public class Contact {
	
	
	/**
	 * 이름
	 */
	private String name;
	
	/**
	 * 연락처
	 */
	private List<String> phoneNum;
	
	/**
	 * 생일
	 */
	private String birthDay;
	
	/**
	 * 관계
	 */
	private String relation;
	
	/**
	 * 차단 여부
	 */
	private boolean isBlock;
	
	/**
	 * 메모
	 */
	private String memo;
	
	
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public List<String> getPhoneNum(){
		return this.phoneNum;
	}
	
	public String getBirthDay() {
		return this.birthDay;
	}
	
	public String getRelation() {
		return this.relation;
	}
	
	public boolean getIsBlock() {
		return this.isBlock;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNum(List<String> phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	public void setIsBlock(boolean isBlock) {
		this.isBlock = isBlock;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	@Override
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("\t연락처 목록\t\n");
		sb.append("=======================\n");
		sb.append("이름 : " + this.name + "\n");
		
		int numCount = 0;
		for( String birthdays : this.phoneNum) {
			if(numCount == 0) {
				sb.append("연락처 : " + birthdays + "\n");
			}
			else {
				sb.append("연락처"+numCount+" : " + birthdays + "\n");
			}
			numCount++;
		}
		
		sb.append("생일 : " + this.birthDay + "\n");
		sb.append("관계 : " + this.relation + "\n");
		sb.append("차단여부 : " + this.isBlock + "\n");
		sb.append("메모 : " + this.memo + "\n");
		
		
		
		
		return sb.toString();
		
	}
	
	
	
	
	
	
	
	
	
	
}
