package pack1;


public class ControlSatements {

	public static void main(String[] args) {
		String day="Sunday";
		if(day=="Sunday" || day=="Saturday") 
		{
			System.out.println("It's Weekend");
		}
		else 
		{
			System.out.println("It's weekday");
		}
		
		//If task2
		
		int totalMoney=100;
        int price=50;
        if(price<=totalMoney) 
        {
        	System.out.println("Yummy");
        }
        else 
        {
        	System.out.println("let me buy next time");
        }
        
        //task 3 on nestedif
        
	    int budget = 50;
    
        if (budget >= 50)
        {
        System.out.println("Afford an iPhone");
        } else if (budget >= 25)
        {
        System.out.println("Afford a Redmi");
        } else if (budget >= 10)
        {
        System.out.println("Afford a Nokia");
        } else
        {
        System.out.println("Return home");
        }
        
         //task 4 on Switch
        
        char grade='A';
        switch(grade) 
        {
        case 'A':
        	System.out.println("OutStanding");
        	break;
        case 'B' :
        	System.out.println("Excellent");
        	break;
        case 'C':
        	System.out.println("Very Good");
        	break;
        case 'D':
        	System.out.println("Good");
        	break;
        default:
        	System.out.println("Work Hard");
        }
}
}
