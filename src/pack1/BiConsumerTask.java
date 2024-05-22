package pack1;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTask {

	public static void main(String[] args) {
      BiConsumer<Integer,Integer> integerAdd=(a,b)-> System.out.println(a+b);
      integerAdd.accept(5, 5);
      
      BiConsumer<Integer,Integer> integerMult=(a,b)-> System.out.println(a*b);
      integerMult.accept(7, 7);
      
      BiConsumer<String, String> stringLength=(str1,str2)->System.out.println(str1.length()+str2.length());
      stringLength.accept("Anusha","Reddy");
      
      BiConsumer<String, String> stringConcat=(str1,str2)->System.out.println(str1.concat(str2));
      stringConcat.accept("Anusha", "SrinivasReddy");
      
      integerAdd.andThen(integerMult).accept(9,5);
      stringLength.andThen(stringConcat).accept("Amma", "Nanna");
      
      System.out.println("-----------------------------------------");
      
      BiConsumer<Personn,Personn> salhob=(sal,hob)->{System.out.println("Salary :"+sal.getSalary());
      System.out.println("Hobbies :" +hob.getHobbies());
      };
      List <Personn> personlist = PersonRepository.getAllPersons();
      personlist.forEach(person->salhob.accept(person,person));
      
      System.out.println("-----------------------------------------");
      
      BiConsumer<Personn,Personn> namesal=(name,sal)->{System.out.println("Name is :"+name.getName());
    	 System.out.println("Sal is :"+sal.getSalary());
    	 };
      List<Personn> personList=	 PersonRepository.getAllPersons();
      personList.forEach(person->namesal.accept(person, person));
	}

}
