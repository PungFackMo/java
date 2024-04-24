package chapter06;

public class MethodTask002 {
	public static void main(String[] args) {
		//두 수를 입력 받아 더한 값을 리턴 해주는 함수 만들기
		System.out.println(adder(1,2));
		//두 수를 입력 받아 뺀 값을 리턴 해주는 함수 만들기
		System.out.println(subtract(3, 2));
		//두 수를 입력 받아 곱한 값을 리턴 해주는 함수 만들기
		System.out.println(multyply(4, 5));
		//두 수를 입력 받아 나눈 값을 리턴 해주는 함수 만들기
		System.out.println(divide(7.5,1.5));
		//두 수를 입력 받아 나머지 값을 리턴 해주는 함수 만들기
		System.out.println(remain(8, 9));
		//직사각형의 두변을 입력 받아 둘레는 리턴 해주는 함수
		System.out.println(recRound(4, 5));
		//직사각형의 두변을 입력 받아 넓이를 리턴 해주는 함수
		System.out.println(recArea(6, 2));
		//삼각형의 밑변과 높이를 입력 받아 넓이를 리턴 해주는 함수
		System.out.println(triArea(7, 4));
		//원의 반지름을 입력 받아 넓이는 리턴 해주는 함수
		System.out.println(circleArea(3));
		//정사각형의 한변을 입력 받아 넓이는 리턴 해주는 함수
		System.out.println(square(5));
		
	}
	public static int adder(int num1,int num2) {
		return(num1+num2);
	}
	public static int subtract(int num1,int num2) {
		return(num1-num2);
	}
	public static double multyply(double num1,double num2) {
		return(num1*num2);
	}
	public static double divide(double num1,double num2) {
		return(num1/num2);
	}
	public static int remain(int num1,int num2) {
		return(num1%num2);
	}
	public static int recRound(int recSideA, int recSideB) {
		return(2*(recSideA*recSideB));
	}
	public static int recArea(int recSideA, int recSideB) {
		return(recSideA*recSideB);
	}
	public static int triArea(int triSide, int triHigh) {
		return(triSide*triHigh/2);
	}
	public static  double circleArea(double radius) {
		double pi=3.14;
		return(2*radius*pi);
	}
	public static int square(int squSide) {
		return(squSide*squSide);
	}

}
