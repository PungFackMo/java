package chapter07;

//하루 일과 체크 다이어리 프로그램
public class PracticeClass0061 {
	private String work;
	private String check;
	private String time;
	
	//게더세더 사용
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "PracticeClass0061 [work=" + work + ", check=" + check + ", time=" + time + "]";
	}
	public static void main(String[] args) {
		PracticeClass0061 diary01=new PracticeClass0061();
		diary01.setWork("정처기강의");
		diary01.setCheck("Check Box : O");
		diary01.setTime("08:50 시작");
		System.out.println(diary01.toString());
		PracticeClass0061 diary02=new PracticeClass0061();
		diary02.setWork("헬스");
		diary02.setCheck("Check Box : O");
		diary02.setTime("17:00 시작");
		System.out.println(diary02.toString());
		PracticeClass0061 diary03=new PracticeClass0061();
		diary03.setWork("산책");
		diary03.setCheck("Check Box : X");
		diary03.setTime(null);
		System.out.println(diary03.toString());
	}
}
