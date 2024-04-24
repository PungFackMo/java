package chapter07;

public class News {
	String title;
	String content;
	
	public void setNews(String sTitle, String sContent) {
		title=sTitle;
		content=sContent;
	}
	public void getNews() {
		System.out.print("뉴스 제목: ");
		System.out.println(title);
		System.out.print("뉴스 내용 : ");
		System.out.println(content);
	}
	
	public static void main(String[] args) {
		//클래스는 인스턴스 생성해서 사용
		News news1=new News();
		news1.setNews("30만원대 갤럭시 A15 LTE 출시", 
				"삼성전자가 가성비를 중시하는 소비자들을 위해...");
		news1.getNews();
		News news2=new News();
		news2.setNews("쉅안듣는 지두윤"+ " 지두윤은 누구인가?"
				, "쉅안듣는 지두윤의 의미는?");
		news2.getNews();
		
	}

}
