package chapter07;

public class AttendanceGS {
	private String stuName;
	private String enterRoomTime;
	private String leavingRoomTime;
	
	//////////////////////////////////////////////////////////
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	////////////////////////////////////////////////////////

	public String getEnterRoomTime() {
		return enterRoomTime;
	}
	public void setEnterRoomTime(String enterRoomTime) {
		this.enterRoomTime = enterRoomTime;
	}
	////////////////////////////////////////////////////////

	public String getLeavingRoomTime() {
		return leavingRoomTime;
	}
	public void setLeavingRoomTime(String leavingRoomTime) {
		this.leavingRoomTime = leavingRoomTime;
	}
	////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "AttendanceGS [stuName=" + stuName + ", enterRoomTime=" + enterRoomTime + ", leavingRoomTime="
				+ leavingRoomTime + "]";
	}

	public static void main(String[] args) {
		AttendanceGS ags=new AttendanceGS();
		ags.setStuName("김자바");
		ags.setEnterRoomTime("08:50");
		ags.setLeavingRoomTime("16:51");
		System.out.println(ags.toString());
		//1. 생성자 사용
		//2. 게더세더 사용
		//4:50분 전까지 오전에 만들었떤 5개 클래스를 
		//두개의 방법으로 변환(자동 완성 사용)
		
	}

}
