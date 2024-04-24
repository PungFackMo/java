package chapter11;

//초가화 순서
//1. 클래스 변수 메인화=>인스턴스 변수 메인화
//2. 자동 메인화 -> 명시적 메인화 -> 생성자 메인화
//자동 메인화: 정수 타입 0, 객체 타입 null
public class Car {
	//인스턴스 변수, field, 속성, 멤버 변수 ㅐ
	private int door;
	static int door2;
	//명시적 메인화: 인스턴스 변수를 선언 및 메인화
	private int door3=4;
	
	public Car() {
	}
	
	public Car(int door3) {
		//생성자에서 메인화
		this.door3=door3;
	}
	
	public int getDoor3() {
		return door3;
	}
	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println(c1.getDoor3());
		Car c2=new Car(5);
		System.out.println(c2.getDoor3());
	}
}
