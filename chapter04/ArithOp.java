package chapter04;

public class ArithOp {

	public static void main(String[] args) {
		// "ArithOp"은 "Arithmetic Operation"의 줄임말입니다. 
		//즉, 산술 연산을 나타냅니다. 
		//이 용어는 주로 프로그래밍이나 수학에서 사용되며, 
		//덧셈, 뺄셈, 곱셈, 나눗셈과 같은 기본적인 산술 연산을 의미합니다.
		
		//연산자
		//대입 연산자와 산술 연산자
		// = - 연산자 오른쪽에 있는 값을 연산자 왼쪽에 대입
		// + - 두 피 연산자의 값을 더한다.
		// - - 빼기
		// * - 곱하기
		// / - 나누기
		// % - 나머지를 변환하는 연산자
		int n1=10;
		int n2=3;
		int result=n1/n2;
		System.out.println(result);
		int r1=n1%n2;
		System.out.println(r1);
		//연산자의 우선순위
		int r2=3+3*2;
		System.out.println(r2);
		// *, / 나누기가 우선 연산 된다.
		int r3=(3+3)*2;
		System.out.println(r3);
		//우선 순위를 위해 소괄호를 사용 가능
		
		
		//복합 대입 연산자
		int num=1;
		num=num+5;
		num+=5;//num=num+5
		int num1=0;
		num1+=1;
		System.out.println(num1);//1
		System.out.println(num1+=5);//6
		System.out.println(num1+=15);//21
		// a=a-b -> a-=b
		// a=a*b -> a*=b
		// a=a/b -> a/=b
		// a=a%b -> a%=b
		
		//관계 연산자
		//값은 true or false(참이나 거짓)
		// < - n1<n2 - n1이 n2보다 작은가?
		int number1=0;
		int number2=1;
		System.out.println(number1<number2);
		// 0<1 - true
		boolean b1=number1<number2;
		System.out.println(b1);
		
		// > - n1>n2 - n1이 n2보다 큰가?
		System.out.println(number1>number2);
		
		// <= - 같거나 작은가( 또는 or)
		System.out.println(number1<=number2);
		
		// >= - 같거나 큰가?
		System.out.println(number1>=number2);
		int number3=0;
		System.out.println(number1>=number3);
		
		// == - 같은가?
		System.out.println(number1==number2);
		// 데이터 타입과 값이 다 같아야 == 값이 true
		String stringTypeNumber="0";
//		System.out.println(number1==stringTypeNumber);
		
		// != - 다른가?
		System.out.println(number1!=number2);
		//정수와 실수를 비교 할 때는 값만 비교한다
		int num2=42;
		double d1=42.0;
		System.out.println(num2==d1);
		
		// 논리 연산자
		// & - 엠퍼센트
		// && - 논리and, A&&B - A와 B 모두 true이면
		// 연산 결과는 true
		// 논리 and(&&)
		// 피연산자1/ 피연산자2 / 연산 결과
		// true/ true / true
		// false/ true / false
		// true/ false / false
		// false/ false / false
		System.out.println(true&&true);
		System.out.println(false&&true);
		System.out.println((0>1)&&(1>2));
		System.out.println((0>1)&&(1<2));
		System.out.println((0<1)&&(1<2));
		// 논리 OR - || 
		// A||B -> A와 B 둘 중 하나라도 true이면
		// 연산 결과는 true
		// 마우스 또는 키보드 가져와 마우스만 O, 키보드 O
		// 마우스 키보드 O 마우스X키보드X
		// 피연산자1 / 피연산자2 / 연산 결과
		// true   / true   / true
		// true   / false  / true
		// false  / true   / true
		// false  / false  / false
		
		
		// 논리 NOT - ! - 반전
		// !A - 연산 결과는 A가 true 이면 false
		//                  false 이면 true
		// 피연산자 / 연산 결과
		// true / false
		// false / true
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(0<1));
		boolean b3=0<1;
		System.out.println(!b3);
		
		
		

	}

}
