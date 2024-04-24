package chapter07;

//하루 일과 체크 다이어리 프로그램
public class PracticeClass001 {
	private String work;
	private double startTime;
	private double endTime;
	private boolean check;

	
	public void setWorkDiary(String w, double st, double et,boolean c) {
		work=w;
		startTime=st;
		endTime=et;
		check=c;

	}
	public void getWorkDiary() {
		System.out.println("일과 이름 : "+work);
		if(check==true) {
			System.out.println("Check Box : O");
			System.out.println("일과를 시작한 시간 : "+(int)startTime+"시 "+
					(int)((startTime%(int)startTime)*60)+"분");
			System.out.println("일과를 끝낸 시간 : "+(int)endTime+"시 "+
					(int)((endTime%(int)endTime)*60)+"분\n");
		}else {
			System.out.println("Check Box : X");
		}
		
	}
	public static void main(String[] args) {
		PracticeClass001 study=new PracticeClass001();
		study.setWorkDiary("정처기강의", 08.90, 16.30, true);
		study.getWorkDiary();
		PracticeClass001 zim=new PracticeClass001();
		zim.setWorkDiary("헬스", 17.00, 19.00, true);
		zim.getWorkDiary();
		PracticeClass001 work=new PracticeClass001();
		work.setWorkDiary("일", 20.00, 22.00, false);
		work.getWorkDiary();
		
	}
	
	

}
