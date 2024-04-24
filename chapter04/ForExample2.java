package chapter04;

public class ForExample2 {
	public static void main(String[] args) {
		//for문을 이용해서 1부터 100까지의 정수 중에서
		//3의 배수의 총합을 구하는 코드를 작성해 보세요
		//for문
		/*
		 * for(메인화식;조건식;증감식){
		 *  실행문
		 *  }
		 */
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
			}
			
		}
		System.out.println(sum);
	}
}
