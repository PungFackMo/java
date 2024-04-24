package chapter12.c27;

public class Buyer {
	private int bonusPoint=0;
	
	public void buy(Product p) {
		//Product도 만들 수 있고 Tv도 Computer도 -> 다형성
		p.who();
	}
	public static void main(String[] args) {
		Buyer buyer=new Buyer();
		buyer.buy(new Tv());
		buyer.buy(new Computer());
		buyer.buy(new Product());
		
		Tv tv=new Tv();
		buyer.buy(tv);
		Computer c=new Computer();
		buyer.buy(c);
	}
}
