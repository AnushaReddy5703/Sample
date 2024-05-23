package pack1;

import java.util.stream.Stream;

public class MatchDemo {

	public static void main(String[] args) {
		
		//allMatch
       Stream<String> data=Stream.of("Apple","Banana","Carrot","Mango","WaterMelon");
       boolean allMatch=data.allMatch(name->name.length()==5);
       System.out.println(allMatch);
       
      System.out.println("*****************");
      
      //anyMatch
      Stream<String> datas=Stream.of("Apple","Banana","Carrot","Mango","WaterMelon");
      boolean anyMatch=datas.anyMatch(name->name.length()==5);
      System.out.println(anyMatch);
      
      System.out.println("*****************");
      
      Stream<String> names=Stream.of("Apple","Banana","Carrot","Mango","WaterMelon");
      boolean noneMatch=names.noneMatch(name->name.length()==5);
      System.out.println(noneMatch);
      
      
	}

}
