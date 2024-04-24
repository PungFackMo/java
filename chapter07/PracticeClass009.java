package chapter07;

//연락처 관리 프로그램
public class PracticeClass009 {
	private String name;
	private String number;
	private String relation;
	public PracticeClass009(String name, String number, String relation) {
		super();
		this.name = name;
		this.number = number;
		this.relation = relation;
	}
	@Override
	public String toString() {
		return "PracticeClass009 [name=" + name + ", number=" + number + ", relation=" + relation + "]";
	}
	public static void main(String[] args) {
		PracticeClass009 phone01=new PracticeClass009("김자바", "010-1234-5786", "친구");
		System.out.println(phone01.toString());
		PracticeClass009 phone02=new PracticeClass009("최구글", "010-3548-5896", "가족");
		System.out.println(phone02.toString());
		PracticeClass009 phone03=new PracticeClass009("네이버", "051-294-8855", "회사");
		System.out.println(phone03.toString());
				
	}

}
