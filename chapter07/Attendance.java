package chapter07;

//출석 관리 프로그램
//변수 앞에 private, 메소드 앞에 public
public class Attendance {
	private String stuName;
	private String enterRoomTime;
	private String leavingRoomTime;
	
	public void setAttendance(String s, String e, String l) {
		stuName=s;
		enterRoomTime=e;
		leavingRoomTime=l;
	}
	public void getAttendance() {
		System.out.println("훈련생 이름 : "+stuName);
		System.out.println("입실 시간 : "+enterRoomTime);
		System.out.println("퇴실 시간 : "+leavingRoomTime);
	}
	
	
	
	public static void main(String[] args) {
		Attendance att1=new Attendance();
		att1.setAttendance("김자바", "08:30", "16:50");
		att1.getAttendance();
		Attendance att2=new Attendance();
		att1.setAttendance("김클래스", "08:50", "16:53");
		att1.getAttendance();
		
		
	}

}
