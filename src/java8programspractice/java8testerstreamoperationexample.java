package java8programspractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8testerstreamoperationexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Filtering the list to exclude the empty elements
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("Strings ");
		strings.forEach(System.out::println); // forEach is used to iterate over each element
		System.out.println("Filtered");
		filtered.forEach(System.out::println);
		
		//Iterating list of randomnumbers
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println("list of unique squares through map");
		squaresList.forEach(System.out::println);
		
		
		List<String>strings1 = Arrays.asList("abc", "", "bc","", "efg", "abcd","", "jkl");

		//get count of empty string
		int count = (int) strings1.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty strings in above stringlist is "+count);
		System.out.println("Sorted stream is :");				
		strings1.stream().sorted().forEach(System.out::println);
		
		//collect list of empty strings in list or string format
		
		List<String>strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered1 = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered List: " + filtered1);
		String mergedString = strings2.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		
		String streamOfString = (Pattern.compile(", ").splitAsStream("abc, cd")).collect(Collectors.joining(","));
		System.out.println(streamOfString);
		
		Stream<String> stream = 
				  Stream.of("a", "b", "c").filter(element -> element.contains("b"));
				Optional<String> anyElement = stream.findAny();
		System.out.println("anyElement "+anyElement.toString());	
//		Optional<String> firstElement = stream.findFirst(); it will throw IllegalStateException
				
		List<String> elements =
				  Stream.of("a", "b", "c").filter(element -> element.contains("b"))
				    .collect(Collectors.toList());
				Optional<String> anyelement = elements.stream().findAny();
				Optional<String> firstelement = elements.stream().findFirst();
				System.out.println("anyelement"+anyelement.toString());
				System.out.println("firstelement"+firstelement.toString());
				
				Stream<String> onceModifiedStream =
						  Stream.of("abcd", "bbcd", "cbcd").skip(1);
				onceModifiedStream.forEach(System.out::println);
		
				List<String> twiceModifiedStream = Stream.of("abcd", "bbcd", "cbcd").skip(1).map(element -> element.substring(0, 3)).collect(Collectors.toList());
				twiceModifiedStream.forEach(System.out::println);
				
				//findFirst
				 List<String> list = Arrays.asList("AE1", "AeB1", "AC2", "D");

				    //Optional<String> result = list.stream().filter(element->element.contains("D")).findFirst();
				 Stream<String> result = list.stream().filter(element->{return element.contains("2");});
				result.forEach(System.out::println);
				
				
	}

}
