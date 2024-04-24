package chapter07;

//운동 한개를 저장하는 클래스
public class Workout {
	private String name;
	private int set;
	private int times;
	private int rest;
	
	public void setWorkout(String n, int s, int t, int r) {
		name=n;
		set=s;
		times=t;
		rest=r;
	}
	public void getWorkout() {
		System.out.println("운동이름:"+name);
		System.out.println("세트:"+set+" 세트 \n"+times+
				"분동안 총 갯수:"+set*times+"개");
		System.out.println("휴식 시간:"+rest+"분");
		
	}
	
	public static void main(String[] args) {
		Workout wOut01=new Workout();
		wOut01.setWorkout("푸쉬업", 15, 30, 10);
		wOut01.getWorkout();
		Workout wOut02=new Workout();
		wOut02.setWorkout("윗몸일으키기", 20, 30, 10);
		wOut02.getWorkout();
		
	}

}
