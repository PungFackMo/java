package chapter07;

//키오스크 프로그램
public class PracticeClass0071 {
	private String name;
	private int price;
	private int count;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "PracticeClass0071 [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	public static void main(String[] args) {
		PracticeClass0071 food01=new PracticeClass0071();
		food01.setName("김치볶음밥");
		food01.setPrice(7000);
		food01.setCount(3);
		System.out.println(food01.toString());
		PracticeClass0071 food02=new PracticeClass0071();
		food02.setName("pizza");
		food02.setPrice(32000);
		food02.setCount(3);
		System.out.println(food02.toString());

	}

}
