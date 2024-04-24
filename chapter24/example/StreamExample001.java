package chapter24.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample001 {
	public static void main(String[] args) {
		//1. map
		List<String> words = Arrays.asList("apple","banana","cherry");
		List<Integer> wordLengths=words.stream()
										.map(String::length)
										.collect(Collectors.toList());
		System.out.println("1.map : \t"+wordLengths);
		
		//2. filter
		List<String> fruits01 = Arrays.asList("apple","banana","cherry");
		List<String> filteredFruits=fruits01.stream()
										.filter(s->s.startsWith("b"))
										.collect(Collectors.toList());
		System.out.println("2.filter : \t"+filteredFruits);
		
		//3. forEach
		List<String> fruits02 = Arrays.asList("apple","banana","cherry");
		fruits02.stream()
				.forEach(s->System.out.println("3.forEach : \t"+s));
		
		//4. collect
		List<String> fruits03 = Arrays.asList("apple","banana","cherry");
		String result = fruits02.stream()
				.collect(Collectors.joining(", "));
		System.out.println("4.collect : \t"+result);
		
		//5. reduce
		List<Integer> numbers01 = Arrays.asList(1,2,3,4,5);
		Optional<Integer> sum=numbers01.stream()
									.reduce((a,b)->a+b);
		System.out.println("5.reduce : \t"+sum);
		
		//6. sorted
		List<Integer> numbers02 = Arrays.asList(5, 3, 1, 4, 2);
		List<Integer> sortedNumbers=numbers02.stream()
										.sorted()
										.collect(Collectors.toList());
		System.out.println("6.sorted : \t"+sortedNumbers);
		
		//7. distinct
		List<Integer> numbers03 = Arrays.asList(1, 2, 3, 1, 2, 4, 5);
		List<Integer> distinctNumbers=numbers03.stream()
											.distinct()
											.collect(Collectors.toList());
		System.out.println("7.distinct : \t"+distinctNumbers);
		
		//8. flatMap
		List<List<Integer>> numbers04 = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
		List<Integer> flattenedNumbers=numbers04.stream()
											.flatMap(List::stream)
											.collect(Collectors.toList());
		System.out.println("8.flatMap : \t"+flattenedNumbers);
		
		//9. findFirst & findAny
		List<Integer> numbers05 = Arrays.asList(1,2,3,4,5);
		Optional<Integer> firstNumber=numbers05.stream().findFirst();
		System.out.println("9.findFirst : \t"+firstNumber);
		
		//10. skip
		List<Integer> numbers06 = Arrays.asList(1,2,3,4,5);
		List<Integer> skippedNumbers=numbers06.stream()
											.skip(2)
											.collect(Collectors.toList());
		System.out.println("10.skip : \t"+skippedNumbers);
		
		//11. limit
		List<Integer> numbers07 = Arrays.asList(1,2,3,4,5);
		List<Integer> limitedNumbers=numbers07.stream()
											.limit(3)
											.collect(Collectors.toList());
		System.out.println("11.limit : \t"+limitedNumbers);



		
	}

}
