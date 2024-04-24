package chapter07;

//맛집 리스트 프로그램
public class PracticeClass008 {
	private String name;
	private String where;
	private boolean open;
	public PracticeClass008(String name, String where, boolean open) {
		super();
		this.name = name;
		this.where = where;
		this.open = open;
	}
	@Override
	public String toString() {
		return "PracticeClass008 [name=" + name + ", where=" + where + ", open=" + open + "]";
	}
	
	public static void main(String[] args) {
		PracticeClass008 store01=new PracticeClass008("쌍둥이국밥", "부산진구", true);
		System.out.println(store01.toString());
		PracticeClass008 store02=new PracticeClass008("7번가피자", "부산남구", true);
		System.out.println(store02.toString());
		PracticeClass008 store03=new PracticeClass008("맥도날드", "부산사하구", false);
		System.out.println(store03.toString());
		
	}

}
