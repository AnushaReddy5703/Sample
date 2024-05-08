package pack1;

public class Even {

		public static boolean isEven(int number) {
	        
	        return number % 2 == 0;
	    }

	    public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 7;

	        System.out.println(num1 + " is even: " + isEven(num1)); 
	        System.out.println(num2 + " is even: " + isEven(num2)); 

	}

}
