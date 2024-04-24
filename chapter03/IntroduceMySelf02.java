package chapter03;

public class IntroduceMySelf02 {
	public static void main(String[] args) {
		
		
		String name="여정모";
		int age=30;
		double tall=171.7;
		int footSize=265;
		String fav01="영화보기";
		String movie01="파묘";
		int ticketPrice=15000;
		int people=2;
		int ticketCoupon=2;
		int totalPrice;
		totalPrice=(people*ticketPrice-(ticketCoupon*ticketPrice));
		int myMoney=20000;
		int popcornSet=15000;
		
		
		
		System.out.println("저의 이름은 "
				+ name
				+ "입니다");
		System.out.println("저의 나이는 "
				+ age
				+ "살이며"
				+ " 키는 "
				+ tall
				+ "입니다.");
		System.out.println("발 사이즈는 "
				+ footSize
				+ "입니다." );

		System.out.println("저는 " + fav01 + "를 좋아 합니다.");
		System.out.println("최근에 본 영화는 " + movie01 + "이며 여자친구와 같이 "
				+ "보러갔습니다.");
		System.out.println("영화표의 가격은 " + ticketPrice*2 
				+ "원 이였지만 저는 쿠폰이 " + ticketCoupon 
				+ "장이 있어 총 가격이" + totalPrice +"이다.");
		System.out.print("영화를 볼때는 무조건 팝콘세트를 먹는다."
				+ "나는 지갑에 " + myMoney + "원이 있으므로");
		if(myMoney >= popcornSet) {
			System.out.println(" 팝콘세트를 사먹을 수 있다.");
		} else if(myMoney < popcornSet) {
			System.out.println(" 팝콘세트를 사먹을 수 없다.");
			
		}
		System.out.println("나의 가족은 어머니, 아버지, 형, 강아지, 고양이가 있다.");
		String dogName="코코";
		String catName="미소";
		System.out.println("강아지의 이름은 " + dogName + "이고,"
				+ " 고양이의 이름은 " + catName +"이다.");
		int dogAge=3;
		int catAge=14;
		System.out.println(dogName + "는 " + dogAge + "살 이고, "
				+ catName + "는 " + catAge + "살 이다.");
		System.out.println(dogName + "는 항상 " + catName  
				+ "한테 깝치다가 맞고 도망간다.");
		System.out.println("고양이의 나이를 사람나이로 비유하면" + catAge*7 
				+ "살 이라고 한다.");		
		}
			
		
		
		
		
		
		
	}

