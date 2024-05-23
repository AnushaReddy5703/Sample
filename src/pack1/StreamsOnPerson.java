package pack1;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsOnPerson {

	public static void main(String[] args) {
		List<Personn>names=PersonRepository.getAllPersons();
		//names of all persons
		List<String> outputNames= names.stream()
				                 .map(Personn::getName)
				                 .collect(Collectors.toList());
      System.out.println(outputNames);
      
      
      System.out.println("***************************");
      
      //gender of all persons
      List<String> outputGender=names.stream()
    		                    .map(Personn::getGender)
    		                    .collect(Collectors.toList());
      System.out.println(outputGender);
      
      System.out.println("***************************");
      
      //names whose height is GT 110
      List<String> namesGT110=names.stream()
    		                 .filter(height->height.getHeight()>110)
                             .map(Personn::getName)
                             .collect(Collectors.toList());
      System.out.println("Whose height is GT110 :"+namesGT110);
	}
}
