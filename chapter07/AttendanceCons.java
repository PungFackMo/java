package chapter07;

public class AttendanceCons {
	private String stuName;
	private String enterRoomTime;
	private String leavingRoomTime;
	
	
	public AttendanceCons(String stuName, String enterRoomTime, String leavingRoomTime) {
		super();
		this.stuName = stuName;
		this.enterRoomTime = enterRoomTime;
		this.leavingRoomTime = leavingRoomTime;
	}


	@Override
	public String toString() {
		return "AttendanceCons [stuName=" + stuName + ", enterRoomTime=" + enterRoomTime + ", leavingRoomTime="
				+ leavingRoomTime + "]";
	}


	public static void main(String[] args) {
		//1. 생성자로 인스턴스 변수 값을 메인화
		AttendanceCons ac=new AttendanceCons("김자바", "08:00", "16:50");
		System.out.println(ac.toString());
	}

}
