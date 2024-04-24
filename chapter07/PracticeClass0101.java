package chapter07;

//로그인 프로그램
public class PracticeClass0101 {
	private String logID;
	private String logPW;
	private boolean pri;
	private String email;
	private String number;
	public String getLogID() {
		return logID;
	}
	public void setLogID(String logID) {
		this.logID = logID;
	}
	public String getLogPW() {
		return logPW;
	}
	public void setLogPW(String logPW) {
		this.logPW = logPW;
	}
	public boolean isPri() {
		return pri;
	}
	public void setPri(boolean pri) {
		this.pri = pri;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "PracticeClass0101 [logID=" + logID + ", logPW=" + logPW + ", pri=" + pri + ", email=" + email
				+ ", number=" + number + "]";
	}
	public static void main(String[] args) {
		PracticeClass0101 logIn01=new PracticeClass0101();
		logIn01.setLogID("kimjava");
		logIn01.setLogPW("java0101");
		logIn01.setPri(true);
		logIn01.setEmail("kimjava@naver.com");
		logIn01.setNumber("010-1234-5678");
		System.out.println(logIn01.toString());
		PracticeClass0101 logIn02=new PracticeClass0101();
		logIn02.setLogID("skdlxmfh");
		logIn02.setLogPW("asdqwe12");
		logIn02.setPri(true);
		logIn02.setEmail("skdlxmfh@naver.com");
		logIn02.setNumber("010-9752-0897");
		System.out.println(logIn02.toString());
		PracticeClass0101 logIn03=new PracticeClass0101();
		logIn03.setLogID("xpxmfkdlwl");
		logIn03.setLogPW("xpxm3535");
		logIn03.setPri(false);
		logIn03.setEmail(null);
		logIn03.setNumber(null);
		System.out.println(logIn03.toString());
		PracticeClass0101 logIn04=new PracticeClass0101();
		logIn04.setLogID("bug2024");
		logIn04.setLogPW("qlqjs123");
		logIn04.setPri(false);
		logIn04.setEmail(null);
		logIn04.setNumber(null);
		System.out.println(logIn04.toString());
		
		
		
		
	}

}
