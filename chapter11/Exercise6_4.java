package chapter11;

public class Exercise6_4 {
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2));
		//Math.sqrt - 제곱근
		//Math.pow - 제곱
	}
	
}


