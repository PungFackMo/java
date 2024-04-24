package chapter07;

//키오스크 프로그램
public class PracticeClass007 {
	private String name;
	private int price;
	private int count;
	
	public PracticeClass007(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	@Override
	public String toString() {
		return "PracticeClass007 [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
	public static void main(String[] args) {
		PracticeClass007 food01=new PracticeClass007("김치볶음밥", 7000, 3);
		System.out.println(food01.toString());
		PracticeClass007 food02=new PracticeClass007("피자", 32000, 3);
		System.out.println(food02.toString());

	}

}
