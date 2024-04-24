package chapter07;

//로그인 프로그램
public class PracticeClass010 {
	private String logID;
	private String logPW;
	private boolean pri;
	private String email;
	private String number;
	public PracticeClass010(String logID, String logPW, boolean pri, String email, String number) {
		super();
		this.logID = logID;
		this.logPW = logPW;
		this.pri = pri;
		this.email = email;
		this.number = number;
	}
	@Override
	public String toString() {
		return "PracticeClass010 [logID=" + logID + ", logPW=" + logPW + ", pri=" + pri + ", email=" + email
				+ ", number=" + number + "]";
	}
	public static void main(String[] args) {
		PracticeClass010 logIn01=new PracticeClass010("kimjava", "java0101", true, "kimjava@naver.com", "010-1234-5678");
		System.out.println(logIn01.toString());
		PracticeClass010 logIn02=new PracticeClass010("skdlxmfh", "asdqwe12", true, "skdlxmfh@naver.com", "010-9752-0897");
		System.out.println(logIn02.toString());
		PracticeClass010 logIn03=new PracticeClass010("xpxmfkdlwl", "xpxm3535", false, null, null);
		System.out.println(logIn03.toString());
		PracticeClass010 logIn04=new PracticeClass010("bug2024", "qlqjs123", false, null, null);
		System.out.println(logIn04.toString());
	}

}
