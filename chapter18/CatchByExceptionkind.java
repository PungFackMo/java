package chapter18;

//다중 catch
//try 블록 내부는 다양한 예외가 발생할 수 있습니다.
//예외별로 예외 처리 코드를 다르게 작성 가능
public class CatchByExceptionkind {
	
	public static void main(String[] args) {
		try {
			String str1=null;
			str1.toString();
			int num1=10/0;
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌려고 했습니다.");
		}catch(NullPointerException e) {
			System.out.println("null 값이 대입되어 있습니다.");
		}finally {
			System.out.println("항상 실행 코드");
		}
	}
}
