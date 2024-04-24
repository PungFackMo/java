package chapter07;

//하루 일과 체크 다이어리 프로그램
public class PracticeClass006 {
	private String work;
	private String check;
	private String time;
	//생성자 사용
	public PracticeClass006(String work, String check, String time) {
		super();
		this.work = work;
		this.check = check;
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "PracticeClass006 [work=" + work + ", check=" + check + ", time=" + time + "]";
	}
	public static void main(String[] args) {
		PracticeClass006 diary01=new PracticeClass006("정처기강의", "Check Box : O", "08:50 시작");
		System.out.println(diary01.toString());
		PracticeClass006 diary02=new PracticeClass006("헬스", "Check Box : O", "17:00 시작");
		System.out.println(diary02.toString());
		PracticeClass006 diary03=new PracticeClass006("산책", "Check Box : X", null);
		System.out.println(diary03.toString());
		
		
	}

		
	}
	
	


