package chapter07;

//연락처 관리 프로그램
public class PracticeClass0091 {
	private String name;
	private String number;
	private String relation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	@Override
	public String toString() {
		return "PracticeClass0091 [name=" + name + ", number=" + number + ", relation=" + relation + "]";
	}
	public static void main(String[] args) {
		PracticeClass0091 phone01=new PracticeClass0091();
		phone01.setName("김자바");
		phone01.setNumber("010-1234-5786");
		phone01.setRelation("친구");
		System.out.println(phone01.toString());
		PracticeClass0091 phone02=new PracticeClass0091();
		phone02.setName("최구글");
		phone02.setNumber("010-3548-5896");
		phone02.setRelation("가족");
		System.out.println(phone02.toString());
		PracticeClass0091 phone03=new PracticeClass0091();
		phone03.setName("네이버");
		phone03.setNumber("051-294-8855");
		phone03.setRelation("회사");
		System.out.println(phone03.toString());
	}

}
