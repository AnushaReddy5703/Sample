package pack1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTask {
	

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");
		
		long count=names.stream()
				   .filter(data->data.length()>3)
				   .count();
		System.out.println("Count of datas having length greater than 3 : "+count);
		
		
		System.out.println("---------------------");
		
		
		List<String> namesUpper=names.stream()
				                .map(String::toUpperCase)
				                .collect(Collectors.toList());
		System.out.println(namesUpper);
		
		
		System.out.println("---------------------");
		
		List<String> cityList = Arrays.asList("chennai", "mumbai", "bangalore", " ", "delhi", "chicago");
		
		//Converting to upperCase
		List<String> cityUpper=cityList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
		System.out.println(cityUpper);
		
		
		System.out.println("---------------------");
		
		//length is greater than 6
		List<String> citycount=cityList.stream()
				   .filter(data->data.length()>6)
				   .collect(Collectors.toList());
		System.out.println("Cities whose length is greaterthan 6 :"+citycount);
		
		System.out.println("---------------------");
		
		//cities start with c
		List<String> cityStartWithC=cityList.stream()
				                    .filter(name->name.startsWith("c"))
				                    .collect(Collectors.toList());
		System.out.println("Cities start with c :"+cityStartWithC);
		
		System.out.println("---------------------");
	
		//cities contain ai
		List<String> cityContainsAI=cityList.stream()
				                    .filter(city->city.contains("ai"))
				                    .collect(Collectors.toList());
		System.out.println("Cities containing ai :"+cityContainsAI);
		
		
		System.out.println("---------------------");
		
		//append Metro
		List<String> appendMetro=cityList.stream()
				                 .map(city->city.concat("metro"))
				                 .collect(Collectors.toList());
		System.out.println("appending metro :" +appendMetro);
		
		System.out.println("---------------------");
		
		//city count start with c
		long cityCountStartWithC=cityList.stream()
                .filter(name->name.startsWith("c"))
                .count();
        System.out.println("Cities start with c :"+cityCountStartWithC);
        
        
        System.out.println("---------------------");
        
        
        //count empty string
        long emptyString=cityList.stream()
        		                 .filter(String::isEmpty)
        		                 .count();
		System.out.println("count of empty string :" +emptyString);
		
		System.out.println("---------------------");
		
		//remove empty string
		List<String> removeEmptyString=cityList.stream()
                .filter(city->city.length()!=0)
                .collect(Collectors.toList());
        System.out.println("remove of empty string :" +removeEmptyString);
        
        
       
	}

}
