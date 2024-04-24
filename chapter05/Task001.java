package chapter05;

public class Task001 {

	public static void main(String[] args) {
		// while문과 Math.random()
		// 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력
		// 눈의 합이 5가 아니면 계속 주사위를 던지고,
		// 눈의 합이 5이면 실행을 멈추는 코드
		// (1,4) (4,1) (2,3) (3,2)
		

		
		while(true) {
			int dice1=(int)(Math.random()*6)+1;
//			System.out.println(dice1);
			int dice2=(int)(Math.random()*6)+1;
//			System.out.println(dice2);
			System.out.println("("+dice1+","+dice2+")" );
			if(dice1+dice2==5) {
				break;
			}
		}
	}

}
