package chapter07;

//맛집 리스트 프로그램
public class PracticeClass0081 {
	private String name;
	private String where;
	private boolean open;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	@Override
	public String toString() {
		return "PracticeClass0081 [name=" + name + ", where=" + where + ", open=" + open + "]";
	}
	public static void main(String[] args) {
		PracticeClass0081 store01=new PracticeClass0081();
		store01.setName("쌍둥이국밥");
		store01.setWhere("부산진구");
		store01.setOpen(true);
		System.out.println(store01.toString());
		PracticeClass0081 store02=new PracticeClass0081();
		store02.setName("7번가피자");
		store02.setWhere("부산남구");
		store02.setOpen(true);
		System.out.println(store02.toString());
		PracticeClass0081 store03=new PracticeClass0081();
		store03.setName("맥도날드");
		store03.setWhere("부산사하구");
		store03.setOpen(false);
		System.out.println(store03.toString());
	}

}
