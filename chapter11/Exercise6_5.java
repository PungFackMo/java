package chapter11;

public class Exercise6_5 {
	public static class PlayingCard{
		int kind; //인스턴스 변수
		int num; //인스턴스 변수
		
		static int width; //클래스변수(static 변수)
		static int height; //클래스변수(static 변수)
		
		PlayingCard(int k, int n){
			kind=k; 
			num=n;
		}
		//지역변수 ?*** k, n, card, args
		public static void main(String[] args) {
			PlayingCard card=new PlayingCard(1,1);
		}
	}
}
