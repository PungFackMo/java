package chapter07;

//연락처 관리 프로그램
public class PracticeClass004 {
	private String name;
	private String number;
	private String relation;
	
	public void setPhone(String n, String num, String r) {
		name=n;
		number=num;
		relation=r;
	}
	public void getPhone() {
		System.out.println("이름 : "+name);
		System.out.println("전화 번호 : "+number);
		System.out.println("관계 : "+relation+"\n");
	}
	public static void main(String[] args) {
		PracticeClass004 phone001=new PracticeClass004();
		phone001.setPhone("김자바", "010-1234-5786", "친구");
		phone001.getPhone();
		PracticeClass004 phone002=new PracticeClass004();
		phone002.setPhone("최구글", "010-3548-5896", "가족");
		phone002.getPhone();
		PracticeClass004 phone003=new PracticeClass004();
		phone003.setPhone("네이버", "051-294-8855", "회사");
		phone003.getPhone();
		
	}

}
