package chapter07;

//로그인 프로그램
public class PracticeClass005 {
	private String logID;
	private String logPW;
	private boolean pri;
	private String email;
	private String number;
	
	public void setLogin(String id, String pw, boolean p, String e, String n) {
		logID=id;
		logPW=pw;
		pri=p;
		email=e;
		number=n;
	}
	public void getLogin() {
		System.out.println("로그인하실 ID를 입력하십시오\t"+logID);
		System.out.println("로그인하실 PASSWORD를 입력하십시오\t"+logPW);
		if(pri==true) {
			System.out.println("개인 정보 제공에 동의하셨습니다.");
			System.out.println("귀하의 이메일을 입력하십시오\t"+email);
			System.out.println("귀하의 전화번호를 입력하십시오\t"+number+"\n");
		}else {
			System.out.println("개인 정보 제공에 동의하지 않으셨습니다.\n");
		}
	}
	public static void main(String[] args) {
		PracticeClass005 logIn01=new PracticeClass005();
		logIn01.setLogin("kimjava", "java0101", true, 
				"kimjava@naver.com", "010-1234-5678");
		logIn01.getLogin();
		PracticeClass005 logIn02=new PracticeClass005();
		logIn02.setLogin("skdlxmfh", "asdqwe12", true, 
				"skdlxmfh@naver.com", "010-9752-0897");
		logIn02.getLogin();
		PracticeClass005 logIn03=new PracticeClass005();
		logIn03.setLogin("xpxmfkdlwl", "xpxm3535", false, 
				null, null);
		logIn03.getLogin();
		PracticeClass005 logIn04=new PracticeClass005();
		logIn04.setLogin("bug2024", "qlqjs123", false, 
				null, null);
		logIn04.getLogin();
	}

}
