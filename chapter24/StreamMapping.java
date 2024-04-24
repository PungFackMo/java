package chapter24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapping {
	public static void main(String[] args) {
		//맵핑
		//맵핑이란? 집합(자료구조)들 간의 대응
		//스트림 맵핑이란 자료구조에서 요소들을 새로운 요소로 매칭시켜서 새로운 스트림을 생성
		List<String> s1=Arrays.asList("Toy","Robot","Box");
		//맵핑 1->a , 2->b  //1을 a로 연결시켜라, 2를 b로 연결시켜라
		//문자열의 길이로 매칭시켜서 새로운 스트림 생성
		//map()
		//매개변수에는 기존의 배열에서 요소를 순차적으로 대임
		//리턴문에서는 새로운 배열로 배칭 시킬 데이터
		s1.stream()
			.map(s->s.length())
			.forEach(n->System.out.println(n));
		Stream<Integer> si=s1.stream()
				.map(s->s.length());
		List<Integer> il=s1.stream()
				.map(s->s.length())
				.collect(Collectors.toList());
		for(int i:il) {
			System.out.println(i);
		}
	}

}
