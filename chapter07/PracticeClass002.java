package chapter07;

//키오스크 프로그램
public class PracticeClass002 {
	private String name;
	private int price;
	private int count;
	
	public void setKey(String n, int p, int c) {
		name=n;
		price=p;
		count=c;
	}
	public void getKey() {
		System.out.println("음식 이름 : "+name);
		System.out.println("가격 : "+price+"원");
		System.out.println("갯수 : "+count+" 개");
		if(price*count>=50000) {
			System.out.println("5만원 이상 구매시 5% 할인");
			System.out.println("총 할인된 금액 : "+(int)(price*count*0.05)+"원");
			System.out.println("할인 후 총 금액 : "+(int)(price*count*0.95)+"원");
		}else {
			System.out.println("총 금액 : "+price*count+"원");
		}
		
	}
	public static void main(String[] args) {
		PracticeClass002 rice=new PracticeClass002();
		rice.setKey("김치볶음밥", 7000, 3);
		rice.getKey();
		PracticeClass002 pizza=new PracticeClass002();
		pizza.setKey("피자", 32000, 3);
		pizza.getKey();
		
	}
	

}
