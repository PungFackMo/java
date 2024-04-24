package chapter07;

//책 정보를 가지고 있는 클래스
public class Book {
	private String name;
	private int price;
	private String publisher;
	
	public void setBook(String n, int p, String pu) {
		name=n;
		price=p;
		publisher=pu;
	}
	public void getBook() {
		System.out.println("책 이름 : "+name);
		if(price==0) {
			System.out.println("책 가격 : 무료입니다.");
		}else {
		System.out.println("책 가격 : "+price+"원");
		}
		System.out.println("저자 : "+publisher);
		
	}
	public static void main(String[] args) {
		Book book01=new Book();
		book01.setBook("나의 라임 오렌지 나무", 0, "조제 마우루 지 바스콘셀루스");
		book01.getBook();
	}

}
