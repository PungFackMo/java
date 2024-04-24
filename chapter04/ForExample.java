package chapter04;

public class ForExample {
		public static void main(String[] args) {
			//반복문 : for문, while문, do-while문
			//for문
			/*
			 * for(메인화식;조건식;증감식){
			 *  실행문
			 *  }
			 */
			//1부터 5까지 합을 구하세요
			int sum=0;
			sum=sum+1;
			sum+=2;
			sum=sum+3;
			sum+=4;
			sum=sum+5;
			System.out.println("1~5의 합: "+sum);
			//하드코딩(hard coding)
			//for문을 사용하면 코드를 획기적으로 줄인다
			int sum1=0;
			for(int i=1;i<=5;i++) {
				sum1=sum1+i;
			}
			System.out.println("1~5의 합:"+sum1);
			
			//메인화식의 변수는 일반 변수처럼 이름을 지어 사용 가능
			//메인화식의 변수는 소괄호와 중괄호 내에서 사용 가능
			for(int variable=0;variable<10;variable++) {
				
			}
			//메인화식의 메인화 값은 데이터 타입만 맞으면 됩니다.
			for(int i=0;i<10;i++) {
				
			}
			
			for(int i=0;i<10;i++) {
				System.out.println("I love java");
				//1. 메인화식
				//2. 조건식
				// 조건식이 true일 경우에만 실행문이 실행된다
				//3. {} 실행문이 실행된다
				//4. 증감식
				//5. 조건식 - 실행문 - 증감식
				// 조건식이 false가 되면 반복문은 끝난다
			}
			for(int i=0;i<3;i++) {
				System.out.println(i);//0,1,2
			}
			//1부터 100까지 합을 출력
			int totalSum=0;
		
			for(int i=1;i<=100;i++) {
				totalSum+=i;
			}
			System.out.println("1~100 합:"+totalSum);
			
			for(int i=0;i<10;i++) {
				
			}
			for(int i=0;i<10;i++) {
				
			}
			//중첩 for문
			//바깥쪽 for문이 한 번 실행할 때 마다 
			//중첩된 for문은 지정된 횟수만큼 반복해서 돈다 
			for(int i=0;i<3;i++) {
				for(int j=0;j<5;j++) {
					System.out.println("i = "+i+" j="+j);
				}
			}
			for(int i=0;i<10;i++) {
				
			}
			//기본 for문 10번씩 써보기
			
			for(int i=0;i<10;i++) {
				
			}
			for(int i=0;i<5;i++) {
				
			}
			for(int i=3;i<10;i++) {
				
			}
			for(int i=4;i<20;i++) {
				
			}
			for(int i=20;i>10;i--) {
				
			}
			for(int i=3;i<10;i++) {
				
			}
			for(int i=0;i<11;i++) {
				
			}
			for(int i=0;i<13;i++) {
				
			}
			for(int i=1;i<11;i++) {
				
			}
			for(int i=2;i<12;i++) {
				
			}
			
			//중첩 for문 이용한 구구단
			for(int x=1;x<10;x++) {
				System.out.println(x+"단");
				for(int y=1;y<10;y++) {
					System.out.println(x+" x "+y+"="+(x*y));
				}
			}

			
			
			
			
			
			
		}
}
