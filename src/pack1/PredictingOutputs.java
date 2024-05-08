package pack1;

public class PredictingOutputs {

	public static void main(String[] args) {
		String word ="java";
		String Word = " comp";
		//String word@ = “java string”; Error
		//String word12 = “java string”;  Double Quotes
		//String word12 = “java string”; quotes
		//String 12word = “java string”; Cannot start with numbers
		//String int = “java”; int
		//String *java = “java”; *
		//String symbol$ = “100 dollars; quotes
		//String word ="java"; duplicate variabe
		//String word = " comp"; duplicate variable
		//String word_ =”java”; quotes
		//String word- =”java is here”;  special character
		//String capital; = “delhi”;  semi colon
		
		
		int a = 9;

		a++; //a=10

		System.out.println (a);//10

		a--;// a=9

		System.out.println (a);//9

		++a;//a=10

		System.out.println (a);//10

		System.out.println (a++);//10 a=11

		System.out.println (a--);//11 a=10

		System.out.println (--a);//9 a=9

		System.out.println (++a);//10
		System.out.println("-------------------------------------");
		
		String str = ("Hi");
		
		switch (str) {
		case "Hi" :
		case "Hey":
		System.out .println( "Hlo" );
		break;
		default:
		System.out .println( "ERROR! " );//Error!
		}
		
		
		System.out.println("-------------------------------------");
		
		
		
		int num2 = 5, num3 = 20, largestNumber;
		int num1=10;
		if (num1 >= num2)
		{
		   if (num1 >= num3) 
		   {
		      largestNumber = num1;
		   }     
		   else {
		       largestNumber = num3;
		    }
		} 
		else {
			if(num2>=num3)
			{
			  largestNumber=num2;
			}
			else {
				largestNumber=num2;
			}
		}
		System.out.println("Largest number is :"+largestNumber);//largest number is 20
		
		
		
		System.out.println("-------------------------------------");
		
		
		
		
			int age = 25;
			if(age > 0)
			{
			   if(age > 16)
			   {
			     System.out .println( "Welcome!");//Welcome
			   }
			   else
			   {
			      System.out.println( "Too Young");
			   } 
			}
			else 
			  {
				System.out.println( "Error");
			  }
			
		
			
			
			System.out.println("-------------------------------------");
			
			
			
			
		
	}

}
