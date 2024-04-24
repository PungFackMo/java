package chapter05;

public class ArrayCreate002 {

	public static void main(String[] args) {
		// new 연산자로 배열 생성
		//타입[] 변수=new 타입[길이];
		//길이 - 배열이 저장할 수 있는 값의 개수
		//길이가 5인 int[]배열을 생성
		int[] intArray=new int[5];
		int[] intArr= {0,0,0,0,0};
		
		//new 연산자로 배열을 처음 생성할 경우
		//0이라는 기본값으로 메인화됩니다
		for(int i=0;i<5;i++) {
			System.out.println(intArray[i]);
			
		}
		//타입별로 배열의 메인값
		//int[] / 0 
		//double[] / 0.0
		//boolean[] / false
		//String[] / null
		//null - 비어있다 
		String[] strArr=new String[3];
		for(int i=0;i<3;i++) {
			System.out.println(strArr[i]);
		}
		//클래스와 인터페이스 타입만 null을 사용 가능
		//기본 데이터 타입에서는 null사용이 불가 하다
		String str=null;
//		int n1=null;
		int[] intArr1=null;
		intArr1=new int[5];
		
		int[] arr1=new int[3];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		for(int i=0;i<3;i++) {
			System.out.println(arr1[i]);
			
		}
		String[] arr2=new String[3];
		arr2[0]="1월";
		arr2[1]="2월";
		arr2[2]="3월";
		for(int i=0;i<3;i++) {
			System.out.println(arr2[i]);
		}
		
		
		
		
		
		
	}

}
