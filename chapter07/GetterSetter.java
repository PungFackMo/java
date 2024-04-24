package chapter07;

public class GetterSetter {
	private String name;		//값을 직접적으로 접근 못하게 하려고 private를 쓴다.
	private String phoneNumber;
	
	//게더세더
	//게더 - 값을 가져 올 때
	//세더 - 값을 대입 할 때
	//하나씩 붙여서 만들어 준다
	///////////////////////////////////////////////////////////
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	///////////////////////////////////////////////////////////
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	///////////////////////////////////////////////////////////

	public static void main(String[] args) {
		GetterSetter gs=new GetterSetter();
		System.out.println(gs.getName());
		gs.setName("김자바");
		System.out.println(gs.getName());
		gs.setPhoneNumber("전화번호");
		System.out.println(gs.getPhoneNumber());
		//DTO(data transfer object), VO(value Object)
		//클래스들은 두가지 방법으로 값을 메인화
		//1. 생성자 사용
		//2. 게더세더(getter setter) 사용
		
	}

}
