package pack1;

import java.util.Optional;

public class OptionalNullableDemo {

	public static void main(String[] args) {
           String[] str=new String[5];
           str[1]="AnushaReddy";
           str[2]="SrinivasReddy";
           
           Optional<String> value=Optional.of(str[1]);
           System.out.println(value);
           System.out.println(value.get());
           
           //Nullpointer exception occurs
           /*Optional<String> value1=Optional.of(str[3]);
            //Exception
            System.out.println(value1);
           System.out.println(value1.get());*/
           System.out.println("--------------------------------------------");
           
           Optional<String> value2=Optional.ofNullable(str[2]);
           System.out.println(value2);
           System.out.println(value2.get());
           
           System.out.println("*******");
           
           Optional<String> value3=Optional.ofNullable(str[4]);
           System.out.println(value3);
           //Exception
           //System.out.println(value3.get());
           
           //isEmpty and isPresent
           if(value.isPresent()) 
           {
        	   System.out.println("&&&&&&&");
           }
           if(value3.isEmpty()) 
           {
        	  System.out.println("@@@@@@@@"); 
           }
           
	}

}
