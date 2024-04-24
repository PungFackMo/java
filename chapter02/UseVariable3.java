package chapter02;

public class UseVariable3 {

	public static void main(String[] args) {
	   	//01. 직사각형의 넓이를 구하는 코드 작성
		//02. 직사각형의 둘레를 구하는 코드 작성
		//03. 반지름을 이용하여 원의 둘레는 구하는 코드 작성
		//04. 삼각형의 넓이는 구하는 코드 작성
		//05. 삼각형의 길이를 구하는 코드 작성
		//06. 정사각형의 넓이를 구하는 코드 작성
		//07. 정오각형의 둘레를 구하는 코드 작성
		//08. 정칠각형의 둘레를 구하는 코드 작성
		//09. 정팔각형의 둘레를 구하는 코드 작성
		//10. 오늘 지급받은 3권의 교재의 총 페이지수를
//		      구하는 코드 작성
				
				
		// 직사각형의 넓이 공식
		// a=가로, b=세로
		// a * b
		// a=5, b=7
		int recSideA=5;//rectangleSideA=recSideA
		int recSideB=7;//rectangleSideB=recSideB
		System.out.println(recSideA*recSideB);
				
				
		// 직사각형의 둘레 공식
		// 2a+2b
		System.out.println(2*recSideA+2*recSideB);
				
				
		// 반지름을 이용하여 원의 둘레 공식
		// r=반지름, pi=원주율
		// 2 * pi * r
		// r=7, pi=3.14
		int radius=7;
		double pi=3.14;
		System.out.println(2*pi*radius);

				
		// 삼각형의 넓이 공식
		// a=한 변의 길이, h=높이
		// a * h
		// a=3, h=6
		int triSideA=3;//triangleSideA=triSideA
		int triHigh=6;//triangleHigh=triHigh
		System.out.println(triSideA*triHigh);
				
				
		// 삼각형의 둘레 공식
		// 각 변을 a, b, c
		// a + b + c
		// a=3, b=4, c=5
		int triSideB=4;//triangleSideB=triSideB
		int triSideC=5;//triangleSideC=triSideC
		System.out.println(triSideA+triSideB+triSideC);
				
				
		// 정사각형의 넓이 공식
		// 한 변의 길이 a
		// a*a
		// a=9
		int squSideA=9;//squareSideA=squSideA
		System.out.println(squSideA*squSideA);
				
				
		// 정오각형의 둘레 공식
		// 한 변의 길이 a			
		// 5 * a
		// a=13
		int regPenSideA=13;//regularPentagonSideA=regPenSideA
		System.out.println(5*regPenSideA);
				
				
		// 정칠각형의 둘레 공식
		// 한 변의 길이 a
		// 7 * a
		// a=19
		int regHepSideA=19;//regularHeptangularSideA=regHepSideA
		System.out.println(7*regHepSideA);
				
				
		// 정팔각형의 둘레 공식
		// 한 변의 길이 a
		// 8 * a
		// a=23
		int regOctSideA=23;//regularOctagonSideA=regOctSideA
		System.out.println(8*regOctSideA);
				
				
		//오늘 지급받은 3권의 교재의 총 페이지수를 구하는 코드 작성
		//프로그래밍 언어 활용 총 page 수 = 74
		//정보능력 총 page 수 = 83
		//개발자 환경 구축 총 page 수 = 70
		//프로그래밍 언어 활용 = ProgrammingLanguageUtilization(ProLangUtil)
		//정보능력 = InformationCapability(InfCapabil)
		//개발자 환경 구축 = BuildADeveloperEnvironment(BuildADevEn)
		int ProLangUtilPage=74;
		int InfCapabilPage=83;
		int BuildADevEnPage=70;
		System.out.println(ProLangUtilPage+InfCapabilPage+BuildADevEnPage);
				
				
				
				
	}

}
