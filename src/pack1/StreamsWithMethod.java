package pack1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsWithMethod {
	public  List<String> search(List<String> list) {
	    return list.stream()
	        .filter(str -> str.startsWith("a") && str.length() == 3)
	        .collect(Collectors.toList());
	  }

	public static void main(String[] args) {
		List<String> myList=Arrays.asList("ant","cockroach","lizard");
        
		StreamsWithMethod obj=new StreamsWithMethod();
		System.out.println(obj.search(myList));
	}

}
