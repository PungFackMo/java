package chapter04;

public class ElseIfExample {
	public static void main(String[] args) {
		//else if 문
		/*
		 * if(조건문1){
		 *   실행문A
		 * }else if(조건문2){
		 *   실행문B
		 * }else if(조건문3){
		 *   실행문C
		 * }else{
		 *   실행문D
		 * }
		 * else 블록은 생략 가능 하다.
		 */
		
		int score=62;
		if(score>=90) {
			System.out.println("등급이 A입니다.");
		}else if(score>=80) {
			System.out.println("등급이 B입니다.");
		}else if(score>=70) {
			System.out.println("등급이 C입니다.");
		}else {
			System.out.println("등급이 D입니다.");
		}
		
		
		int useMoney=83650;
		int myMoney=useMoney+33200;
		if((useMoney>=45000)&&(useMoney<=90000)) {
			System.out.println("동백패스 환급금으로 총 "+(useMoney-45000)+
					"원을 받으셨습니다.");
		}else if(useMoney<45000) {
			System.out.println("이번달 동백패스 사용금은 45000원 이하이기에 "
					+ "받으실 환급금은 0원입니다.");
		}else if(useMoney>90000) {
			System.out.println("이번달 동백패스 사용금은 45000원 이상이기에 "
					+ "받으실 환급금은 45000원입니다.(4만 5천원 초과하여 사용시"
					+ "초과 금액 최대 4만5천원을 동백전으로 환급)");
		}
		
		
		
		
		
		
		
		
	}

}
