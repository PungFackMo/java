package chapter06;

public class Method002 {
	public static void main(String[] args) {
		hiEveryone(18,172);
//		hiEveryone(12);
//		hiEveryone("문자열",12.5);(x)
		double myHeight=13.5;
		hiEveryone(12, myHeight);
		byEveryone();
	}
	
	//매개변수가 둘인 메소드의 정의 - 입력은 있지만 출력은 없는
	public static void hiEveryone(int age,double height) {
		System.out.println("제 나이는 "+age+"세 입니다.");
		System.out.println("제 키는"+height+"cm입니다.");
		
	}
	
	//매개변수가 없는 메소드의 정의
	//void - 반환(출력)이 없다
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다");
		
	}
	
}
