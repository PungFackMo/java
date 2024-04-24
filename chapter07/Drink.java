package chapter07;

//음료수 자판기 프로그램
//어떤 음료수를 판매 할 건지 음료수 세부 사항
public class Drink {
	private String name;
	private double capacity;
	private int price;
	
	public void setDrink(String n, double c, int p) {
		name=n;
		capacity=c;
		price=p;
	}
	public void getDrink() {
		System.out.println("음료수 이름 : "+name);
		System.out.println("용량 : "+capacity+"ml");
		System.out.println("가격 : "+price);
	}
	
	public static void main(String[] args) {
		Drink ade1=new Drink();
		ade1.setDrink("망고에이드", 180, 3000);
		ade1.getDrink();
		Drink ade2=new Drink();
		ade2.setDrink("데미소다", 250, 5000);
		ade2.getDrink();
		
	}

}
