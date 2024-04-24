package chapter07;

//맛집 리스트 프로그램
public class PracticeClass003 {
	private String name;
	private String where;
	private double open;
	
	public void setStore(String n, String w, double o) {
		name=n;
		where=w;
		open=o;
	}
	public void getStore() {
		System.out.println("가게이름 : "+name);
		System.out.println("가게위치 : "+where);
		System.out.println("가게 오픈 시간 : "+(int)open+"시 "+
				(int)((open%(int)open)*60)+"분\n");
	}
	public static void main(String[] args) {
		PracticeClass003 bab=new PracticeClass003();
		bab.setStore("쌍둥이국밥", "부산 진구", 08.50);
		bab.getStore();
		PracticeClass003 pizza=new PracticeClass003();
		pizza.setStore("7번가피자", "부산 남구", 11.00);
		pizza.getStore();
		PracticeClass003 burger=new PracticeClass003();
		burger.setStore("맥도날드", "부산 사하구", 10.50);
		burger.getStore();
	}
	
	

}
